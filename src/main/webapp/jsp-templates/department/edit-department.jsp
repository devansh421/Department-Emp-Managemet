<html>
<link href='../CSS/style.css' rel='stylesheet'>
<body>
 <form action="update-record" method="post">
  <table class='taf'>
  <tr>
    <td class='pdf'>Department id</td>
    <td class='pdf'>${dept.did}
    	<input type='hidden' value="${dept.did}" name='did' class='tb' required>
    </td>
   </tr>
   <tr>
    <td class='pdf'>Edit department name</td>
    <td class='pdf'><input type='text' value="${dept.name}" name='name' class='tb' required></td>
   </tr>
   <tr>
    <td class='pdf'>Edit department head</td>
    <td class='pdf'><input type='text' value="${dept.head}" name='head' class='tb' required></td>
   </tr>
   <tr>
    <td class='pdf' colspan="2" align="right">
      <button class='bt'>Update Record</button>
    </td>
   </tr>
   </table>
  </form>
  <div class='dvv'>
    <input type='button' value='Back' class='bt' style='background-color:orange' onclick='history.back()'>   
  </div>
</body>
</html>
