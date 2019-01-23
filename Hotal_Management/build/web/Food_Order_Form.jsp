<%-- 
    Document   : Food_Order_Form
    Created on : 21 Jan, 2019, 4:10:05 PM
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
<h1><center>Food Order Form</center></h1>
 <form>
        <table align="center">
  
            <tr>
               <td align="left">Order No : </td>
               <td align="left"> <input type="text" name="OrderNo"></td>
                <td align="right">Date </td>
                <td align="right"> <input type="text" name="Date"></td>
         
            <tr>
               <td>Select Room No  </td>
               <td> <select>
                   </select></td> <td> <button>OK</button></td>
            </tr>
            
             <tr>
               <td>Customer Name </td>
               <td> <input type="text" name="cusname">
            </tr>
            
            <tr>
               <td>Select Category  </td>
               <td><select>
                   </select></td>
            </tr>
               
            <tr>
               <td>Food Type  </td>
               <td> <select>
                    </select></td><td> <button>OK</button></td>
            </tr>
            
            <tr>
               <td>Dish Name  </td>
               <td><select>
                   </select></td><td> <button>OK</button></td>
            </tr>
            
            <tr>
               <td>Enter Price </td>
               <td> <input type="text" name="Price">
            </tr>
            
            <tr>
               <td>Rent </td>
               <td> <input type="text" name="Rent">
            </tr>
            
            <tr>
               <td>Quantity </td>
               <td> <input type="text" name="Quantity"><button>Add Food</button></td>
            </tr>
            
            <tr>
               <td align="left">Food to Order </td><br/><br/>
               <td align="left"><ol>
                    <li></li>
                    <li></li>
                    <li></li>
                     <li></li>
                    <li></li>
                </ol></td>
                <td align="center">Quantity </td>
                <td align="center"><ol>
                    <li></li>
                    <li></li>
                    <li></li>
                     <li></li>
                    <li></li>
                </ol></td>       
               <td align="right">Price </td>
                <td align="right"><ol>
                    <li></li>
                    <li></li>
                    <li></li>
                     <li></li>
                    <li></li><br/>
                   Total Price
                   <input type="text" name="total">
</ol></td>       
        </tr>
                    
           <tr align="right">
               <td> <input type="submit" value="ORDER"></td>
           </tr>
            
  </table>  
 </form>    
    </body>
</html>
