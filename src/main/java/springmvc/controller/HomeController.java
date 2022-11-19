package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springmvc.entity.User;

@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping(path = "/home1",method = RequestMethod.GET)
	public String home(Model model) {
		User user = new User();

//		set user data

		user.setName("Saif Alam");
		user.setDesignation("Senior Consultant");
		user.setSalary(100000);

//		Set userSet Object intO model

		model.addAttribute("user", user);

		System.out.println("This is home ");
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about ");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		
		User user = new User();

//		set user data

		user.setName("Samir Alam");
		user.setDesignation("Senior Accountant");
		user.setSalary(200000);
		
		LocalDateTime localDateTime = LocalDateTime.now();

//		Set userSet Data into ModelAndView
		ModelAndView model = new ModelAndView();
		model.addObject("user", user);
		
//		set localDate and time object into model
		model.addObject("dateTime", localDateTime);
		
		List list = new ArrayList<>();
		list.add("89898989898");
		list.add("7290859582");
		list.add("76767454545");
		
		list.add("89898989554");
		list.add("89898989554");
		list.add("89898989554");
		 
		model.addObject("mobile", list);
		
		
		
//		to set the view page into modelAndView object
		model.setViewName("help");
		
//		return model object
		return model;
	}
}
