<%-- 
    Document   : NewRoom_Category
    Created on : 21 Jan, 2019, 12:39:16 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><center>New Room Category</center></h1>
        <form>
            <table align="center">
            <tr>
               <td>Enter Room Category       </td>
               <td> <input type="text" name="Room Category"></td>
           </tr>
           
           <tr>
              <td>Select AC Type  </td>
              <td><select>
                  <option value="AC">AC</option>
                  <option value="Non-AC">Non-AC</option>
                  </select></td>
           </tr>

           <tr>
               <td>Rent       </td>
               <td> <input type="text" name="Rent"></td>
           </tr>
           
           <tr>
               <td> <input type="submit" value="SAVE"></td>
           </tr>
         
            </table>    </form>
    </body>
</html>
