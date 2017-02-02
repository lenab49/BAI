package bai.metier.accueil.communication;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bai.metier.accueil.service.AccueilService.WelcomeService;

public class AccueilController {

	@Controller
	@RequestMapping(value = { "/", "/home", "/welcome" })
	public class WelcomeController {
		private static final long serialVersionUID = 1L;

		final WelcomeService magasinService;

		@Autowired
		public WelcomeController(WelcomeService magasinService) {
			this.magasinService = magasinService;
		}

		@RequestMapping(method = RequestMethod.GET)
		public String home(Map<String, Object> model) {
			// model.put("nom", magasinService.getMagasin().getNom());
			// model.put("slogan", magasinService.getMagasin().getSlogan());
			model.put("nom", "Kikooo");

			return "home";
		}
	}

}
