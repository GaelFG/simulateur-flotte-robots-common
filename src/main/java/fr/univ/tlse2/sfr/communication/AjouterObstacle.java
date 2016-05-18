package fr.univ.tlse2.sfr.communication;

/**
 * Demande le lancement d'une simulation au serveur.
 * Comme toutes les classes à sérialiser avec Kryo, il faut que tous les attributs soient publics 
 * et qu'il existe un constructeur sans paramètre.
 */
public class AjouterObstacle {
	public Position position;
	
	public AjouterObstacle(){
		
	}
	
	public AjouterObstacle(Position position){
		this.position = position;
	}
}
