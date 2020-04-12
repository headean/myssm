<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%  
    String path = request.getContextPath();  
    String basePath = request.getScheme() + "://"  
            + request.getServerName() + ":" + request.getServerPort()  
            + path + "/";  
    pageContext.setAttribute("basePath",basePath);    
%>

<!-- 引入EasyUI的样式文件-->
<link rel="stylesheet"
	href="<%=basePath %>/js/easyui/themes/default/easyui.css"
	type="text/css" />

<!-- 引入EasyUI的图标样式文件-->
<link rel="stylesheet"
	href="<%=basePath %>/js/easyui/themes/icon.css"
	type="text/css" />

<link rel="stylesheet"
	href="<%=basePath%>/js/common/inc.css"
	type="text/css" /> 

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 8]>
	<script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	<script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->


<!-- 引入JQuery -->
<script type="text/javascript"
	src="<%=basePath %>/js/easyui/jquery.min.js"></script>

<!-- 引入EasyUI -->
<script type="text/javascript"
	src="<%=basePath %>/js/easyui/jquery.easyui.min.js"></script>

<!-- 引入EasyUI的中文国际化js，让EasyUI支持中文 -->
<script type="text/javascript"
	src="<%=basePath %>/js/easyui/locale/easyui-lang-zh_CN.js"></script>
	