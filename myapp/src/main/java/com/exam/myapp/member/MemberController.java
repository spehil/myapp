package com.exam.myapp.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.InternalResourceView;

//브라우저에서
//http://localhost:8000/myapp/member/list.do로 요청을 보내면
//MemberController 클래스의 list()메서드가 실행되고,->@RequestMapping
//브라우저 화면에 "회원목록"이라고 출력되도록 구현 
@Controller // spring한테 어노테이션을 만들어 컨트롤러인걸 알려줄수있게 적어준다.
public class MemberController {
	@RequestMapping(value = "/member/list.do", method = RequestMethod.GET) // Get방식으로 요청이오면 메서드실행

	public String list() {// list 메서드가 실행되고,

		return "member/list";// 뷰이름만 이름만 반환하면,

	}
}
