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
	public String nom_carte;
	
	/**
	 * Largeur de l'EtatCarte
	 * 
	 * @see EtatCarte#EtatCarte()
	 * @see EtatCarte#EtatCarte(String, int, int)
	 * @see EtatCarte#getLargeur()
	 * @see EtatCarte#setLargeur(int)
	 */
	public double largeur;
	
	/**
	 * Hauteur de l'EtatCarte
	 * 
	 * @see EtatCarte#EtatCarte()
	 * @see EtatCarte#EtatCarte(String, int, int)
	 * @see EtatCarte#getHauteur()
	 * @see EtatCarte#setHauteur(int) 
	 */
	public double hauteur;
	
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
	public EtatCarte(String nom, double p_largeur, double p_hauteur){
		this.nom_carte = nom;
		this.largeur = p_largeur;
		this.hauteur = p_hauteur;
	}
	
}
