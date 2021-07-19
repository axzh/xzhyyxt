<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title><bean:message key="system.category.medicine.query"/></title>
    <link rel="stylesheet" type="text/css" href="../../../staticpage/images/styles.css">
</head>
<body>
<div class="div1">
    <table width="100%" cellpadding="0" cellspacing="0" border="0" align="center">
        <tr>
            <td class="td_title1">·当前位置：医药管理&gt;&gt;高级查询</td>
        </tr>
        <tr>
            <td bgcolor="#FFFFFF" height="50">
                <br>
                <form action="${pageContext.request.contextPath}/yyxt/query2" method="post" focus="name">
                    <table border="0" align="center" width="450">
                        <tr>
                            <td align="right">药品编码：</td>
                            <td align="left"><input type="text" name="medNo"/></td>
                        </tr>
                        <tr>
                            <td align="right">药品名称：</td>
                            <td align="left"><input type="text" name="name"/></td>
                            </td>
                        </tr>
                        <tr>
                            <td align="right">出厂地址：</td>
                            <td align="left"><input type="text" name="factoryAdd"/></td>
                            </td>
                        </tr>
                        <tr>
                            <td align="right">描述：</td>
                            <td align="left"><input type="text" name="description"/></td>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <input type="submit" value="提交"/></td>
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
