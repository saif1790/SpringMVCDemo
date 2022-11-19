package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import springmvc.entity.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
    private UserService service;
   
	@RequestMapping("/contact")
	public String showView() {
		System.out.println("contact");
		return "contact";
	}
	
	@RequestMapping("/redirect")
	public RedirectView redirectView() {
		System.out.println("redirect");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://www.google.com/");
		return redirectView;
	}

	/*
	 * @RequestMapping(path = "/processForm", method = RequestMethod.POST) public
	 * String handleFormData(Model model,@RequestParam("username") String
	 * name, @RequestParam("email") String email,
	 * 
	 * @RequestParam("password") String pass) {
	 * 
	 * System.out.println("processForm");
	 * 
	 * User user = new User(name, email, pass); model.addAttribute("formData",
	 * user);
	 * 
	 * return "userData"; }
	 */
	
	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String handleFormData(@ModelAttribute User user,Model model) {
	 
		int savedUser = service.createUser(user);
		if(user.getName().isBlank())
			return "redirect:/contact";
		model.addAttribute("saveUser","User has been created with id"+ savedUser);
		System.out.println("processForm");
		return "userData";
	}

}
