package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentExceptionController {
	   @RequestMapping(value = "/studentexception", method = RequestMethod.GET)
	   public ModelAndView studentexception() {
	      return new ModelAndView("studentexception", "command", new StudentException());
	   }
	   @RequestMapping(value = "/addStudent1", method = RequestMethod.POST)
	   @ExceptionHandler({SpringException.class})
	   public String addStudent1( @ModelAttribute("HelloWeb")StudentException student, 
	      ModelMap model) {
	      if(student.getName().length() < 5 ){
	         throw new SpringException("Given name is too short");
	      }else{
	       model.addAttribute("name", student.getName());
	      }     
	      if( student.getAge() < 10 ){
	         throw new SpringException("Given age is too low");
	      }else{
	       model.addAttribute("age", student.getAge());
	      }
	      model.addAttribute("id", student.getId());
	      return "result";
	   }

}
