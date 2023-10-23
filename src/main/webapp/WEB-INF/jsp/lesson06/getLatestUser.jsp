<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table class="table" border="1">
		<tr>
			<th>이름</th>
			<td>${result.name}</td>
			<th>생년월일</th>
			<td>${result.yyyymmdd}</td>
			<th>이메일</th>
			<td>${result.email}</td>
			<th>자기소개</th>
			<td>${result.introduce}</td>
		</tr>
	</table>
</body>
</html>