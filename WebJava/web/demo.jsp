<%-- 
    Document   : demo
    Created on : Dec 20, 2016, 12:06:58 AM
    Author     : SUALAPTOP24h.NET
--%>
<%@page import="Model.sanpham"%>
<%@page import="Demo.Demo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <table id="table1" >
               <%
           Demo ds = new Demo();
            
           for (sanpham hs:ds.DanhSachHocSinh())
           {
        %>
        <tbody >
        <tr >
             <td width="200" style="text-align: center"><%=hs.getTenloai()%></td>
                 </tr>
              <tbody>
        <%
            }
         %>
        </table>
    </body>
</html>
