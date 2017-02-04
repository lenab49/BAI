package bai.metier.listeidee.dto;

import org.hibernate.validator.constraints.NotEmpty;

public class IdeeDto {
	  @NotEmpty
	  private String titre;
	  @NotEmpty
	  private String contenu;
	  @NotEmpty
	  private String auteur;


	  public String getTitre() {
	    return titre;
	  }

	  public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public void setTitre(String titre) {
	    this.titre = titre;
	  }

}
