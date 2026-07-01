<%-- 
    Document   : unauthorise_error
    Created on : 22 May 2026, 1:27:51 AM
    Author     : Ryan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Unauthorized Error Page</title>
    </head>
    <body>
        <h1>Unauthorized Error</h1>
        <p>
            You are not permitted access to this page.
        </p>
        <ul>
                <li><a href="menu.jsp"><b>Menu Page</b></a></li>
                <li><a href="EndSessionServlet.do"><b>Logout</b></a></li>
        </ul>
        </p>
    </body>
</html>
