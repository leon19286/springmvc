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
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome test! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "homehome";
	}

	private void test() {
		// TODO Auto-generated method stub

	}

	private void need() {
		// TODO Auto-generated method stub

	}

	private void method1() {
		// TODO Auto-generated method stub

	}

	private void method2() {
		// TODO Auto-generated method stub

	}
	
	private void method3() {
		// TODO Auto-generated method stub

	}
	
	private void test2() {
		// TODO Auto-generated method stub
		System.out.println();
	}
}
