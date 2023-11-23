<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login Page</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet">
	    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
	    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
	    <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.min.js"></script>
	    <style>
	    	body {
	            font-family: Arial, sans-serif;
	            background-color: #f4f4f4;
	            margin: 0;
	            padding: 0;
	        }
	    	form {
		    	background-color: #fff;
	            padding: 20px;
	            padding-top: 40px;
	            padding-bottom: 10px;
	            border-radius: 8px;
	            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	            width: 500px;
	            height: 350px;
	    	}
	    </style>
	</head>
	<body>
	    <div class="d-flex justify-content-center align-items-center vh-100">
	    	<form class="needs-validation" novalidate>
	    	  <h4 class="text-center">Login</h4>
			  <div>
			    <label for="validationCustom01" class="form-label">First name</label>
			    <input type="text" class="form-control" id="validationCustom01" value="Mark" required>
			    <div class="valid-feedback">
			      Looks good!
			    </div>
			  </div>
			  <div>
			    <label for="validationCustom02" class="form-label">Last name</label>
			    <input type="text" class="form-control" id="validationCustom02" value="Otto" required>
			    <div class="valid-feedback">
			      Looks good!
			    </div>
			  </div>
			  <div class="d-flex justify-content-center mt-5">
			    <button class="btn btn-primary" type="submit">Submit form</button>
			  </div>
			</form>
	    </div>

	</body>
</html>

<script type="text/javascript">
	//Example starter JavaScript for disabling form submissions if there are invalid fields
	(function () {
	  'use strict'
	
	  // Fetch all the forms we want to apply custom Bootstrap validation styles to
	  var forms = document.querySelectorAll('.needs-validation')
	
	  // Loop over them and prevent submission
	  Array.prototype.slice.call(forms)
	    .forEach(function (form) {
	      form.addEventListener('submit', function (event) {
	        if (!form.checkValidity()) {
	          event.preventDefault()
	          event.stopPropagation()
	        }
	
	        form.classList.add('was-validated')
	      }, false)
	    })
	})()
</script>
