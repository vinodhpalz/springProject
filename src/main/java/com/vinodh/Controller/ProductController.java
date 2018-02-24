package com.vinodh.Controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vinodh.model.Product;

@Controller
public class ProductController {
	
/*	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String[] {"pDesc"});
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy**MM**DD");
		binder.registerCustomEditor(Date.class, "pDOM", new CustomDateEditor(dateFormat,false));
	}
	*/
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
	public String productSuccess(@Valid @ModelAttribute("product1")Product product1, BindingResult result) {
		
		if(result.hasErrors())
		{
			return "product";
		}
		
		return "productSuccess";
		
	}
	
	@ResponseBody
	@RequestMapping(value="/products", method=RequestMethod.GET)
	public ArrayList<Product> getProducts(){
		
		Product p1 = new Product();
		p1.setpName("Samsung Mobile");
		p1.setpCost(5000L);
		
		Product p2 = new Product();
		p2.setpName("Apple Mobile");
		p2.setpCost(8000L);
		
		Product p3 = new Product();
		p3.setpName("Sony Mobile");
		p3.setpCost(4000L);
		
		ArrayList<Product> al = new ArrayList<Product>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		
		return al;
		
	}
	
}
