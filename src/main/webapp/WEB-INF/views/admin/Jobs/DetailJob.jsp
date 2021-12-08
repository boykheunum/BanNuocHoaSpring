<%@ include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Jobs</h1>
	<table class="table table-dark table-hover">
		<tr class="table-dark">
			<td class="table-dark">Id job</td>
			<td class="table-dark">Name job</td>
			<td class="table-dark"></td>
		</tr>
		<c:forEach var="item" items="${listJobs }">
			<tr class="table-dark">
				<td class="table-dark">${item.getId_job() }</td>
				<td class="table-dark">${item.getName_job() }</td>
				<td class="table-dark"><a
					href="deletejob?id=${item.getId_job()}"><i
						class="fas fa-trash"></i></a>|<a
					href="vieweditjob?id=${item.getId_job()}"><i
						class="fas fa-edit"></i></a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>