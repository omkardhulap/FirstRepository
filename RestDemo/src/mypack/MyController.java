package mypack;


import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {
	
	
	@RequestMapping("/hello.htm")
	public ModelAndView sayGreeting(){
		String msg="Hi, Welcome to Spring MVC 3.0";
		return new ModelAndView("/jsp/hello.jsp","message",msg);
	}
}
