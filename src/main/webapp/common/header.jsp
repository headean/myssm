<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<!-- <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> -->  
<%  
    String path = request.getContextPath();  
    String basePath = request.getScheme() + "://"  
            + request.getServerName() + ":" + request.getServerPort()  
            + path + "/";  
    pageContext.setAttribute("basePath",basePath);    
%>