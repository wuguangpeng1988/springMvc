package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class StaticWebController {
	   @RequestMapping(value = "/staticindex", method = RequestMethod.GET)
	   public String index() {
	       return "staticindex";
	   }   
	   @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
	   public String redirect() {     
	      return "redirect:/pages/final.htm";
	   }


}
