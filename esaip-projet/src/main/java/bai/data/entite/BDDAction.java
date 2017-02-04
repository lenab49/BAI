package bai.data.entite;

import bai.data.acces.IdeeRepository;

public class BDDAction {
	
	public void save(IdeeRepository repository,Idee idee){
	
	repository.save(idee);

	}

}
