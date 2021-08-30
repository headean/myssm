<%--
  Created by IntelliJ IDEA.
  User: haatin
  Date: 2021/8/30
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script
            src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%--<input type="button" value="导入" id="import">--%>
<form id="file_form" action="/file/upload" enctype="multipart/form-data"
      method="post">
    <input type="submit" value="上传" id='upFile-btn'>
    <input type="file" name="file" id="file_input"/>
</form>
</body>
<script type="text/javascript">
    $(function () {
        $("#import").click(function () {
           console.log('点击上传文件按钮');
           $("#file_input").click();
        });

        // $("#upFile-btn").click(function () {
        //     console.log('上传文件');
        //     $("#file_input").click();
        // });

        $("#file_form").submit(
            function () {
                //首先验证文件格式
                var fileName = $('#file_input').val();
                if (fileName === '') {
                    alert('请选择文件');
                    return false;
                }
                var fileType = (fileName.substring(fileName
                    .lastIndexOf(".") + 1, fileName.length))
                    .toLowerCase();
                if (fileType !== 'xls' && fileType !== 'xlsx') {
                    alert('文件格式不正确，excel文件！');
                    return false;
                }

                $("#file_form").ajaxSubmit({
                    dataType: "json",
                    success: function (data, textStatus) {
                        if (data['result'] === 'OK') {
                            console.log('上传文件成功');
                        } else {
                            console.log('文件格式错误');
                        }
                        return false;
                    }
                });
                return false;
            });
    });
</script>
</html>
