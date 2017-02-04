package bai.metier.accueil.communication;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bai.data.acces.IdeeRepository;
import bai.data.entite.BDDAction;
import bai.data.entite.Idee;
import bai.metier.accueil.service.AccueilService;
import junit.framework.Test;


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
		Idee id=new Idee();
		BDDAction tst=new BDDAction();
		id.setAuteur("lamaitresse");
		id.setContenu("en");
		id.setTitre("maillotdebain");
		tst.save(repository, id);
		return "home";
	}
}
