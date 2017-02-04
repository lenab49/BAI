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

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import bai.data.entite.Idee;
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

	@RequestMapping(value = "/idee", method = RequestMethod.GET)
	public String idee(Map<String, Object> model) {
		return "idee";
	}

	@RequestMapping(value = "/addIdee", method = RequestMethod.POST)
	public String addIdee(@ModelAttribute Idee idee) {
		if (idee.getAuteur() != "" && idee.getTitre() != "" && idee.getContenu() != "") {
			ideeService.setNewIdee(idee);
		}
		return "idee";
	}
}