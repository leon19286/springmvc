package com.leon.testmvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome to home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "home";
	}

	private void feature1() {
		// TODO Auto-generated method stub

	}
	
	private void feature2() {
		// TODO Auto-generated method stub

	}
	
	private void feature4() {
		// TODO Auto-generated method stub

	}
	
	private void feature3() {
		// TODO Auto-generated method stub
		System.out.println("sad");
		System.out.println("sad77788");
		System.out.println("sad77788990");
	} 
	
	private void feature5() {
	}
	
	private void feature6() {
	} 

}
