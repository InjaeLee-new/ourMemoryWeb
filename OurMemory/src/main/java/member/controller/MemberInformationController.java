package member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberInformationController {
	
	@RequestMapping(value = "/myInform")
	public ModelAndView memberInformation(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("index.jsp?req=myInform");
		
		return modelAndView;
	}

}
