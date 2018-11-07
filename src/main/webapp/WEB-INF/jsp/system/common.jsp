<%--
  Created by IntelliJ IDEA.
  User: MSI
  Date: 2018/10/31
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>

<% String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() ;
    request.setAttribute("basePath", basePath);%>
