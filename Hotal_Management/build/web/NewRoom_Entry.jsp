<%-- 
    Document   : NewRoom_Entry
    Created on : 21 Jan, 2019, 3:45:01 PM
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
<h1><center>New Room Entry Form</center></h1>
 <form>
        <table align="center">
  
             <tr>
               <td>New Room  No : </td>
               <td> <input type="text" name="Dishname"></td>
           </tr>
           
            <tr>
               <td>Select Category  </td>
               <td> <select>
                  
                   </select></td>
            </tr>
               
            <tr>
               <td>AC Type  </td>
               <td><select>
                  
                   </select></td> <td> <button>OK</button></td>

            </tr>
               
            <tr>
               <td>Rent </td>
               <td> <input type="text" name="Rent">
            </tr>
            
            <tr>
               <td>Availability  </td>
               <td> <select>
                  <option value="Avaialable">Available</option>
                  <option value="Occupied">Occupied</option>
                   </select></td>
            </tr>
            
           <tr>
               <td> <input type="submit" value="save"></td>
           </tr>
            
  </table>    </form>     </body>
</html>
