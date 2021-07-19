<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="pg" uri="http://xuzhihao.cn/common/" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
            <td class="td_title1">·当前位置：医药管理&gt;&gt; 查看药品&gt;&gt; 所有药品</td>
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
                                        <form action="${pageContext.request.contextPath}/yyxt/query1.action"
                                              method="post"
                                              onsubmit="return blurQuery();"
                                              class="blur_form">
                                            <input type="hidden" name="command" value="blurQuery"/>
                                            模糊查询：<input name="name" type="text" size="20" value=""/>
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
                        <td class="tb_tl">单价</td>
                        <td class="tb_tl">库存数量</td>
                        <td class="tb_tl">出厂地址</td>
                        <td class="tb_tl">操作</td>
                    </tr>
                    <c:forEach items="${page.rows}" var="row">
                        <tr bgcolor="#FFFFFF">
                            <td>${row.id}</td>
                            <td>${row.medNo}</td>
                            <td>${row.name}</td>
                            <td>${row.price}</td>
                            <td>${row.medCount}</td>
                            <td>${row.factoryAdd}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/yyxt/forword1/${row.id}/${row.name}/${row.medNo}/${row.price}/${row.medCount}/${row.factoryAdd}/${row.description}">修改</a>&nbsp;
                                <a href="${pageContext.request.contextPath}/yyxt/delete1/${row.id}"
                                   onclick="return confirm('确实要删除该要药品吗?')">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                    <tr bgcolor="#FFFFFF">
                        <td>
                            <div class="col-md-12 text-right">
                                <pg:page url="../../yyxt/medicinePage"/>
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
