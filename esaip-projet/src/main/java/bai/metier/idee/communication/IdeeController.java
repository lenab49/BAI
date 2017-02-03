package bai.metier.idee.communication;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bai.metier.idee.service.IdeeService;

@Controller
public class IdeeController {

	final IdeeService ideeService;

	@Autowired
	public IdeeController(IdeeService ideeService) {
		this.ideeService = ideeService;
	}

	@RequestMapping(value = "/idee", method = RequestMethod.GET)
	public String idee(Map<String, Object> model) {
		return "idee/idee";
	}
}
