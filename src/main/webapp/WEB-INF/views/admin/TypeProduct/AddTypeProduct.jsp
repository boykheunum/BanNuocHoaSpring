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
	<form:form method="POST" action="/BanNuocHoa/admin/postaddtypeproduct"
		enctype="multipart/form-data" modelAttribute="typeProduct">
		<div class="mb-3">
			<label for="exampleFormControlTextarea1" class="form-label">Type product</label>
			<form:input class="form-control" id="exampleFormControlTextarea1"
				rows="3" path="typeProduct" />
		</div>
		<button type="submit" value="submit" class="btn btn-primary">Save</button>
	</form:form>
</body>
</html>