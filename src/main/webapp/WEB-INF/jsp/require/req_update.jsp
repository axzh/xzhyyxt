<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../../staticpage/images/styles.css">
</head>
<body>
<div class="div1">
    <table width="100%" cellpadding="0" cellspacing="0" border="0"
           align="center">
        <tr>
            <td class="td_title1">·当前位置：进货/需求管理 &gt;&gt; 更新需求</td>
        </tr>
        <tr>
            <td bgcolor="#FFFFFF" height="50">
                <br>
                <form action="../../yyxt/updateStock.action" method="post" >
                    <input type="hidden" name="id" value="${medicinedemand.id}"/>
                    <table border="0" align="center" width="500">
                        <tr>
                            <td align="right">药品编码：</td>
                            <td align="left"><input type="text" name="medNo" value="${medicinedemand.medNo}" disabled/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right">药品名称：</td>
                            <td align="left"><input type="text" name="name" value="${medicinedemand.name}" disabled/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right">价格：</td>
                            <td align="left"><input type="text" name="price" value="${medicinedemand.price}" disabled/>元
                            </td>
                        </tr>
                        <tr>
                            <td align="right">需求数量:</td>
                            <td align="left"><input type="text" name="demandcount"
                                                    value="${medicinedemand.demandcount}"/>
                                <font color="red">
                                    目前数量：<input type="text" name="medCount" value="${medicinedemand.medCount}"
                                                disabled/>
                                </font>
                            </td>
                        </tr>
                        <tr>
                            <td align="right">出厂地址：</td>
                            <td align="left"><input type="text" name="factoryAdd" value="${medicinedemand.factoryAdd}"
                                                    disabled/></td>
                        </tr>
                        <tr>
                            <td align="right">描述：</td>
                            <td align="left"><input type="text" name="description" value="${medicinedemand.description}"
                                                    disabled/></td>
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
