<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail Products</title>
</head>
<body>
	<h1>Detail product</h1>
	<table class="table table-dark table-hover">
		<tr class="table-dark">
			<td class="table-dark">Id type products</td>
			<td class="table-dark">Id products</td>
			<td class="table-dark">Name product</td>
			<td class="table-dark">Descriotion</td>
			<td class="table-dark">Import prince</td>
			<td class="table-dark">Price</td>
			<td class="table-dark">Quantity</td>
			<td class="table-dark">Image</td>
			<td class="table-dark"></td>
		</tr>
		<c:forEach var="item" items="${listProducts }">
			<tr class="table-dark">
				<td class="table-dark">${item.getId_type_product() }</td>
				<td class="table-dark">${item.getId_product() }</td>
				<td class="table-dark">${item.getNameProduct() }</td>
				<td class="table-dark">${item.getDescriotion() }</td>
				<td class="table-dark">${item.getImportPrice() }</td>
				<td class="table-dark">${item.getPrice() }</td>
				<td class="table-dark">${item.getQuantity() }</td>
				<td class="table-dark">${item.getImageProduct() }</td>
				<td class="table-dark"><a
					href="deleteproduct?id=${item.getId_product()}"><i
						class="fas fa-trash"></i></a>|<a
					href="editproduct?id=${item.getId_product()}"><i
						class="fas fa-edit"></i></a></td>
			</tr>
		</c:forEach>
	</table>
	<fieldset>
</body>
</html>