/**
 * Created by Administrator on 2018/1/26.
 */

function ajax(method, url, params, sync, fun) {
    var xmlHttp;
    if (window.XMLHttpRequest) {
        xmlHttp = new XMLHttpRequest();

    } else if (window.XMLHttpRequest) {

        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    if (params != null) {
        var p = "";
        var i = 0;
        for (a in params) {
            if (i >= 1) {
                p += "&";
            }
            p += ( a + "=" + params[a]);
            i++;
        }
    }
    if (method.trim().toLowerCase() == "get") {

        if (params != null) {
            xmlHttp.open(method, url + "?" + p, sync);
        } else {
            xmlHttp.open(method, url, sync);
        }
        xmlHttp.send();

    } else if (method.trim().toLowerCase() == "post") {

        xmlHttp.open(method, url, sync);
        xmlHttp.send(p);
    } else {

        return "error";
    }

    xmlHttp.onreadystatechange = result;
    return xmlHttp.responseText;

    function result() {
        fun(xmlHttp.responseText, xmlHttp.readyState, xmlHttp.status);
    }

}