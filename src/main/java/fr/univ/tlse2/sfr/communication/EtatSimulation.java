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
	public EtatCarte carte;
	
	/**
	 * La liste de tous les robots utilisÃ©s dans la simulation
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
	public LinkedList<EtatRobot> liste_robots;
	
	/**
	 * La liste de tous les obstacles utilisÃ©s dans la simulation
	 * 
	 * @see LinkedList
	 * @see EtatObstacle
	 * @see EtatSimulation#EtatSimulation()
	 * @see EtatSimulation#EtatSimulation(EtatCarte)
	 * @see EtatSimulation#EtatSimulation(EtatCarte, LinkedList)
	 * @see EtatSimulation#getListe_obstacles()
	 * @see EtatSimulation#ajouter_obstacle(EtatObstacle)
	 * @see EtatSimulation#supprimer_obstacle(EtatObstacle)
	 */
	public LinkedList<EtatObstacle> liste_obstacles;
	
	/**
	 * Constructeur d'un EtatSimulation sans paramÃ¨tres en entrÃ©e
	 * <p>Lors de la crÃ©ation d'un EtatSimulation  sans paramÃ¨tres, la carte est crÃ©Ã©e sans paramÃ¨tres et la liste des robots est vide</p>
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
	 * Constructeur d'un EtatSimulation avec un EtatCarte en paramÃ¨tre d'entrÃ©e
	 * <p>Lors de la crÃ©ation d'un EtatSimulation avec un EtatCarte en paramÃ¨tre, la liste des robots est vide et la carte est crÃ©Ã©e avec un EtatCarte en paramÃ¨tre</p>
	 * @param p_carte
	 * 		EtatCarte Ã  crÃ©er
	 * 
	 * @see EtatCarte
	 * @see EtatRobot
	 * @see LinkedList
	 * @see EtatSimulation#carte
	 * @see EtatSimulation#liste_robots
	 */
	public EtatSimulation(EtatCarte p_carte){
		this.liste_robots = new LinkedList<EtatRobot>();
		this.carte = new EtatCarte(p_carte.nom_carte,p_carte.largeur,p_carte.hauteur);
	}
	
	/**
	 * Constructeur d'un EtatSimulation avec un EtatCarte et une LinkedList d'EtatRobots en paramÃ¨tre
	 * <p>CrÃ©ation d'un EtatSimulation avec un EtatCarte et une LinkedList d'EtatRobots en paramÃ¨tre, construction de l'EtatCarte avec les attributs de l'Etatcarte passÃ© en paramÃ¨tre et Recopie de la LinkedList passÃ©e en paramÃ¨tre </p>
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
	 * Constructeur d'un EtatSimulation avec un EtatCarte, une LinkedList d'EtatRobots et une LinkedList d'EtatObstacle en paramÃ¨tre
	 * <p>CrÃ©ation d'un EtatSimulation avec un EtatCarte, une LinkedList d'EtatRobots et une LinkedList d'EtatObstacle en paramÃ¨tre, construction de l'EtatCarte avec les attributs de l'Etatcarte passÃ© en paramÃ¨tre et Recopie de la LinkedList passÃ©e en paramÃ¨tre </p>
	 * @param p_carte
	 * @param p_liste_robots
	 * @param p_liste_obstacles
	 * 
	 * @see EtatCarte
	 * @see EtatRobot
	 * @see EtatObstacle
	 * @see LinkedList
	 * @see EtatSimulation#carte
	 * @see EtatSimulation#liste_robots
	 * @see EtatSimulation#liste_obstacles
	 */
	public EtatSimulation(EtatCarte p_carte, LinkedList<EtatRobot> p_liste_robots, LinkedList<EtatObstacle> p_liste_obstacles){
		this.carte = p_carte;
		this.liste_robots = p_liste_robots;
		this.liste_obstacles = p_liste_obstacles;
	}
	
	/**
	 * Permet d'ajouter des EtatRobots dans la LinkedList en lui faisant passer un EtatRobot en paramÃ¨tre
	 * @param robot
	 * 		Un nouveau EtatRobot Ã  ajouter dans la LinkedList
	 * 
	 * @see LinkedList
	 * @see EtatSimulation#liste_robots
	 * @see EtatRobot
	 */
	public void ajouter_robots(EtatRobot robot){
		this.liste_robots.add(robot);
	}
	
	/**
	 * Permet de supprimer un EtatRobot de la LinkedList en lui spÃ©cifiant un EtatRobot
	 * @param robot
	 * 		EtatRobot Ã  supprimer de la LinkedList
	 * 
	 * @see LinkedList
	 * @see EtatSimulation#liste_robots
	 * @see EtatRobot
	 */
	public void supprimer_robot(EtatRobot robot){
		this.liste_robots.remove(robot);
	}
	
}
