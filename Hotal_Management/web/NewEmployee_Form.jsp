<%-- 
    Document   : NewEmployee_Form
    Created on : 21 Jan, 2019, 8:52:18 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color:powderblue">
<h1><center>Employee Form</center></h1>
 <form>
        <table align="center">
  
             <tr>
                  <td>Enter Employee Name </td>
                 <td> <input type="text" name="empname"></td>
             </tr> 
             
             <tr>
                  <td>Address </td>
                  <td> <textarea  align="center" name="Address" rows="4" cols="30" ></textarea></td>
             </tr>
             
             <tr>
                  <td>Father's Name </td>
                 <td> <input type="text" name="fathername"></td>
             </tr>
             
             <tr>
                  <td> DOB </td>
                 <td> <input type="text" name="DOB"></td>
             </tr> 
             
             <tr>
                  <td>Mobile </td>
                 <td> <input type="text" name="Mobile"></td>
             </tr>
             
             <tr>
                  <td>MailId </td>
                 <td> <input type="text" name="MailId"></td>
             </tr> 
             
             <tr>
                  <td>Experience </td>
                 <td> <input type="text" name="Experience"></td>
             </tr>
             
             <tr>
                  <td>Designation </td>
                  <td> <select>
                          
                      </select></td>
             </tr>
             
             <tr>
                 <td align="right"> <input type="submit" value="SAVE"></td>
             </tr>
        </table>
 </form>
        </body>
</html>
