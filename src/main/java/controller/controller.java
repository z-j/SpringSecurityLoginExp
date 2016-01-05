package controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class controller {

	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String showForm(ModelMap model) {
		return "login";
	}


	@RequestMapping(value="/loginsuccess", method = RequestMethod.GET)
	public String loginSuccess(ModelMap model) throws Exception {

		User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String name = user.getUsername();

		model.put("name", name);
		return "loginsuccess";
	}

	@RequestMapping(value="/admin", method = RequestMethod.GET)
	public String submitResponse(ModelMap model) throws Exception {
		User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String name = user.getUsername();

		model.put("name", name);
		return ("admin");  
	}

}