package bai.metier.accueil.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class AccueilService {

	@Service
	@Transactional(propagation = Propagation.REQUIRED)
	public class WelcomeService {
		// final MagasinDao magasinDao;

		/*
		 * @Autowired public WelcomeService(MagasinDao magasinDao) {
		 * this.magasinDao = magasinDao; }
		 */
		/*
		 * public Magasin getMagasin() { return
		 * magasinDao.findByNom("Pizzaiole"); }
		 */

	}
}
