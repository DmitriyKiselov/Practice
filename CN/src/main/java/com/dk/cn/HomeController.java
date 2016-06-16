package com.dk.cn;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dk.dao.UserDao;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	UserDao userDao = context.getBean(UserDao.class);
	List<Users> list = userDao.list();

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {
		return new ModelAndView("login", "user", new Users());
	}

	@RequestMapping(value = "/check-user", method = RequestMethod.POST)
	public ModelAndView checkUser(@ModelAttribute("user") Users user) {
		for (Users p : list) {
			if (p.getName().equals(user.getName()))
				return new ModelAndView("login");
		}
		userDao.save(user);
		return new ModelAndView("main", "user", user);
	}

}
