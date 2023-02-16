<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<link href='../CSS/style.css' rel='stylesheet'>
<link href='../CSS/bootstrap.min.css' rel='stylesheet'>
<body style='background-color:cyan'>
  <div class='container my-2'>
   <div class='card col-md-10 mx-auto'>
    <div class='card-body'>
     <form action="update-record" method="post">
     <div class='row'>
       <div class='form-group col-md-5'>
      	<label for='eid' class='la'>Employee id</label>
       </div>
       <div class='form-group col-md-5'>
      	${emp.eid}<input  value="${emp.eid}" type='hidden' name='eid'>
       </div>
     </div>
      <div class='row'>
       <div class='form-group col-md-5'>
      	<label for='firstname' class='la'>Edit first name</label>
      	<input class='form-control' value="${emp.firstname}" type='text' id='firstname' name='firstname' required>
       </div>
       <div class='form-group col-md-5'>
      	<label for='lastname' class='la'>Edit last name</label>
      	<input class='form-control' value="${emp.lastname}" type='text' id='lastname' name='lastname' required>
       </div>
     </div>
     <div class='row'>
       <div class='form-group col-md-5'>
      	<label for='firstname' class='la'>Edit Date of birth</label>
      	<input class='form-control' value="${emp.dob}" type='date' id='dob' name='date' required>
       </div>
       <div class='form-group col-md-5'>
      	<label for='phone' class='la'>Edit phone number</label>
      	<input class='form-control' value="${emp.phone}" type='text' id='phone' name='phone' required>
       </div>
     </div>
     <div class='row'>
       <div class='form-group col-md-5'>
      	<label for='salary' class='la'>Edit salary</label>
      	<input class='form-control' value="${emp.salary}" type='text' id='salary' name='salary' required>
       </div>
       <div class='form-group col-md-5'>
      	<label for='did' class='la'>Edit department</label>
      	<select class='form-control' name="did" id="did">
      	 <c:forEach var="dept" items="${dlist}">
      	  <c:if test="${emp.did==dept.did}">
      	  	<option selected value="${dept.did}">${dept.name}</option>
      	  </c:if>	
      	  <c:if test="${emp.did!=dept.did}">
      	  	<option value="${dept.did}">${dept.name}</option>
      	  </c:if>
      	 </c:forEach>
      	</select>
       </div>
     </div>
     <div class='row'>
       <div class='form-group col-md-10'>
        <button class='btn btn-primary'>Update Record</button>
       </div>
     </div>   
     </form>
    </div>
   </div>
  </div>
  <div style='text-align: center;margin-top:10px'>
    <input type='button' value='Back' class='bt' style='background-color:orange' onclick='history.back()'>   
  </div>
</body>
</html>
