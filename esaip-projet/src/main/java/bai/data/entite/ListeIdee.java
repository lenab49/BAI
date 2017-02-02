package bai.data.entite;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class ListeIdee {
	@Id
	@GeneratedValue
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Idee> getIdee() {
		return idee;
	}

	public void setIdee(List<Idee> idee) {
		this.idee = idee;
	}

	private String nom;
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "IDEE_ID", referencedColumnName = "ID")
	private List<Idee> idee = new ArrayList<>();

}
