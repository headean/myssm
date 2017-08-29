<%--
  Created by IntelliJ IDEA.
  User: heartbeat
  Date: 2017/8/18
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
    <script src="../../js/jquery-3.2.1.min.js"></script>
</head>
<body>
    hello test.jsp !!
    <input type="checkbox" id="1" name="checkboxd" onclick="radioRelation()">
    <input type="checkbox" id="2" name="checkboxd" onclick="radioRelation()">
    <input type="checkbox" id="3" name="checkboxd" onclick="radioRelation()">
    <input type="checkbox" id="4" name="checkboxd" onclick="radioRelation()">
    <input type="checkbox" id="5" name="checkboxd" onclick="radioRelation()">
</body>
<script type="text/javascript">
    alert("111")
    function radioRelation(){
        $('input[type=checkbox]').attr('checked','checked').siblings().removeAttr('checked');
    };
</script>
</html>
