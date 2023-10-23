package com.example.lesson06;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.lesson04.bo.UserBO;
import com.example.lesson04.domain.User;

@RequestMapping("/lesson06")
@Controller
public class Lesson06Controller {
	
	@Autowired
	private UserBO userBO;
	
	// ex02
	@GetMapping("/ex02/join-view")
	public String joinView() {
		return "lesson06/join";
	}
	
	// 이름 중복 확인 -- AJAX
	@ResponseBody
	@RequestMapping("/ex02/is-duplication")
	public Map<String, Object> isDuplication(
			@RequestParam("name") String name
			){
		
		boolean isDuplicated = userBO.existUserByName(name);
		// {"code":200, "is_duplication":true}
		Map<String, Object> result = new HashMap<>();
		result.put("code", 200);
		result.put("is_Duplication", isDuplicated);
		return result;
		
	}
	
	// ex02 끝
	
	// ex01
	// 요청 주소 : http://localhost/lesson06/ex01/add-user-view
	// 회원정보 추가
	@GetMapping("/ex01/add-user-view")
	public String addUserView() {
		
		return "lesson06/addUser";
	}
	
	//회원 추가 기능 -- AJAX가 하는 요청 => 응답값은 String이어야 한다.
	@PostMapping("/ex01/add-user")
	@ResponseBody
	public String addUser(
			@RequestParam("name") String name
			, @RequestParam("yyyymmdd") String yyyymmdd
			, @RequestParam("email") String email
			, @RequestParam(value="introduce", required=false) String introduce
			) {
		
		//
		userBO.addUser(name, yyyymmdd, email, introduce);
		return "성공";
	}
	
	@GetMapping("/ex01/get-latest-user")
	public String getLatestUser(Model model) {
		User user = userBO.getLatestUser();
		model.addAttribute("result", user);
		return "lesson06/getLatestUser";
	}
	
	
	// ex01 끝

}
