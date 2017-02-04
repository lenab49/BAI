package bai.data.acces;

import org.springframework.data.repository.CrudRepository;

import antlr.collections.List;
import bai.data.entite.Idee;

public interface IdeeRepository extends CrudRepository<Idee, Long> {
	

	    Idee findByTitre(String titre);

}
