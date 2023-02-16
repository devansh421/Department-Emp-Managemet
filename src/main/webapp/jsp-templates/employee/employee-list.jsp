<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <link href='../CSS/style.css' rel='stylesheet'>
 <body>
 <div class='dvh'>
    <a href='add' style='font-size:23px'>Add Employee</a>
 </div>
 <div class='dvb'>
  <c:if test="${elist=='[]'}">  
  <div class='dv' style='margin-top:1vw'>
   <label class='dhm' style='color:red'>Employee dash board has no employee yet</label>
  </div>
  </c:if>
  <c:if test="${elist!='[]'}">
  <table border='1' class='ta' cellpadding='5px'>
  	<tr style="background-color:orange;color:white">
  	 <th colspan="8" align="center" style='font-size:22px'>Employee Dashboard</th>
  	</tr>
  	<tr>
  	 <th>Emp Id</th><th align="left">First name</th>
  	 <th>Last name</th><th>Date of birth</th>
  	 <th>Phone number</th><th>Salary</th><th>Dept id</th>
  	 <th style='color:magenta'>Action</th>
  	</tr>
  	<c:forEach var="emp" items="${elist}">
  	 <tr>
  	  <td>${emp.eid}</td>
  	  <td>${emp.firstname}</td>
  	  <td>${emp.lastname}</td>
  	  <td>${emp.dob}</td>
  	  <td>${emp.phone}</td>
  	  <td>${emp.salary}</td>
  	  <td>${emp.did}</td>
  	  <td>
  	   <a class='aan' href='edit-record?eid=${emp.eid}'>Edit |</a>
  	   <a class='aan' href='delete-record?eid=${emp.eid}' onclick="return confirm('Are you sure to remove this record?')">Remove</a>
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