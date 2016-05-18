package fr.univ.tlse2.sfr.communication;

/**
 * Demande le lancement d'une simulation au serveur.
 * Comme toutes les classes a serialiser avec Kryo, il faut que tous les attributs soient publics 
 * et qu'il existe un constructeur sans parametre.
 */
public class DemarrerSimulation {
	private ParametresSimulation parametres;
	
	public DemarrerSimulation() {
		this.setParametres(null);
	}
	
	public DemarrerSimulation(ParametresSimulation parametres) {
		this.setParametres(parametres);
	}

	public ParametresSimulation getParametres() {
		return parametres;
	}

	public void setParametres(ParametresSimulation parametres) {
		this.parametres = parametres;
	}

}
