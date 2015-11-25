package fr.univ.tlse2.sfr.communication;

import javax.management.RuntimeErrorException;

/**
 * Demande le lancement d'une simulation au serveur.
 * Comme toutes les classes à sérialiser avec Kryo, il faut que tous les attributs soient publics 
 * et qu'il existe un constructeur sans paramètre.
 */
public class DemarrerSimulation {
	public String nom_simulation;
	
	public DemarrerSimulation( String nom_simulation) {
		if (nom_simulation == null) {
			throw new RuntimeException();
		}
		this.nom_simulation = nom_simulation;
	}
	
	public DemarrerSimulation() {
		nom_simulation = "";
	}
	
	public String getNomSimulation() {
		return nom_simulation;
	}

}
