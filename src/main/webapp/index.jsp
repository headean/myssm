<%--
  Created by IntelliJ IDEA.
  User: heartbeat
  Date: 2017/8/22
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="../js/jquery-3.2.1.min.js"></script>
</head>
<body>
    Hello World  ! !Hello World  ! !
    <input type="checkbox" id="q1" name="checkbox" onclick="radioRelation(this)">
    <input type="checkbox" id="q2" name="checkbox" onclick="radioRelation(this)">
    <input type="checkbox" id="q3" name="checkbox" onclick="radioRelation(this)">
    <input type="checkbox" id="q4" name="checkbox" onclick="radioRelation(this)">
    <input type="checkbox" id="q5" name="checkbox" onclick="radioRelation(this)">
</body>
<script type="text/javascript">
    // alert("111")
    function radioRelation(obj){
        // alert(222)
        // $('input[type=checkbox]').attr('checked','checked').siblings().removeAttr('checked');
        var checks = document.getElementsByName("checkbox");

        if(obj.checked){
            for(var i=0;i<checks.length;i++){
                checks[i].checked = false;
            }
            obj.checked = true;
        }else {
            for(var i=0;i<checks.length;i++){
                checks[i].checked = false;
            }
        }
    };

//    $('inputp[type=checkbox]').click(function(){
//        alert("3");
//        $(this).attr('checked','checked').siblings().removeAttr('checked');
//    });
</script>
</html>
