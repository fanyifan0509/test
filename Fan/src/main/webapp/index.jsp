<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String ctx = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+ctx+"/";
    pageContext.setAttribute("ctx",ctx);
    pageContext.setAttribute("basePath",basePath);
    pageContext.setAttribute("web_resource",ctx+"/WEB_RESOURCES/");
%>
<%
    response.sendRedirect("user/toWelcome.do?id=1");
%>