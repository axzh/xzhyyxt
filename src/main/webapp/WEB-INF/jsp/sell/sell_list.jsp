<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="common" uri="http://xuzhihao.cn/common/" %>
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
				<td class="td_title1">·当前位置：销售管理&gt;&gt;销售明细
				</td>
			</tr>
			<tr>
				<td bgcolor="#FFFFFF" height="50">
					<br>
      <table border="1" align="center" width="700" cellpadding="1" cellspacing="1" bgcolor="#036500" bordercolor="#FFFFF">
        <tr bgcolor="#FFFFFF">
          <td colspan="8" align="center">
          		<table border="0" width="100%">
          			<tr>
          				<td align="left">
          					<form name="queryForm" action="../../yyxt/querySelldetailBySellname.action" method="post" class="blur_form">
          						<input type="hidden" name="command" value="blurQuery"/>
          						模糊查询：<input name="keyWord" type="text" size="20" placeholder="按名称"/>
          						<input type="submit" value="查询"/>
          					</form>
          				</td>
          			</tr>
          		</table>
          </td>
        </tr>
        <tr bgcolor="#FFFFFF" >
          <td class="tb_tl">销售编号</td>
          <td class="tb_tl">药品名称</td>
          <td class="tb_tl">价格</td>
          <td class="tb_tl">数量</td>
          <td class="tb_tl">金额</td>
          <td class="tb_tl">销售时间</td>
          <td class="tb_tl">操作员</td>
        </tr>
		  <c:forEach items="${page.rows}" var="sell">


	        		<tr bgcolor="#FFFFFF">
	        			<td>${sell.id}</td>
	        			<td><a href="../../yyxt/ViewDetail.action/${sell.medid}">${sell.sellName}</a></td>
	        			<td>${sell.sellPrice}</td>
	        			<td>${sell.sellCount}</td>
	        			<td>${sell.sellPrice*sell.sellCount}</td>
	        			<td>${sell.sellTime}</td>
	        			<td><c:forEach items="${userlist}" var="user">
							<c:if test="${sell.userid eq user.id}">${user.username}</c:if>
						</c:forEach></td>
	        		</tr>
		  </c:forEach>
	        	<tr bgcolor="#FFFFFF">		        
		          <td colspan="8" align="right">
		          	<table border="0" width="100%">
		          		<tr>
							<td>
								<div class="col-md-12 text-right">
									<common:page url="../../yyxt/${QueryVourl}" ></common:page>


								</div>
							</td>
		          		</tr>
		          	</table>
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
