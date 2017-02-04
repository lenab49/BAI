
package bai.data;

import bai.data.entite.BoiteAIdee;
import bai.data.entite.ListeIdee;

public class Populator {

	public BoiteAIdee createBoiteAIdee() {

		/*
		 * // test pour la liste Idee idee1 = new Idee();
		 * idee1.setTitre("idee1"); idee1.setContenu("contenu1");
		 * idee1.setAuteur("auteur1");
		 * 
		 * Idee idee2 = new Idee(); idee2.setTitre("idee2");
		 * idee2.setContenu("contenu2"); idee2.setAuteur("auteur2");
		 * 
		 * Idee idee3 = new Idee(); idee3.setTitre("idee3");
		 * idee3.setContenu("contenu3"); idee3.setAuteur("auteur3");
		 */

		ListeIdee listeIdee = new ListeIdee();
		listeIdee.setNom("liste");
		/*
		 * listeIdee.getIdee().add(idee1); listeIdee.getIdee().add(idee2);
		 * listeIdee.getIdee().add(idee3); // fin test
		 */

		BoiteAIdee boiteAIdee = new BoiteAIdee();
		boiteAIdee.setNom("BAI");
		boiteAIdee.setListeIdee(listeIdee);

		return boiteAIdee;
	}

}
