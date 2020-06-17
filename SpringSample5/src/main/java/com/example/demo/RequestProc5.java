package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller class for screen display and DB retrieval
 */
@Controller
public class RequestProc5 {

	/**
	 * Instantiate the CustomerRepository class.
	 */
	@Autowired
	CustomerRepository cusRepository;

	/**
	 * Function for initial screen display
	 * @return "index" Return index.html
	 */
	@RequestMapping(value = "/")
	public String index() {

		return "index5";
	}

	/**
	 * Function to get information from the DB
	 * @param model Model for storing DB information
	 * @return "information" Return information.html
	 */
	@RequestMapping(value = "/get")
	public String Information(Model model) {

		// Retrieve all DB information
		List<Customer> cuslist = cusRepository.findAll();
		// Store DB information in the Model
		model.addAttribute("customerList", cuslist);

		return "information";
	}
}


