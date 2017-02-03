package bai.metier.idee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import bai.data.acces.BoiteAIdeeDao;
import bai.data.entite.Idee;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class IdeeService {

	final BoiteAIdeeDao boiteideeDao;

	@Autowired
	public IdeeService(BoiteAIdeeDao boiteideeDao) {
		this.boiteideeDao = boiteideeDao;
	}

	public void setNewIdee(Idee idee) {
		boiteideeDao.findByNom("BAI").getListeIdee().getIdee().add(idee);
	}

}
