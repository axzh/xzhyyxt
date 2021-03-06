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
            <td class="td_title1">·当前位置：类别管理&gt;&gt;查看类别&gt;&gt;所有类别</td>
        </tr>
        <tr>
            <td bgcolor="#FFFFFF" height="50">
                <br>
                <table border="1" align="center" width="700" cellpadding="1" cellspacing="1" bgcolor="#036500"
                       bordercolor="#FFFFF">
                    <tr bgcolor="#FFFFFF">
                        <td class="tb_tl">类别编号</td>
                        <td class="tb_tl">类别名称</td>
                        <td class="tb_tl">类别描述</td>
                        <td class="tb_tl">创建时间</td>
                        <td class="tb_tl">操作</td>
                    </tr>
                    <c:forEach items="${page.rows}" var="row">
                        <tr bgcolor="#FFFFFF">
                            <td>
                                    ${row.id}
                            </td>
                            <td>
                                    ${row.name}
                            </td>
                            <td>
                                    ${row.description}
                            </td>
                            <td>
                                    ${row.createTime}
                            </td>
                            <td>
                                <a href="${pageContext.request.contextPath}/yyxt/forword2/${row.name}/${row.description}/${row.id}">修改</a>&nbsp;
                                <a href="${pageContext.request.contextPath}/yyxt/delete2/${row.id}"
                                   onclick="return confirm('确实要删除该要药品吗?')">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                    <tr bgcolor="#FFFFFF">
                        <td>
                            <div class="col-md-12 text-right">
                                <pg:page url="../../yyxt/redirect8.action"/>
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
