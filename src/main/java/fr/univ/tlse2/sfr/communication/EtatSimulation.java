package fr.univ.tlse2.sfr.communication;

import java.util.LinkedList;

/**
 * <b>Classe EtatSimulation</b>
 * <p>Une EtatSimulation contient
 * <ul>
 * <li>Un LinkedList d'EtatRobots</li>
 * <li>Une EtatCarte</li>
 * </ul>
 * </p>
 * @author Nicolas
 */

public class EtatSimulation {
	
	/**
	 * L'EtatCarte de la simulation la flotte de robots
	 * 
	 * @see EtatCarte
	 * @see EtatSimulation#EtatSimulation()
	 * @see EtatSimulation#EtatSimulation(EtatCarte)
	 * @see EtatSimulation#EtatSimulation(EtatCarte, LinkedList)
	 * @see EtatSimulation#getCarte()
	 * @see EtatSimulation#setCarte(EtatCarte)
	 */
	private EtatCarte carte;
	
	/**
	 * La liste de tous les robots utilisés dans la simulation
	 * 
	 * @see LinkedList
	 * @see EtatRobot
	 * @see EtatSimulation#EtatSimulation()
	 * @see EtatSimulation#EtatSimulation(EtatCarte)
	 * @see EtatSimulation#EtatSimulation(EtatCarte, LinkedList)
	 * @see EtatSimulation#getListe_robots()
	 * @see EtatSimulation#ajouter_robots(EtatRobot)
	 * @see EtatSimulation#supprimer_robot(EtatRobot)
	 */
	private LinkedList<EtatRobot> liste_robots;
	
	/**
	 * Constructeur d'un EtatSimulation sans paramètres en entrée
	 * <p>Lors de la création d'un EtatSimulation  sans paramètres, la carte est créée sans paramètres et la liste des robots est vide</p>
	 * 
	 * @see EtatCarte
	 * @see EtatRobot
	 * @see LinkedList
	 * @see EtatSimulation#carte
	 * @see EtatSimulation#liste_robots
	 */
	public EtatSimulation(){
		this.carte = new EtatCarte();
		this.liste_robots = new LinkedList<EtatRobot>();
	}
	
	/**
	 * Constructeur d'un EtatSimulation avec un EtatCarte en paramètre d'entrée
	 * <p>Lors de la création d'un EtatSimulation avec un EtatCarte en paramètre, la liste des robots est vide et la carte est créée avec un EtatCarte en paramètre</p>
	 * @param p_carte
	 * 		EtatCarte à créer
	 * 
	 * @see EtatCarte
	 * @see EtatRobot
	 * @see LinkedList
	 * @see EtatSimulation#carte
	 * @see EtatSimulation#liste_robots
	 */
	public EtatSimulation(EtatCarte p_carte){
		this.liste_robots = new LinkedList<EtatRobot>();
		this.carte = new EtatCarte(p_carte.getNom_carte(),p_carte.getLargeur(),p_carte.getHauteur());
	}
	
	/**
	 * Constructeur d'un EtatSimulation avec un EtatCarte et une LinkedList d'EtatRobots en paramètre
	 * <p>Création d'un EtatSimulation avec un EtatCarte et une LinkedList d'EtatRobots en paramètre, construction de l'EtatCarte avec les attributs de l'Etatcarte passé en paramètre et Recopie de la LinkedList passée en paramètre </p>
	 * @param p_carte
	 * @param p_liste_robots
	 * 
	 * @see EtatCarte
	 * @see EtatRobot
	 * @see LinkedList
	 * @see EtatSimulation#carte
	 * @see EtatSimulation#liste_robots
	 */
	public EtatSimulation(EtatCarte p_carte, LinkedList<EtatRobot> p_liste_robots){
		this.carte = p_carte;
		this.liste_robots = p_liste_robots;
	}
	
	/**
	 * Permet d'ajouter des EtatRobots dans la LinkedList en lui faisant passer un EtatRobot en paramètre
	 * @param robot
	 * 		Un nouveau EtatRobot à ajouter dans la LinkedList
	 * 
	 * @see LinkedList
	 * @see EtatSimulation#liste_robots
	 * @see EtatRobot
	 */
	public void ajouter_robots(EtatRobot robot){
		this.getListe_robots().add(robot);
	}
	
	/**
	 * Permet de supprimer un EtatRobot de la LinkedList en lui spécifiant un EtatRobot
	 * @param robot
	 * 		EtatRobot à supprimer de la LinkedList
	 * 
	 * @see LinkedList
	 * @see EtatSimulation#liste_robots
	 * @see EtatRobot
	 */
	public void supprimer_robot(EtatRobot robot){
		this.getListe_robots().remove(robot);
	}

	/**
	 * Retourne l'EtatCarte de l'EtatSimulation
	 * @return L'EtatCarte de l'EtatSimulation
	 */
	public EtatCarte getCarte() {
		return carte;
	}

	/**
	 * Permet de modifier l'EtatCarte de l'EtatSimulation en lui spécifiant un EtatCarte
	 * @param carte
	 * 		Nouvel EtatCarte à modifier
	 * 
	 * 
	 * @see EtatCarte
	 * @see EtatSimulation#carte
	 */
	public void setCarte(EtatCarte carte) {
		this.carte = carte; // modification de la carte à revoir
	}

	/**
	 * Retourne la LinkedList des EtatRobots de l'EtatSimulation
	 * @return La LinkedList des EtatRobots de l'EtatSimulation
	 * 
	 * @see EtatRobot
	 * @see EtatSimulation#liste_robots
	 */
	public LinkedList<EtatRobot> getListe_robots() {
		return liste_robots;
	}
	
	/*
	public static void main(String[] args){
		int mode = 1;
		
		if(mode == 1){
			EtatSimulation.tester_avec_bouchon();
		}
	}
	
	public static void tester_avec_bouchon(){
		EtatRobot robot1 = new EtatRobot(0, new Position(1.0, 1.0),0);
		EtatRobot robot2 = new EtatRobot(1, new Position(2.0,2.0),0);
		EtatRobot robot3 = new EtatRobot(2, new Position(3.0, 3.0),0);
		
		EtatCarte carte= new EtatCarte("Carte",10,10);
		
		LinkedList<EtatRobot> listRobots = new LinkedList<EtatRobot>();
		
		EtatSimulation simu = new EtatSimulation(carte, listRobots);
		
		simu.getListe_robots().add(robot1);
		simu.getListe_robots().add(robot2);
		simu.getListe_robots().add(robot3);

		System.out.println("Changement de coordonnees d'un robot");
		System.out.println("Robot 1 : " + simu.getListe_robots().get(0).get_id_robot() + ", pos : " + simu.getListe_robots().get(0).get_pos_robot().get_x() + ";"+ simu.getListe_robots().get(0).get_pos_robot().get_y());
		
		simu.getListe_robots().get(0).get_pos_robot().set_x(4.0);
		simu.getListe_robots().get(0).get_pos_robot().set_y(4.0);
		
		
		System.out.println("Robot 1 : " + simu.getListe_robots().get(0).get_id_robot() + ", pos : " + simu.getListe_robots().get(0).get_pos_robot().get_x() + ";"+ simu.getListe_robots().get(0).get_pos_robot().get_y());
		
		
		System.out.println("Changement orientation d'un robot");
		System.out.println("Robot 1 : " + simu.getListe_robots().get(0).get_id_robot() + ", orientation : " + simu.getListe_robots().get(0).get_orientation_robot());
		
		simu.getListe_robots().get(0).set_orientation_robot(1);
		
		System.out.println("Robot 1 : " + simu.getListe_robots().get(0).get_id_robot() + ", orientation : " + simu.getListe_robots().get(0).get_orientation_robot());		
	}
	*/
	
}
