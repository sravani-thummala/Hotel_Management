<%-- 
    Document   : Checkout_Form
    Created on : 21 Jan, 2019, 9:44:21 PM
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
<h1><center>Customer CheckOut Form</center></h1>
 <form>
        <table align="center">
  
            <tr>
               <td>Select Room No :  </td>
               <td> <select>
                   </select></td> <td> <button>SEARCH</button></td>
            </tr>
            
             <tr>
                  <td>Customer Name </td>
                 <td> <input type="text" name="cusname"></td>
             </tr> 
             
              <tr>
                  <td>Check In  Date </td>
                 <td> <input type="text" name="checkin date"></td>
             </tr>  
             
             <tr>
                  <td>Check Out  Date </td>
                 <td> <input type="text" name="checkout date"></td>
                 <td> <button>Calculate</button></td>
                  <td>NoOf Days </td>
                 <td><input type="text" name="NoOfDays">  </td>
             </tr>
             
              <tr>
                  <td>Total Rent To Pay </td>
                 <td> <input type="text" name="Total Rent"></td>
             </tr>
             
              <tr>
                  <td>Food Ordered Bill </td>
                 <td> <input type="text" name="FoodBill"></td>
                 <td> <button>ShowDetails</button></td>
             </tr>
             
              <tr>
                  <td>Tax </td>
                 <td> <input type="text" name="tax"></td>
                 <td> <button>OK</button></td>
             </tr>
             
             <tr>
                  <td>Total Amount To Pay </td>
                 <td> <input type="text" name="Total Amount"></td>
             </tr>
             
              <tr align="right">
               <td> <input type="submit" value="CheckOut"></td>
           </tr>
             
        </table>
 </form>
    </body>
</html>
