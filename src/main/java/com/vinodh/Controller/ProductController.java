package com.vinodh.Controller;

import java.text.SimpleDateFormat;
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
	
}
