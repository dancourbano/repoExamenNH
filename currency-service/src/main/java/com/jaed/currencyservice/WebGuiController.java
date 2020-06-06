package com.jaed.currencyservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/gui")
public class WebGuiController {
	
	@Autowired
	private CurrencyExchangeServiceProxy proxy;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String raiz(Model model) {
		model.addAttribute("currencys", proxy.allCurrency()); 
		return "conversion";
	}
}
