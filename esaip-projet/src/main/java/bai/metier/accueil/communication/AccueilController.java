package bai.metier.accueil.communication;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bai.data.acces.IdeeRepository;
import bai.metier.accueil.service.AccueilService;

@Controller
@RequestMapping(value = { "/", "/home", "/welcome" })
public class AccueilController {
	private static final long serialVersionUID = 1L;

	final AccueilService boiteAIdeeService;

	@Autowired
	public AccueilController(AccueilService boiteAIdeeService) {
		this.boiteAIdeeService = boiteAIdeeService;
	}

	@Autowired
	private IdeeRepository repository;

	@RequestMapping(method = RequestMethod.GET)
	public String home(Map<String, Object> model) {
		model.put("nom", boiteAIdeeService.getBoiteAIdee().getNom());
		model.put("slogan", "Cette application permet de recueillir vos idées");
		return "home";
	}
}
