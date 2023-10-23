<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- bootstrap CDN link -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<!-- AJAX사용하려면 jquey 원본 사용 slim사용 안됨 -->
	<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
 	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
 	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>회원 정보 추가</h1>
		<div class="form-group">
			<label for="name"><b>이름</b></label>
			<div class="d-flex">
				<input type="text" id="name" name="name" class="form-control col-3" placeholder="이름을 입력하세요">
				<button type="button" class="btn btn-info" id="nameCheckBtn">중복 확인</button>
			</div>
			<small id="nameStatusArea"></small>
		</div>
		<input type="button" id="joinBtn" class="btn btn-success" value="추가">
	</div>
	<script>
		$(document).ready(function(){
			$('#nameCheckBtn').on('click', function(){
				//중복확인 클릭시 nameStatusArea 안쪽 태그들 초기화 (안내문구 하나만 출력)
				$('#nameStatusArea').empty();  // 자식 태그들만 제거한다.
				// $(this).empty();  // 자식 태그들만 제거한다.
				
				// alert("클릭");
				let name = $('#name').val().trim();
				
				//이름이 비어있는지 확인
				if (name == ""){
					$('#nameStatusArea').append('<span class="text-danger">이름이 비어있습니다.</span>');
					return;
				}
				
				// 이름 중복 확인 (서버에서 DB 확인)
				$.ajax({
					//request
					type:"get"
					, url:"/lesson06/ex02/is-duplication"
					, data:{"name":name}
					
					//response
					, success:function(data){ //data는 string이거나ㅣ JSON=>dictionary
						// {"code":200, "is_duplication":true}
						if (data.is_Duplication){
							$('#nameStatusArea').append('<span class="text-danger">중복된 이름입니다.</span>');
						}
					}
					, error:function(request, status, error){
						alert("중복확인에 실패했습니다.")
					}
				});
				
				$('#joinBtn').on('click', function(){
					alert("가입")
					console.log($('#nameStatusArea').children().length);
					
					if ($('#nameStatusArea').children().length == 0) {
						alert("가입 가능");
					} else {
						alert("가입 불가");
					}
				});
			});
			
		});
	</script>
</body>
</html>