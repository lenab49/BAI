
package bai.data;

import bai.data.entite.BoiteAIdee;
import bai.data.entite.ListeIdee;

public class Populator {

	public BoiteAIdee createBoiteAIdee() {

		ListeIdee listeIdee = new ListeIdee();
		listeIdee.setNom("liste");
		
		BoiteAIdee boiteAIdee = new BoiteAIdee();
		boiteAIdee.setNom("BAI");
		boiteAIdee.setListeIdee(listeIdee);

		return boiteAIdee;
	}

}
