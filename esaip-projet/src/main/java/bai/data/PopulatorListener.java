package bai.data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import bai.data.acces.BoiteAIdeeDao;

@Component
@Transactional
public class PopulatorListener implements ApplicationListener<ContextRefreshedEvent> {
	  
	private final BoiteAIdeeDao dao;
	// private boolean alreadyPopulated = false;

	@Autowired
	public PopulatorListener(BoiteAIdeeDao dao) {
		this.dao = dao;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		/*
		 * if (!alreadyPopulated) { dao.save(new Populator().createMagasin());
		 * alreadyPopulated = true; }
		*/
	}
}
