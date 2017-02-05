package bai.metier.listidee.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import bai.data.acces.BoiteAIdeeDao;
import bai.data.entite.Idee;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class ListeIdeeService {
	final BoiteAIdeeDao boiteAIdeeDao;
	@Autowired
	public ListeIdeeService(BoiteAIdeeDao boiteAIdeeDao) {
		this.boiteAIdeeDao = boiteAIdeeDao;
	}
	public List<Idee> getIdee() {
		List<Idee> idees = boiteAIdeeDao.findByNom("BAI").getListeIdee().getIdee();
		if (idees.size() > 0) {
			return idees;
		}
		return Collections.emptyList();
	}

}