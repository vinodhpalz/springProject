package com.vinodh.Controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vinodh.model.Product;

@Controller
public class ProductController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "product";
	}
	
	@RequestMapping("/welcome/{pName}/{pCost}")
	public String welcome(Model m,@PathVariable Map<String,String> pathArgs) {
		String pName = pathArgs.get("pName");
		String pCost = pathArgs.get("pCost");
		m.addAttribute("name",pName);
		m.addAttribute("cost",pCost);
		m.addAttribute("HeaderName","Welcome to E-CART");
		return "welcome";
	}
	
	@ModelAttribute
	public void commonData(Model m1) {
		m1.addAttribute("HeaderName","Welcome to E-CART");
	}
	
	@RequestMapping(value = "/productSuccess", method=RequestMethod.POST)
	public String productSuccess(Model m, @ModelAttribute("product1")Product product1) {
		
		return "productSuccess";
		
	}
	
}
