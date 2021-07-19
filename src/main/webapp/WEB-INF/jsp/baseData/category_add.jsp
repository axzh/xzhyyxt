<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../../staticpage/images/styles.css">
    <script type="text/javascript" src="../../../staticpage/jquery/jquery-1.5.1.js"></script>
    <script type="text/javascript">
        function checkForm() {
            if (!$("#name").val()) {
                alert("分类名不能为空！");
                return false;
            }
            if (!$("#description").val()) {
                alert("分类描述不能为空！");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
<div class="div1">
    <table width="100%" cellpadding="0" cellspacing="0" border="0"
           align="center">
        <tr>
            <td class="td_title1">·当前位置：类别管理&gt;&gt;添加类别</td>
        </tr>
        <tr>
            <td bgcolor="#FFFFFF" height="50">
                <br>
                <form action="../../yyxt/addCategory.action" method="post" onsubmit="return checkForm()">
                    <table border="0" align="center" width="500">
                        <tr>
                            <td align="right">类别名称：</td>
                            <td align="left">
                                <input type="text" id="name" name="name"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right">类别描述：
                            </td>
                            <td align="left">
                                <input type="text" id="description" name="description"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <input type="submit" value="提交"/>
                            </td>
                        </tr>
                    </table>
                </form>
            </td>
        </tr>
    </table>
</div>
</body>
</html>
