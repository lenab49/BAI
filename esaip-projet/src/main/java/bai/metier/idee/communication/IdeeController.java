package bai.metier.idee.communication;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import bai.metier.idee.service.IdeeService;
import bai.metier.listeidee.dto.IdeeDto;
import bai.data.entite.*;



@Controller
public class IdeeController {
	  final IdeeService ideeService;
	 
	  @Autowired
	  public IdeeController(IdeeService ideeService) {
	    this.ideeService = ideeService;
	  }
	  @GetMapping("/idee")
	    public String greetingForm(Model model) {
	        model.addAttribute("ideedto", new IdeeDto());
	        
	       
	        return "idee/idee";
	    }

	    @PostMapping("/greeting")
	    public String greetingSubmit(@ModelAttribute IdeeDto ideedto) {
	        return "result";
	    }

	}



