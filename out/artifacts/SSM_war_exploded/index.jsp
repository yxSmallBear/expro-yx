<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/1
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*" pageEncoding="UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <title>联合国登录系统</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/index.css">
    <meta name="viewport" content="width=device-width,height=device-height,initial-scale=1.0,user-scalable=no,minimum-scale=1.0,maximum-scale=1.0"/>
  </head>
  <body>
  <h1>联合国登录系统</h1>
  <form action="/login/auth" method="post">
    <div class="username">
      <span>UserName:</span> <input type="text" name="name">
    </div>
    <div class="password">
      <span>PassWord:</span> <input type="password" name="pwd">
    </div>
    <button type="submit">提交</button>
  </form>
  </body>
</html>
