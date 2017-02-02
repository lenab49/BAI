package bai.data.acces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import bai.data.entite.BoiteAIdee;

@Transactional(propagation = Propagation.REQUIRED)
public interface BoiteAIdeeDao extends JpaRepository<BoiteAIdee, Long> {
	BoiteAIdee findByNom(String nom);
}
