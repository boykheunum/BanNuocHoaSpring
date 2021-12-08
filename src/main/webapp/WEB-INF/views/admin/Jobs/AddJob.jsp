<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form method="POST" action="/BanNuocHoa/admin/addjob"
		enctype="multipart/form-data" modelAttribute="job">
		<div class="mb-3">
			<label for="exampleFormControlTextarea1" class="form-label">Name job</label>
			<form:input class="form-control" id="exampleFormControlTextarea1"
				rows="3" path="name_job" />
		</div>
		<button type="submit" value="submit" class="btn btn-primary">Save</button>
	</form:form>
</body>
</html>