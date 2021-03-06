<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
    <style type="text/css">
        <!--
        body {
            margin: 0px;
            font-size: 12px;
            background-color: #4C8C1C;
        }

        .tb1 {
            position: relative;
            top: -355;
            left: 280;
        }

        .it {
            background-color: #E1FFC1;
            height: 20px;
            width: 150px;
        }

        -->
    </style>
    <script language="javaScript">
        if (self != top) {
            alert("登录超时");
            top.location = self.location;
        }
    </script>
</head>
<body>
<table border="0" width="990" height="600" align="center" cellpadding="0" cellspacing="0">

    <tr>
        <td colspan="2" align="left" valign="top">
            <img src="images/login_zh.jpg" border="0" usemap="#Map">
            <form action="../yyxt/login.action" method="post">
                <table border="0" class="tb1">
                    <tr>
                        <td colspan="2" align="center">
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td align="right">用户名：</td>
                        <td><input id="username" name="username" type=="text" styleClass="it"/></td>
                    </tr>
                    <tr>
                        <td align="right">密码：</td>
                        <td><input id="password" name="password" type="password" styleClass="it"/></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center" height="30">
                            <input type="submit" value="登录"/>
                            <input type="reset" value="复原"/>
                        </td>
                    </tr>
                </table>
                </html:form>
        </td>
    </tr>
</table>

<map name="Map">
    <area shape="rect" coords="265,140,323,154" href="<html:rewrite page="/language.do?lan=zh"/>">
    <area shape="rect" coords="335,138,406,153" href="<html:rewrite page="/language.do?lan=en"/>">
</map>
</body>
</html>

