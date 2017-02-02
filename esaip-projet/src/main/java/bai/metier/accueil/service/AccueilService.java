package bai.metier.accueil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import bai.data.acces.BoiteAIdeeDao;
import bai.data.entite.BoiteAIdee;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class AccueilService {
	final BoiteAIdeeDao boiteAIdeeDao;

	@Autowired
	public AccueilService(BoiteAIdeeDao boiteAIdeeDao) {
		this.boiteAIdeeDao = boiteAIdeeDao;
	}

	public BoiteAIdee getBoiteAIdee() {
		return boiteAIdeeDao.findByNom("TAMERE");
	}

}
