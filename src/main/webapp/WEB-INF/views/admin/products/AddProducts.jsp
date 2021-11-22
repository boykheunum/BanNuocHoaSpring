<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<form:form method="POST" action="/BanNuocHoa/admin/postproduct"
		enctype="multipart/form-data" modelAttribute="productsModel">
		<div class="form-label">
			<label>Id type products</label>
			<form:select class="form-select" aria-label="Default select example"
				path="id_type_product">
				
				<c:forEach var="item" items="${listTypeProducts}">
					<form:option value="${item.getId_type_product() }" />
				</c:forEach>
			</form:select>
		</div>




		<div class="mb-3">
			<label for="exampleFormControlTextarea1" class="form-label">Name
				product</label>
			<form:input class="form-control" id="exampleFormControlTextarea1"
				rows="3" path="nameProduct" />
		</div>
		<div class="mb-3">
			<label for="exampleFormControlTextarea1" class="form-label">Descriotiform</label>
			<form:input class="form-control" id="exampleFormControlTextarea1"
				rows="3" path="descriotion" />
		</div>
		<div class="mb-3">
			<label for="exampleFormControlTextarea1" class="form-label">Import
				prince</label>
			<form:input class="form-control" id="exampleFormControlTextarea1"
				rows="3" path="importPrice" />
		</div>
		<div class="mb-3">
			<label for="exampleFormControlTextarea1" class="form-label">Price</label>
			<form:input class="form-control" id="exampleFormControlTextarea1"
				rows="3" path="price" />
		</div>

		<div class="mb-3">
			<label for="exampleFormControlTextarea1" class="form-label">Quantity</label>
			<form:input class="form-control" id="exampleFormControlTextarea1"
				rows="3" path="quantity" />
		</div>

		<label for="exampleFormControlTextarea1" class="form-label">image</label>
		<input type="file" name="file" />

		<button type="submit" value="submit" class="btn btn-primary">Save</button>
	</form:form>
</body>
</html>