package com.windows3.util;

/**
 * Created by 3 on 2018/3/5.
 */


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Date;

public class GenEntityOracle {

    // ָ��ʵ���������ڰ���·��
    private String packageOutPath = "main.java.com.windows3.po";
    // ��������
    private String authorName = "3";
    // ���ݿ����APPLY_FOR_MESSAGE
    private String tablename = "train_son";
    // ��������
    private String[] colnames;
    // ������������
    private String[] colTypes;
    // ������С����
    private int[] colSizes;
    // �Ƿ���Ҫ�����java.util.*
    private boolean f_util = false;
    // �Ƿ���Ҫ�����java.sql.*
    private boolean f_sql = false;

    // ���ݿ�����
    private static final String URL = "jdbc:oracle:thin:@//localhost:1521/orcl";
    private static final String NAME = "manpower_resource";
    private static final String PASS = "m123456";
    private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";

    /*
     * ���캯��
     */
    public GenEntityOracle() {
        // ��������
        Connection con = null;
        // ��Ҫ����ʵ����ı�
        String sql = "select * from " + tablename;
        Statement pStemt = null;
        try {
            try {
                Class.forName(DRIVER);
            } catch (ClassNotFoundException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            con = DriverManager.getConnection(URL, NAME, PASS);
            pStemt = (Statement) con.createStatement();
            ResultSet rs = pStemt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int size = rsmd.getColumnCount(); // ͳ����
            colnames = new String[size];
            colTypes = new String[size];
            colSizes = new int[size];
            for (int i = 0; i < size; i++) {
                colnames[i] = rsmd.getColumnName(i + 1);
                colTypes[i] = rsmd.getColumnTypeName(i + 1);

                if (colTypes[i].equalsIgnoreCase("date")
                        || colTypes[i].equalsIgnoreCase("timestamp")) {
                    f_util = true;
                }
                if (colTypes[i].equalsIgnoreCase("blob")
                        || colTypes[i].equalsIgnoreCase("char")) {
                    f_sql = true;
                }
                colSizes[i] = rsmd.getColumnDisplaySize(i + 1);
            }

            String content = parse(colnames, colTypes, colSizes);

            try {
                File directory = new File("");
                String path = this.getClass().getResource("").getPath();

                System.out.println(path);
                System.out.println("src/?/"
                        + path.substring(path.lastIndexOf("/com/",
                        path.length())));
                // String outputPath = directory.getAbsolutePath()+
                // "/src/"+path.substring(path.lastIndexOf("/com/",
                // path.length()), path.length()) + initcap(tablename) +
                // ".java";
                String outputPath = directory.getAbsolutePath() + "/src/"
                        + this.packageOutPath.replace(".", "/") + "/"
                        + initcap(tablename) + ".java";
                FileWriter fw = new FileWriter(outputPath);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(content);
                pw.flush();
                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * ���ܣ�����ʵ�����������
     *
     * @param colnames
     * @param colTypes
     * @param colSizes
     * @return
     */
    private String parse(String[] colnames, String[] colTypes, int[] colSizes) {
        StringBuffer sb = new StringBuffer();

        sb.append("package " + "com.windows3.po" + ";\r\n");
        sb.append("\r\n");
        // �ж��Ƿ��빤�߰�
        if (f_util) {
            sb.append("import java.sql.Timestamp;\r\n");
        }
        if (f_sql) {
            sb.append("import java.sql.*;\r\n");
        }
        // ע�Ͳ���
        sb.append("/**\r\n");

        sb.append("* Created by 3 on 2018/3/15." + "\r\n");
        sb.append("*/ \r\n");
        // ʵ�岿��
        sb.append("\r\n\r\npublic class " + initcap(tablename) + "{\r\n");
        processAllAttrs(sb);// ����
        processAllMethod(sb);// get set����
        sb.append("}\r\n");

        // System.out.println(sb.toString());
        return sb.toString();
    }

    /**
     * ���ܣ�������������
     *
     * @param sb
     */
    private void processAllAttrs(StringBuffer sb) {

        for (int i = 0; i < colnames.length; i++) {
            sb.append("\tprivate " + sqlType2JavaType(colTypes[i]) + " "
                    + columToJave(colnames[i]) + ";\r\n");
        }

    }

    /**
     * �����ֶα��Java����
     *
     * @param string
     * @return
     */
    private String columToJave(String string) {
        String string2 = string.toLowerCase();
        StringBuilder builder = new StringBuilder(string2);

        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == '_') {
                // ��һ�γ��ָ÷��ŵ�λ��
                char c = builder.charAt(i + 1);
                c = (char) (c - 32);
                StringBuilder replace1 = builder.replace(i + 1, i + 2, c + "");
                builder = replace1.replace(i, i + 1, "");

                // ���һ�γ��ָ÷��ŵ�λ��
                int of = builder.lastIndexOf("_", string2.length());
                if (of != -1) {
                    char c1 = builder.charAt(of + 1);
                    c1 = (char) (c1 - 32);
                    StringBuilder replace2 = builder.replace(of + 1, of + 2, c1
                            + "");
                    builder = replace2.replace(of, of + 1, "");
                    ;
                }

            }
        }
        return builder.toString();
    }

    /**
     * ���ܣ��������з���
     *
     * @param sb
     */
    private void processAllMethod(StringBuffer sb) {

        for (int i = 0; i < colnames.length; i++) {
            sb.append("\tpublic void set" + initcaps(columToJave(colnames[i]))
                    + "(" + sqlType2JavaType(colTypes[i]) + " "
                    + columToJave(colnames[i]) + "){\r\n");
            sb.append("\t\tthis." + columToJave(colnames[i]) + "="
                    + columToJave(colnames[i]) + ";\r\n");
            sb.append("\t}\r\n");
            sb.append("\tpublic " + sqlType2JavaType(colTypes[i]) + " get"
                    + initcaps(columToJave(colnames[i])) + "(){\r\n");
            sb.append("\t\treturn " + columToJave(colnames[i]) + ";\r\n");
            sb.append("\t}\r\n");
        }

    }

    /**
     * ���ܣ��������ַ���������ĸ�ĳɴ�д
     *
     * @param
     * @return
     */
    private String initcap(String string2) {
        String str = columToJave(string2);
        char[] ch = str.toCharArray();
        if (!string2.contains("_")) {
            ch[0] = (char) (ch[0] - 32);
        } else {
            for (int j = 0; j < 3; j++) {
                ch[j] = (char) (ch[j] - 32);
            }
        }
        return new String(ch);
    }

    private String initcaps(String str) {
        char[] ch = str.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z') {
            ch[0] = (char) (ch[0] - 32);
        }

        return new String(ch);
    }

    /**
     * ���ܣ�����е���������
     *
     * @param sqlType
     * @return
     */
    private String sqlType2JavaType(String sqlType) {

        if (sqlType.equalsIgnoreCase("binary_double")) {
            return "double";
        } else if (sqlType.equalsIgnoreCase("binary_float")) {
            return "float";
        } else if (sqlType.equalsIgnoreCase("blob")) {
            return "byte[]";
        } else if (sqlType.equalsIgnoreCase("blob")) {
            return "byte[]";
        } else if (sqlType.equalsIgnoreCase("char")
                || sqlType.equalsIgnoreCase("nvarchar2")
                || sqlType.equalsIgnoreCase("varchar2")) {
            return "String";
        } else if (sqlType.equalsIgnoreCase("date")
                || sqlType.equalsIgnoreCase("timestamp")
                || sqlType.equalsIgnoreCase("timestamp with local time zone")
                || sqlType.equalsIgnoreCase("timestamp with time zone")) {
            return "Timestamp";
        } else if (sqlType.equalsIgnoreCase("number")) {
            return "Integer";
        }

        return "String";
    }

    /**
     * ���� TODO
     *
     * @param args
     */
    public static void main(String[] args) {

        new GenEntityOracle();

    }

}
