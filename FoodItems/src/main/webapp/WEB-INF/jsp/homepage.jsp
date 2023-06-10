<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.example.fooditems.entity.FoodItem"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
<title>Starting page</title>
</head>

<style>
.btn-primary {
 
  color: white;
 
  background-color: navajowhite;
 
  border-radius: 35px;
 
  border: 2px solid rgba(0, 70, 147, 0.75);
 
}
table{
border: 6px double darkslategray;
text-align: center;
font-size: 20px;
background-color: pink;
padding:0;
width: auto;
margin: 0;
}
th{
border: 5px solid midnightblue;
background-color: paleturquoise;
padding:0;
}
td{
border: 5px solid purple;
background-color: khaki;
padding:0;
}
#space{
border-collapse: separate;
border-spacing: 10px;
}
</style>

<body class="container">
<h2  class="text-center" style="background-color:powderblue;" >Le Gourmet Food Center</h2><br><br>

	<div class="text-center">
	<button  class="btn btn-primary">
	<a href="insertItemsPage">Click Here to Add items</a>
	</button></div><br><br>
	<div class="row">
		<div class="col-2"></div>
		<div class="col-8">

			<table class="table table-bordered">
				<thead>
					<tr>
						<th>itemNumber</th>
						<th>itemName</th>
						<th>cuisine</th>
						<th>Price</th>
						<th>Availability</th>
						<th>Actions</th>
					</tr>
				</thead>

				<c:forEach items="${foodList}" var="item">
					<tr>
						<td>${item.getItemNumber()}</td>
						<td>${item.getItemName()}</td>
						<td>${item.getCuisine()}</td>
						<td>${item.getPrice()}</td>
						<td>${item.getAvailability()}</td>
						
						<td><a href="editItemPage?id=${item.getItemNumber() }"
							class="btn btn-sm btn-warning">Edit</a> <a
							href="deleteitem?id=${item.getItemNumber() }"
							class="btn btn-sm btn-danger">Delete</a></td>

					</tr>
				</c:forEach>
			</table>

		</div>
		<div class="col-2"></div>
	</div>
</body>


</html>