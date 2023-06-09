<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.example.fooditems.dao.FoodItem"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Tables Updation</title>
</head>
<body>
<br><br><br>
	<div>
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center text-primary"><b><u>Update Food Item</u></b></h4>
						<p class="text-center text-danger">* Items Entry is Compulsory</p>

						<form action="updatingitem" method="post">

							<div class="form-group">
								Item Number<input type="text" class="form-control"
									name="itemNumber" value=${foodItem.getItemNumber() } readonly>
							</div>
							<div class="form-group">
								Item Name<input type="text" class="form-control" name="itemName" value=${foodItem.getItemName() } readonly>
							</div>

							<div class="form-group">
								Type<input type="text" class="form-control"
									name="cuisine" value=${foodItem.getCuisine() } readonly>
							</div>

							<div class="form-group">
								New Price<input type="text" class="form-control"
									name="price" value=${foodItem.getPrice() }>
							</div>


							<div class="form-group">
								 Update Availability<input type="text" class="form-control"
									name="availability" value=${foodItem.getAvailability() }>
							</div>
                                                                <br>
							<div>
								<button type="submit" value="submit" class="Rounded btn-dark">Update</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
<style>
    .form-group {
    text-color:red;
    font-family: 4px 'Courier New', monospace;
    background-color: pink;
    border:5x black;
}
</style>
</html>