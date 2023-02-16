<html>
<link href='../CSS/style.css' rel='stylesheet'>
<body>
 <form action="save-record" method="post">
  <table class='taf'>
   <tr>
    <td class='pdf'>Enter department name</td>
    <td class='pdf'><input type='text' name='name' class='tb' required></td>
   </tr>
   <tr>
    <td class='pdf'>Enter department head</td>
    <td class='pdf'><input type='text' name='head' class='tb' required></td>
   </tr>
   <tr>
    <td class='pdf' colspan="2" align="right">
      <button class='bt'>Save Record</button>
    </td>
   </tr>
   </table>
  </form>
  <div style='text-align: center;margin-top:10px'>
    <input type='button' value='Back' class='bt' style='background-color:orange' onclick='history.back()'>   
  </div>
</body>
</html>
