<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	TEST DEVA APP 
</h1>

<P>  The time on the server is ${serverTime}. </P>
<%String ip = request.getRemoteAddr(); 
String root = request.getProtocol();
%>

<h3>ip : <%=ip %></h3>
<h3>root : <%=root %></h3>
<h2>${userAgent }</h2>
<div id="map" style="width:500px;height:400px;"></div>



</body>
<script type="text/javascript" src="//apis.daum.net/maps/maps3.js?apikey=5d98df3cbf6c3a94417916c079e9b38c27b07ba3&libraries=services,clusterer""></script>
<script>
var container = document.getElementById('map'); //지도를 담을 영역의 DOM 레퍼런스
var options = { //지도를 생성할 때 필요한 기본 옵션
	center: new daum.maps.LatLng(33.450701, 126.570667), //지도의 중심좌표.
	level: 3 //지도의 레벨(확대, 축소 정도)
};



var map = new daum.maps.Map(container, options);
</script>

</html>
