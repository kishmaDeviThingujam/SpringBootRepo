package com.springboottraining.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/abc")
	public ModelAndView send()
	{
		ModelAndView view=new ModelAndView();
		view.setViewName("hello");
		return view;
	}
	@RequestMapping("/pizza")
	public ModelAndView pizza()
	{
		ModelAndView view=new ModelAndView();
		view.setViewName("food");
		return view;
	}
	//for having restful spring no need to change anywhere
	//now we can run as localhost:8080/customer/
	@RequestMapping(value = "/customer/" ,method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public  @ResponseBody ResponseEntity<Customer> getCustomerDetails()
    {
			Customer customer = new Customer();
			customer.setCustomerId(190);
			customer.setCustomerName("Kishma Thingujam");
			customer.setCustomerAddress("Jaipur");
			customer.setBillAmount(68000);
			return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
}
