<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="common" uri="http://xuzhihao.cn/common/" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../../staticpage/images/styles.css">
    <link rel="stylesheet" type="text/css" href="../../../staticpage/images/bootstrap.min.css">
</head>
<body>
<div class="div1">
    <table width="100%" cellpadding="0" cellspacing="0" border="0"
           align="center">
        <tr>
            <td class="td_title1">·当前位置：进货/需求管理 &gt;&gt; 查看进货</td>
        </tr>
        <tr>
            <td bgcolor="#FFFFFF" height="50">
                <br>
                <table border="1" align="center" width="700" cellpadding="1" cellspacing="1" bgcolor="#036500"
                       bordercolor="#FFFFF">
                    <tr bgcolor="#FFFFFF">
                        <td colspan="9" align="center">
                            <table border="0" width="100%">
                                <tr>
                                    <td align="left">
                                        <form action="../../yyxt/queryStock.action" method="post" class="blur_form">
                                            模糊查询：<input name="keyWord" type="text" placeholder="请输入名称或者出场地址或者药品编码"
                                                        size="20"/>
                                            <input type="submit" value="查询"/>
                                        </form>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr bgcolor="#FFFFFF">
                        <td class="tb_tl">药品ID</td>
                        <td class="tb_tl">药品编码</td>
                        <td class="tb_tl">药品名称</td>
                        <td class="tb_tl">价格</td>
                        <td class="tb_tl">需求数量</td>
                        <td class="tb_tl">库存数量</td>
                        <td class="tb_tl">出厂地址</td>
                        <td class="tb_tl">操作</td>
                    </tr>
                    <c:forEach items="${page.rows}" var="medicinedemand">
                        <tr bgcolor="#FFFFFF">
                            <td>${medicinedemand.id}</td>
                            <td>${medicinedemand.medNo}</td>
                            <td>${medicinedemand.name}</td>
                            <td>${medicinedemand.price}元</td>
                            <td>${medicinedemand.demandcount}</td>
                            <td><c:forEach items="${medicinelist}" var="medicine">
                                <c:if test="${medicinedemand.medNo eq medicine.medNo}">${medicine.medCount}</c:if>
                            </c:forEach></td>
                            <td>${medicinedemand.factoryAdd}</td>
                            <td><a href="../../yyxt/toupdateStock.action/${medicinedemand.id}">修改</a>&nbsp;<a
                                    href="../../yyxt/deleteStock.action/${medicinedemand.id}">删除</a></td>

                        </tr>
                    </c:forEach>
                    <tr bgcolor="#FFFFFF">
                        <td>
                            <div class="col-md-12 text-right">
                                <common:page url="../../yyxt/${QueryVourl}"></common:page>
                            </div>
                        </td>
                    </tr>
                </table>
                <br>
            </td>
        </tr>
    </table>
</div>
</body>
</html>
