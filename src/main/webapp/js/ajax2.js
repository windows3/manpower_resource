/**
 * Created by 3 on 2018/1/30.
 */
var xmlhttp;
function createXmlHttp() {
    if (window.XMLHttpRequest) {
        xmlhttp = new XMLHttpRequest();
    } else {
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
}
function ajax2(method, url, params, sync, fun) {
    if (method.trim().toLowerCase() == "get") {
        get(url, params, sync, fun);
    } else if (method.trim().toLowerCase() == "post") {
        post(url, params, sync, fun);
    } else {
        new XMLHttpRequestException();
    }
}
function get(url, params, sync, fun) {
    createXmlHttp();
    if (params != null) {
        xmlhttp.open("get", url + "?" + parse(params), sync);
    } else {
        xmlhttp.open("get", url, sync);
    }
    xmlhttp.send();
    xmlhttp.onreadystatechange = result;
    function result() {
        fun(xmlhttp.responseText, xmlhttp.readyState, xmlhttp.status)
    }
}
function post(url, params, sync, fun) {
    createXmlHttp();
    xmlhttp.open("post", url, sync);
    if (params != null) {
        xmlhttp.send(parse(params))
    } else {
        xmlhttp.send()
    }

    xmlhttp.onreadystatechange = result;
    function result() {
        fun(xmlhttp.responseText, xmlhttp.readyState, xmlhttp.status)
    }
}
function parse(params) {
    var i = 0;
    var s;
    for (var a in params) {
        if (i >= 1) {
            s += "&";
            s += (a + "=" + params[a]);
        } else {
            s += (a + "=" + params[a]);
        }
        i++;
    }
    return s;
}
