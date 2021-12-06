<%@ include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Detail product</h1>
	<table class="table table-dark table-hover">
		<tr class="table-dark">
			<td class="table-dark">Id Shop</td>
			<td class="table-dark">Name</td>
			<td class="table-dark">Phone</td>
			<td class="table-dark">Adress</td>
			<td class="table-dark">Latitude</td>
			<td class="table-dark">Longitude</td>
			<td class="table-dark"></td>
		</tr>
		<c:forEach var="item" items="${listShop }">
			<tr class="table-dark">
				<td class="table-dark">${item.getId_shop() }</td>
				<td class="table-dark">${item.getName() }</td>
				<td class="table-dark">${item.getPhonenumber() }</td>
				<td class="table-dark">${item.getAdress() }</td>
				<td class="table-dark">${item.getLat() }</td>
				<td class="table-dark">${item.getLng() }</td>
				<td class="table-dark"><a
					href="deleteshop?id=${item.getId_shop()}"><i
						class="fas fa-trash"></i></a>|<a
					href="vieweditshop?id=${item.getId_shop()}"><i
						class="fas fa-edit"></i></a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>