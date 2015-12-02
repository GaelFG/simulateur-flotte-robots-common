package fr.univ.tlse2.sfr.communication;

/**
 * <b>Classe EtatCarte</b>
 * <p>Un EtatCarte sera caractérisé par :
 * <ul>
 * <li>Un nom de d'EtatCarte</li>
 * <li>Une largeur</li>
 * <li>Une hauteur</li>
 * </ul>
 * </p>
 * 
 * @author Nicolas
 */
public class EtatCarte {

	/**
	 * Nom de l'EtatCarte
	 * 
	 * @see EtatCarte#EtatCarte()
	 * @see EtatCarte#EtatCarte(String, int, int)
	 * @see EtatCarte#getNom_carte()
	 * @see EtatCarte#setNom_carte(String)
	 */
	private String nom_carte;
	
	/**
	 * Largeur de l'EtatCarte
	 * 
	 * @see EtatCarte#EtatCarte()
	 * @see EtatCarte#EtatCarte(String, int, int)
	 * @see EtatCarte#getLargeur()
	 * @see EtatCarte#setLargeur(int)
	 */
	private int largeur;
	
	/**
	 * Hauteur de l'EtatCarte
	 * 
	 * @see EtatCarte#EtatCarte()
	 * @see EtatCarte#EtatCarte(String, int, int)
	 * @see EtatCarte#getHauteur()
	 * @see EtatCarte#setHauteur(int) 
	 */
	private int hauteur;
	
	/**
	 * Constructeur d'un EtatCarte sans paramètres d'entrée
	 * <p>
	 * Lors de la création d'un EtatCarte sans paramètres en entrée, le nom_carte vaut "", la hauteur et la largeur valent 0
	 * </p>
	 * 
	 * @see EtatCarte#nom_carte
	 * @see EtatCarte#largeur
	 * @see EtatCarte#hauteur
	 */
	public EtatCarte(){
		this.nom_carte = new String();
		this.largeur = 0;
		this.hauteur = 0;
	}
	
	/**
	 * Constructeur d'un EtatCarte en faisant passer un nom, une largeur et une hauteur en paramètre
	 *
	 * @param nom 
	 * 		Le nouveau nom de l'EtatCarte
	 * @param p_largeur
	 * 		La nouvelle largeur de l'EtatCarte 
	 * @param p_hauteur
	 * 		La nouvelle hauteur de l'EtatCarte
	 * 
	 * @see EtatCarte#nom_carte
	 * @see EtatCarte#largeur
	 * @see EtatCarte#hauteur 
	 */
	public EtatCarte(String nom, int p_largeur, int p_hauteur){
		this.nom_carte = nom;
		this.largeur = p_largeur;
		this.hauteur = p_hauteur;
	}

	/**
	 * Retourne le nom de l'EtatCarte
	 * @return Le nom de l'EtatCarte
	 */
	public String getNom_carte() {
		return nom_carte;
	}

	/**
	 * Permet de modifier le nom de l'EtatCarte en faisant passer un nouveau nom en paramètre
	 * @param nom_carte
	 * 			Le nouveau nom de l'EtatCarte
	 * 
	 * @see EtatCarte#nom_carte
	 */
	public void setNom_carte(String nom_carte) {
		this.nom_carte = nom_carte;
	}

	/**
	 * Retourne la largeur de l'EtatCarte
	 * @return La largeur de l'EtatCarte
	 * 
	 */
	public int getLargeur() {
		return largeur;
	}

	/**
	 * Permet de modifier la largeur de l'EtatCarte en faisant passer une nouvelle largeur en paramètre
	 * @param largeur 
	 * 			La nouvelle largeur de la Carte
	 * 
	 * @see EtatCarte#largeur
	 */
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	/**
	 * Retourne la hauteur de l'EtatCarte
	 * @return La hauteur de l'EtatCarte
	 */
	public int getHauteur() {
		return hauteur;
	}

	/**
	 * Permet de modifier la hauteur de l'EtatCarte en faisant passer une nouvelle hauteur en paramètre
	 * @param hauteur
	 * 		La nouvelle hauteur de l'EtatCarte
	 */
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	
}
