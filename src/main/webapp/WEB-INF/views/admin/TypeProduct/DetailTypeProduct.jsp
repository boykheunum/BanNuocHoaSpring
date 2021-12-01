<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail Type Product</title>
</head>
<body>
	<h1>Type product</h1>
	<table class="table table-dark table-hover">
		<tr class="table-dark">
			<td class="table-dark">Id type products</td>
			<td class="table-dark">Name type product</td>
			<td class="table-dark"></td>
		</tr>
		<c:forEach var="item" items="${listTypeProducts }">
			<tr class="table-dark">
				<td class="table-dark">${item.getId_type_product() }</td>
				<td class="table-dark">${item.getTypeProduct() }</td>
				<td class="table-dark"><a
					href="deletetypeproduct?id=${item.getId_type_product()}"><i
						class="fas fa-trash"></i></a>|<a
					href="viewedittypeproduct?id=${item.getId_type_product()}"><i
						class="fas fa-edit"></i></a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>