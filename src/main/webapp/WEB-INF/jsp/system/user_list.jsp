<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
	<link rel="stylesheet" type="text/css" href="../../../staticpage/images/styles.css">
  </head>
  <body>
  <div class="div1">
		<table width="100%" cellpadding="0" cellspacing="0" border="0"
			align="center">
			<tr>
				<td class="td_title1">·当前位置：系统管理&gt;&gt; 查看所有管理员&gt;&gt;所有用户
				</td>
			</tr>
			<tr>
				<td bgcolor="#FFFFFF" height="50">
					<br>
      <table border="1" align="center" width="500" cellpadding="1" cellspacing="1" bgcolor="#036500" bordercolor="#FFFFF">
        <tr bgcolor="#FFFFFF">
          <td class="tb_tl">ID</td>
          <td class="tb_tl">用户名</td>
          <td class="tb_tl">创建时间</td>
          <td class="tb_tl">操作</td>
        </tr>
		<c:forEach items="${users}" var="user">
			<tr bgcolor="#FFFFFF">
				<td>${user.id}</td>
				<td>${user.username}</td>
				<td>${user.createTime}</td>
				<td><a href="../yyxt/delete.action?id=${user.id}">删除</a>
				</td>

			</tr>
		</c:forEach>
      </table>
      <br>
      </td>
			</tr>
		</table>
	</div>
  </body>
</html>
