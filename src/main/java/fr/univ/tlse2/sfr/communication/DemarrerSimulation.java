package fr.univ.tlse2.sfr.communication;

/**
 * Demande le lancement d'une simulation au serveur.
 * @author Keleb
 *
 */
public class DemarrerSimulation {
	private String nom_simulation;
	
	public DemarrerSimulation( String nom_simulation) {
		this.nom_simulation = nom_simulation;
	}
	
	public DemarrerSimulation() {
		nom_simulation = "";
	}

}
