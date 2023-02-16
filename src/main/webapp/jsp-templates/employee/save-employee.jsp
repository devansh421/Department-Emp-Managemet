<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<link href='../CSS/style.css' rel='stylesheet'>
<link href='../CSS/bootstrap.min.css' rel='stylesheet'>
<body style='background-color:cyan'>
  <div class='container my-2'>
   <div class='card col-md-10 mx-auto'>
    <div class='card-body'>
     <form action="save-record" method="post">
      <div class='row'>
       <div class='form-group col-md-5'>
      	<label for='firstname' class='la'>Enter first name</label><span> *</span>
      	<input class='form-control' type='text' id='firstname' name='firstname' required>
       </div>
       <div class='form-group col-md-5'>
      	<label for='lastname' class='la'>Enter last name</label><span> *</span>
      	<input class='form-control' type='text' id='lastname' name='lastname' required>
       </div>
     </div>
     <div class='row'>
       <div class='form-group col-md-5'>
      	<label for='firstname' class='la'>Select Date of birth</label><span> *</span>
      	<input class='form-control' type='date' id='dob' name='date' required>
       </div>
       <div class='form-group col-md-5'>
      	<label for='phone' class='la'>Enter phone number</label><span> *</span>
      	<input class='form-control' type='text' id='phone' name='phone' required>
       </div>
     </div>
     <div class='row'>
       <div class='form-group col-md-5'>
      	<label for='salary' class='la'>Enter salary</label><span> *</span>
      	<input class='form-control' type='text' id='salary' name='salary' required>
       </div>
       <div class='form-group col-md-5'>
      	<label for='did' class='la'>Select department</label><span> *</span>
      	<select class='form-control' name="did" id="did">
      	 <c:forEach var="dept" items="${dlist}">
      	  <option value="${dept.did}">${dept.name}</option>
      	 </c:forEach>
      	</select>
       </div>
     </div>
     <div class='row'>
       <div class='form-group col-md-10'>
        <button class='btn btn-primary'>Save Record</button>
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
