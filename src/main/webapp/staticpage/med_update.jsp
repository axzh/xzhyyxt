<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="images/styles.css">
</head>
<body>
<div class="div1">
    <table width="100%" cellpadding="0" cellspacing="0" border="0"
           align="center">
        <tr>
            <td class="td_title1">·当前位置：医药管理&gt;&gt; 更新药品</td>
        </tr>
        <tr>
            <td bgcolor="#FFFFFF" height="50">
                <br>
                <form action="${pageContext.request.contextPath}/yyxt/update1/${id}" method="post">
                    <table border="0" align="center" width="450">
                        <tr>
                            <td align="right">药品编码：</td>
                            <td align="left"><input type="text" name="medNo" value="${medNo}" disabled/></td>
                        </tr>
                        <tr>
                            <td align="right">药品名称：</td>
                            <td align="left"><input type="text" name="name" value="${name}" disabled/></td>
                        </tr>
                        <tr>
                            <td align="right">价格：</td>
                            <td align="left"><input type="text" name="price" value="${price}" disabled/></td>
                        </tr>
                        <tr>
                            <td align="right">库存数量：</td>
                            <td align="left">
                                <input type="text" name="medCount" value="${count}"/>
                                <font color="red">目前：${count}</font>
                            </td>
                        </tr>
                        <tr>
                            <td align="right">出厂地址：</td>
                            <td align="left"><html:textarea property="factoryAdd" cols="30" rows="3"
                                                            readonly="true"></html:textarea><input type="text"
                                                                                                   name="factoryAdd"
                                                                                                   value="${add}"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right">描述：</td>
                            <td align="left"><input type="text" name="description" value="${des}"/></td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center"><input type="submit" value="提交"/></td>
                        </tr>
                    </table>
                </form>
            </td>
        </tr>
    </table>
</div>
</body>
</html>
