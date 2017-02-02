package bai.metier.listidee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import bai.data.acces.BoiteAIdeeDao;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class ListeIdeeService {

	final BoiteAIdeeDao boiteAIdeeDao;

	@Autowired
	public ListeIdeeService(BoiteAIdeeDao boiteAIdeeDao) {
		this.boiteAIdeeDao = boiteAIdeeDao;
	}

	/*
	 * public List<Idee> getIdees() { List<Idee> idees =
	 * magasinDao.findByNom("BAI").getListeIdee().getIdees(); // Avoid lazy
	 * loading exception... // Should use ModelMapper for small projects if
	 * (idees.size() > 0) { return idees; } return Collections.emptyList(); }
	 */
}