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
				<td class="td_title1">·当前位置：系统管理&gt;&gt; 修改密码</td>
			</tr>
			<tr>
                <td bgcolor="#FFFFFF" height="50">
					<br>
    <form action="../yyxt/changepassword.action" method="post" >
        <input type="hidden" name="command" value="changePasswordById" />
        <input type="hidden" name="id" value="${sessionScope.id}">
        <table border="0" align="center" width="450">
        <tr>
          <td align="right">原密码：</td>
          <td align="left">          	
          <%--	<html:hidden property="id" value="${id}"/>--%>
              <input type="password" name="password"/>
          </td>
        </tr>
          <tr>
          <td align="right">密码 ：</td>
          <td align="left"><input type="password" name="newpassword"/></td>
        </tr>
         <tr>
          <td align="right">确认密码：</td>
          <td align="left"><input type="password" name="renewpassword"/></td>
        </tr>
        <tr>
          <td align="center" colspan="2"><input type="submit" value="提交"/> </td>
        </tr>
      </table>
    </form>
    </td>
			</tr>
		</table>
	</div>
  </body>
</html>
