<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <link href='../CSS/style.css' rel='stylesheet'>
 <body>
 <div class='dvh'>
    <a href='add' style='font-size:23px'>Add Department</a>
 </div>
 <div class='dvb'>
  <c:if test="${dlist=='[]'}">  
  <div class='dv' style='margin-top:1vw'>
   <label class='dhm' style='color:red'>Department dash board has no department yet</label>
  </div>
  </c:if>
  <c:if test="${dlist!='[]'}">
  <table border='1' class='ta' cellpadding='5px'>
  	<tr style="background-color:orange;color:white">
  	 <th colspan="5" align="center" style='font-size:22px'>Department Dashboard</th>
  	</tr>
  	<tr>
  	 <th align="left">Department Id</th><th align="left">Department name</th>
  	 <th align="left">Department head</th><th align="left">No of employees</th>
  	 <th align="left" style='color:magenta'>Action</th>
  	</tr>
  	<c:forEach var="dept" items="${dlist}">
  	 <tr>
  	  <td>${dept.did}</td>
  	  <td>${dept.name}</td>
  	  <td>${dept.head}</td>
  	  <td>${dept.totalEmployees}</td>
  	  <td>
  	   <a class='aan' href='edit-record?did=${dept.did}'>Edit |</a>
  	   <a class='aan' href='delete-record?did=${dept.did}' onclick="return confirm('Are you sure to remove this record?')">Remove</a>
  	  </td>
  	 </tr>
  	</c:forEach>
  </table>
  </c:if>
  </div>
  <div class='dvv'>
    <a class='bt' style='background-color:orange' href='/department-employee-management'>Home</a>   
  </div>
 </body>
</html>