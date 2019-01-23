<%-- 
    Document   : Customer_Checkin
    Created on : 21 Jan, 2019, 9:17:51 PM
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
<h1><center>Customer Checkin Form</center></h1>
 <form>
        <table align="center">
  
             <tr>
                  <td>Customer Name </td>
                 <td> <input type="text" name="cusname"></td>
             </tr> 
                          
             <tr>
                  <td>Customer's Father name </td>
                 <td> <input type="text" name="cusfaname"></td>
             </tr>
             
             <tr>
                  <td> Gender </td>
                  <td><input type="radio" name="gender" value="male"> Male</td>
                  <td><input type="radio" name="gender" value="female"> Female</td> 
             </tr> 
             
             <tr>
                  <td> Martial Status </td>
                  <td><input type="radio" name="Martial_Status" value="Married"> Male</td>
                  <td><input type="radio" name="Martial_Status" value="UnMarried"> Female</td> 
             </tr>
             
             <tr>
                  <td>Address </td>
                  <td> <textarea  align="center" name="Address" rows="4" cols="30" ></textarea></td>
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
                  <td>ID Proof </td>
                  <td> <select>
                        <option value="Adhar">Adhar</option>
                        <option value="Licence">Licence</option>
                        <option value="Voter">Voter</option>
                        <option value="College ID">College ID</option>
                        <option value="PAN">PAN</option>
                      </select>
                  </td>
             </tr>
             
             <tr>
                  <td>ID Number </td>
                 <td> <input type="text" name="ID Number"></td>
             </tr>
             
              <tr>
               <td>Select Room Category  </td>
               <td><select>
                   </select></td>
            </tr>
               
            <tr>
               <td>Select Room Type  </td>
               <td> <select>
                    </select></td><td> <button>OK</button></td>
            </tr>
            
             <tr>
               <td>Available Room No.s  </td>
               <td> <select>
                    </select></td>
            </tr>

             <tr>
                  <td>Rent </td>
                 <td> <input type="text" name="rent"></td>
             </tr>
             
             <tr>
                  <td>Check In  Date </td>
                 <td> <input type="text" name="checkin date"></td>
             </tr>     
             
             <tr>
                 <td align="right"> <input type="submit" value="SAVE"></td>
             </tr>
        </table>
 </form>    </body>
</html>
