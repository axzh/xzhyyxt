<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="common" uri="http://xuzhihao.cn/common/" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../../staticpage/images/styles.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/staticpage/jquery/jquery-1.5.1.js"></script>
    <script type="text/javascript">
        function checkForm() {
            if (!$("#medNo").val()) {
                alert("药品编码不能为空！");
                return false;
            }
            if (!$("#name").val()) {
                alert("药品名不能为空！");
                return false;
            }
            if (!$("#price").val()) {
                alert("药品价格不能为空！");
                return false;
            }
            if (!$("#demandcount").val()) {
                alert("药品数量不能为空！");
                return false;
            }
            if (!$("#categoryId").val()) {
                alert("药品分类不能为空！");
                return false;
            }
            if (!$("#file").val()) {
                alert("图片不能为空！");
                return false;
            }
            if (!$("#factoryAdd").val()) {
                alert("药品地址不能为空！");
                return false;
            }
            if (!$("#description").val()) {
                alert("药品描述不能为空！");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
<div class="div1">
    <table width="100%" cellpadding="0" cellspacing="0" border="0" align="center">
        <tr>
            <td class="td_title1">·当前位置：进货/需求管理 &gt;&gt; 添加进货</td>
        </tr>
        <tr>
            <td bgcolor="#FFFFFF" height="50">
                <br>
                <form action="../../yyxt/addStock.action" method="post" enctype="multipart/form-data"
                      onsubmit="return  checkForm()">
                    <input type="hidden" value="id"/>
                    <table border="0" align="center" width="500">
                        <tr>
                            <td align="right">药品编码：</td>
                            <td align="left"><input type="text" name="medNo" id="medNo"/></td>
                        </tr>
                        <tr>
                            <td align="right">药品名称：</td>
                            <td align="left"><input type="text" name="name" id="name"/></td>
                        </tr>
                        <tr>
                            <td align="right">价格：</td>
                            <td align="left"><input type="text" name="price" id="price"/> 元</td>
                        </tr>
                        <tr>
                            <td align="right">数量 ：</td>
                            <td align="left"><input type="text" name="demandcount" id="demandcount"/></td>
                        </tr>
                        <tr>
                            <td align="right">所属类别：</td>
                            <td align="left">
                                <select name="categoryId" id="categoryId" >
                                    <c:forEach items="${categroylist}" var="category">
                                        <option value="${category.id}">${category.name}</option>
                                    </c:forEach>

                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td align="right">图片：</td>
                            <td align="left"><input type="file" name="file" id="file"/></td>
                        </tr>
                        <tr>
                            <td align="right">出厂地址：</td>
                            <td align="left"><input type="text" name="factoryAdd" id="factoryAdd"/></td>
                        </tr>
                        <tr>
                            <td align="right">描述：</td>
                            <td align="left"><input type="text" name="description" id="description"/></td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center"><input type="submit" value="提交"></td>
                        </tr>
                    </table>
                </form>
            </td>
        </tr>
    </table>
</div>
</body>
</html>
