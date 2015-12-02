package fr.univ.tlse2.sfr.communication;

import java.util.LinkedList;

public class EtatSimulation {
	private EtatCarte carte;
	private LinkedList<EtatRobot> liste_robots;
	
	public EtatSimulation(){
		this.carte = new EtatCarte();
		this.liste_robots = new LinkedList<EtatRobot>();
	}
	
	public EtatSimulation(EtatCarte p_carte){
		this.carte = new EtatCarte(p_carte.getNom_carte(),p_carte.getLargeur(),p_carte.getHauteur());
	}
	
	public EtatSimulation(EtatCarte p_carte, LinkedList<EtatRobot> p_liste_robots){
		this.carte = new EtatCarte(p_carte.getNom_carte(),p_carte.getLargeur(),p_carte.getHauteur());
		this.liste_robots = new LinkedList<EtatRobot>(liste_robots);
	}
	
	public void ajouter_robots(EtatRobot robot){
		this.getListe_robots().add(robot);
	}
	
	public void supprimer_robot(EtatRobot robot){
		this.getListe_robots().remove(robot);
	}

	public EtatCarte getCarte() {
		return carte;
	}

	public void setCarte(EtatCarte carte) {
		this.carte = carte;
	}

	public LinkedList<EtatRobot> getListe_robots() {
		return liste_robots;
	}

	public void setListe_robots(LinkedList<EtatRobot> liste_robots) {
		this.liste_robots = liste_robots;
	}
	
	
	
}
