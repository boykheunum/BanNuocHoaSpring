<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Shop</h1>
	<form:form method="POST" action="/BanNuocHoa/admin/editshop"
		modelAttribute="infomationshop">
<form:input type="hidden" path="id_shop" value="${infomationshop.getId_shop()}"/>
		<div class="col-3">
			<label for="exampleFormControlTextarea1" class="form-label">Adress</label>
			<form:input class="form-control" id="exampleFormControlTextarea1"
				rows="3" path="adress"
				value="${infomationshop.getAdress() }" />
		</div>

		<div class="col-3">
			<label for="exampleFormControlTextarea1" class="form-label">Name</label>
			<form:input class="form-control" id="exampleFormControlTextarea1"
				rows="3" path="name" value="${infomationshop.getName() }" />
		</div>

		<div class="col-3">
			<label for="exampleFormControlTextarea1" class="form-label">Phonenumber</label>
			<form:input class="form-control" id="exampleFormControlTextarea1"
				rows="3" path="phonenumber"
				value="${infomationshop.getPhonenumber() }" />
		</div>

		<div class="col-3">
			<label for="exampleFormControlTextarea1" class="form-label">Latitude</label>
			<form:input class="form-control" id="exampleFormControlTextarea1"
				rows="3" path="lat" value="${infomationshop.getLat()}" />
		</div>

		<div class="col-3">
			<label for="exampleFormControlTextarea1" class="form-label">Longitude</label>
			<form:input class="form-control" id="exampleFormControlTextarea1"
				rows="3" path="lng" value="${infomationshop.getLng()}" />
		</div>

		<button type="submit" value="submit" class="btn btn-primary">Save</button>
	</form:form>
</body>
</html>