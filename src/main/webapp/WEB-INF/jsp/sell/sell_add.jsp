<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/staticpage/images/styles.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/staticpage/jquery/jquery-1.5.1.js"></script>
    <script type="text/javascript">
        function checkForm() {
            if ($("#medCount").val() >${count}) {
                alert("库存不足请重新选择数量");
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
            <td class="td_title1">·当前位置：购买药品&gt;&gt; 选购药品
            </td>
        </tr>
        <tr>
            <td bgcolor="#FFFFFF" height="50">
                <br>
                <form action="${pageContext.request.contextPath}/yyxt/sellCount/${medicine.id}" method="post"
                      onsubmit="return checkForm()">
                    <table border="0" align="center" width="500">
                        <tr>
                            <td align="right">药品名称：</td>
                            <td align="left">
                                <input type="text" name="" value="${medicine.name}" disabled/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right">价格：</td>
                            <td align="left"><input type="text" name="" value="${medicine.price}" disabled/></td>
                        </tr>
                        <tr>
                            <td align="right">数量：</td>
                            <td align="left"><input type="text" id="medCount" name="medCount"/>
                                <font color="red">目前：${count}</font>
                            </td>
                        </tr>
                        <tr>
                            <td align="right">出厂地址：</td>
                            <td align="left"><input type="text" name="" value="${medicine.factoryAdd}" disabled/></td>
                        </tr>
                        <tr>
                            <td align=" center" colspan="2"><input type="submit" value="结帐"/></td>
                        </tr>
                    </table>
                </form>
            </td>
        </tr>
    </table>
</div>
</body>
</html>
