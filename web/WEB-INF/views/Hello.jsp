<%--
  Created by IntelliJ IDEA.
  User: dmancilla
  Date: 2/17/2017
  Time: 2:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%String server =  request.getServerName();
String port = String.valueOf(request.getServerPort());
String myServer = server + ":" + port;
%>
Server Page: <b>http://<%=myServer%>/Spring/get</b>
</body>
</html>
