package bai.data.entite;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BoiteAIdee {
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	@OneToOne(cascade = CascadeType.ALL)
	private ListeIdee listeIdee;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ListeIdee getListeIdee() {
		return listeIdee;
	}

	public void setListeIdee(ListeIdee listeIdee) {
		this.listeIdee = listeIdee;
	}

}