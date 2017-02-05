package bai.data.acces;

import bai.data.entite.Idee;

public class BDDAction {
	
	public void save(IdeeRepository repository,Idee idee){
	
	repository.save(idee);

	}

}
