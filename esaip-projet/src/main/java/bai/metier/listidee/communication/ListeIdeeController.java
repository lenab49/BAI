package bai.metier.listidee.communication;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bai.metier.listidee.service.ListeIdeeService;

@Controller
public class ListeIdeeController {

	final ListeIdeeService listeIdeeService;

	@Autowired
	public ListeIdeeController(ListeIdeeService listeIdeeService) {
		this.listeIdeeService = listeIdeeService;
	}

	@RequestMapping(value = "/listeidee", method = RequestMethod.GET)
	public String listeIdee(Map<String, Object> model) {
		// model.put("idee", carteService.getPizzas());
		return "idee/listeidee";
	}
}
