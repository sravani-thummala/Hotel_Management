<%-- 
    Document   : NewFood_Entry
    Created on : 21 Jan, 2019, 1:04:01 PM
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
 <h1><center>New Food Entry Form</center></h1>
 <form>
        <table align="center">
  
             <tr>
               <td>Dish Name </td>
               <td> <input type="text" name="Dishname"></td>
           </tr>
           
            <tr>
               <td>Food Type  </td>
               <td> <select>
                  <option value="Breakfast">Breakfast</option>
                  <option value="Lunch">Lunch</option>
                  <option value="Dinner">Dinner</option>
                   </select></td>
            </tr>
               
            <tr>
               <td>Select Category  </td>
               <td><select>
                  
                   </select></td>
            </tr>
               
            <tr>
               <td>Enter Price </td>
               <td> <input type="text" name="Price">
            </tr>
            
           <tr>
               <td> <input type="submit" name="SAVE"></td>
           </tr>
            
  </table>    </form>    </body>
</html>
