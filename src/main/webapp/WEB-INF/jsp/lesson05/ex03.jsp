<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- -- JSTL을 사용하려면 아래의 태그를 붙여 넣는다. -->--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL fmt 라이브러리</title>
</head>
<body>
	<c:set var="number" value="12345678" />
	<h1>숫자 출력</h1>
	<fmt:formatNumber value="${number}" />
	<h1>숫자 타입</h1>
	<%-- 1) number --%>
	숫자: <fmt:formatNumber value="${number}" type="number"/><br>
	숫자 3자리마다 쉼표 제거 : <fmt:formatNumber value="${number}" type="number" groupingUsed="false" /><br>
	<%-- 2) percent --%>
	100% : <fmt:formatNumber type="percent" value="1" /><br>
	40% : <fmt:formatNumber type="percent" value="0.4" /><br>
	<%-- 3) currency --%>
	통화(원) : <fmt:formatNumber type="currency" value="${number}" /><br>
	통화(원) : <fmt:formatNumber type="currency" value="${number}" currencySymbol="$" /><br>
	
	<h1>Pattern</h1>
	3.14 : <fmt:formatNumber value="3.14" /><br>
	3.14(0.0000) : <fmt:formatNumber value="3.14" pattern="0.0000"/><br>
	3.14(#.####) : <fmt:formatNumber value="3.14" pattern="#.####"/><br>
	3.141591(#.####) : <fmt:formatNumber value="3.141591" pattern="#.####"/><br>
	
	<hr>
	
	<h1>Date객체를 String 형태로 출력(fmt:formatDate)</h1>
	Date : ${today }<br>
	<fmt:formatDate value="${today}" pattern="yyyy년 M월 d일 HH시 mm분 ss초" var="pattern1"/>
	patttern1: ${pattern1}<br>
	
	<fmt:formatDate value="${today}" pattern="yyyy/MM/dd HH:mm:ss" /><br>
	<fmt:formatDate value="${today}" pattern="yyyy/MM/dd HH:mm:ss" var="pattern2" />
	patttern2: ${pattern2}<br>
	
	
	<h1>String을 Date 객체로 변환(fmt:parseDate)</h1>
	<fmt:parseDate value="${pattern2}" pattern="yyyy/MM/dd HH:mm:ss"/>
	
	
	
	
</body>
</html>