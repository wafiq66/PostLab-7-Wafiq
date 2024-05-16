<%-- 
    Document   : ComputeResult
    Created on : May 17, 2024, 12:49:03 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compute Tax</title>
    </head>
    <body>
        <table>
            <tr>
                <td>Net Amount (excluding tax)</td>
                <td><jsp:getProperty name="productItem" property="price"/></td>
            </tr>
            <tr>
                <td>Tax (<jsp:getProperty name="productItem" property="taxValue"/>%)</td>
                <td><jsp:getProperty name="productItem" property="taxValue"/></td>
            </tr>
            <tr>
                <td>Gross Amount (including tax)</td>
                <td><jsp:getProperty name="productItem" property="grossAfterTax"/></td>
            </tr>
        </table>
    </body>
</html>
