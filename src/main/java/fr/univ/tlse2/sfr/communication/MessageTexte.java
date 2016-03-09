package fr.univ.tlse2.sfr.communication;

/**
 * Un simple message texte.
 */
public class MessageTexte {

	public String contenu;
	
	public MessageTexte(){
		contenu = "";
	}
	
	public MessageTexte(String contenu) {
		this.contenu = contenu;
	}
	
	public String get_contenu() {
		return contenu;
	}
}
