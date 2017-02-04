package bai.metier.idee.communication;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import bai.data.acces.IdeeRepository;
import bai.data.entite.BDDAction;
import bai.data.entite.Idee;
import bai.metier.idee.service.IdeeService;

@Controller
public class IdeeController {

	final IdeeService ideeService;
	@Autowired
	private IdeeRepository repository;

	@Autowired
	public IdeeController(IdeeService ideeService) {
		this.ideeService = ideeService;
	}

	@RequestMapping(value = "/idee", method = RequestMethod.GET)
	public String idee(Map<String, Object> model) {
		return "idee";
	}
	@RequestMapping(value="/addIdee",method=RequestMethod.POST)
	public String addIdee(@ModelAttribute Idee idee,@RequestParam("titre") String titre,@RequestParam("contenu") String contenu, @RequestParam("auteur") String auteur,ModelMap model) {
		if (idee.getAuteur() != "" && idee.getTitre() != "" && idee.getContenu() != "") {
			ideeService.setNewIdee(idee);
			BDDAction bdd = new BDDAction();
			bdd.save(repository, idee);
			model.put("idees", ideeService.getIdee());
			   
		}
		
		
		return "idee/listeidee";
	}
	
	

}
