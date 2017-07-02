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
	
	/*1*/
	/*2*/
	/*3*/
	/*Test feature*/
	/*Test feature*/
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		logger.info("Welcome home! The client locale is {1}.", locale);
		logger.info("Welcome home! The client locale is {2}.", locale);
		//test1
		//test2
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		/*ccc*/
		/*fff*/
		/*ccc*//*ccc*//*ccc*//*ccc*//*ccc*/
		/*fff*//*fff*//*fff*//*fff*/
		/*kkk*//*kkk*/
		return "home";
	}
	
}
