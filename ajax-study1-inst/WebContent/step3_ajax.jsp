<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax</title>
<script type="text/javascript">
	function startAjax(){
		var deptNo = document.getElementById("deptNo").value;
		if(deptNo!="")
			alert(deptNo);
		
		xhr = new XMLHttpRequest();
		
		xhr.onreadystatechange = callback;
		xhr.open("get", "FindDeptServlet?deptNo="+deptNo);
		xhr.send(null);	//get방식일 때는 null setting, post 방식 데이터 전송용
	}
	
	function callback(){
		if(xhr.readyState == 4 && xhr.status == 200){
			document.getElementById("deptInfo").innerHTML = xhr.responseText;
		}
	}
</script>
<style type="text/css">
	/* 아이디로 선택할 때는 #으로, 클래스로 접근할 때는 .으로 */
	#deptInfo{
		background-color: pink;
	}
</style>
</head>
<body>
	<select onchange="startAjax()" id="deptNo">
		<option value="">--부서번호--</option>
		<option value="10">10</option>
		<option value="20">20</option>
		<option value="30">30</option>
	</select>
	<span id="deptInfo"></span>
<%--
		만약 부서정보를 부서명, 지역 ... 과 같이 분할해서 표현해야 한다면?
		<span id="dname"></span><br><br>
		<span id="loc"></span>
 --%>
</body>
</html>