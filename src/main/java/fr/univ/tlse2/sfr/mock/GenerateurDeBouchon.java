package fr.univ.tlse2.sfr.mock;

import java.util.LinkedList;
import java.util.List;

import fr.univ.tlse2.sfr.communication.EtatCarte;
import fr.univ.tlse2.sfr.communication.EtatRobot;
import fr.univ.tlse2.sfr.communication.EtatSimulation;
import fr.univ.tlse2.sfr.communication.Position;

public class GenerateurDeBouchon {

	public static List<EtatSimulation> generer_faux_buffer_etat_simulation(){
		
		LinkedList<EtatSimulation> bouchon = new LinkedList<EtatSimulation>() ;
		
		EtatRobot robot1 = new EtatRobot(0, new Position(1.0, 1.0),0);
		EtatRobot robot2 = new EtatRobot(1, new Position(2.0,2.0),0);
		EtatRobot robot3 = new EtatRobot(2, new Position(3.0, 3.0),0);
		
		EtatCarte carte= new EtatCarte("Carte",10,10);
		
		LinkedList<EtatRobot> listRobots = new LinkedList<EtatRobot>();
		
		EtatSimulation simu = new EtatSimulation(carte, listRobots);
		
		simu.liste_robots.add(robot1);
		simu.liste_robots.add(robot2);
		simu.liste_robots.add(robot3);

		//System.out.println("Changement de coordonnees d'un robot");
		//System.out.println("Robot 1 : " + simu.getListe_robots().get(0).get_id_robot() + ", pos : " + simu.getListe_robots().get(0).get_pos_robot().get_x() + ";"+ simu.getListe_robots().get(0).get_pos_robot().get_y());
		
		simu.liste_robots.get(0).pos_robot.x = 4.0;
		simu.liste_robots.get(0).pos_robot.y = 4.0;
		
		
		//System.out.println("Robot 1 : " + simu.getListe_robots().get(0).get_id_robot() + ", pos : " + simu.getListe_robots().get(0).get_pos_robot().get_x() + ";"+ simu.getListe_robots().get(0).get_pos_robot().get_y());
		
		
		//System.out.println("Changement orientation d'un robot");
		//System.out.println("Robot 1 : " + simu.getListe_robots().get(0).get_id_robot() + ", orientation : " + simu.getListe_robots().get(0).get_orientation_robot());
		
		simu.liste_robots.get(0).orientation_robot = 1;
		
		//System.out.println("Robot 1 : " + simu.getListe_robots().get(0).get_id_robot() + ", orientation : " + simu.getListe_robots().get(0).get_orientation_robot());		

		bouchon.add(simu);
		
		return bouchon;
	}
	
	public static List<EtatSimulation> generer_buffer_50_tours_deplacement_un_robot(){
		LinkedList<EtatSimulation> bouchon = new LinkedList<EtatSimulation>();
		int nb_tours = 50;
		
		EtatCarte carte = new EtatCarte("carte", 500, 500);
		EtatRobot robot1 = new EtatRobot(0,new Position(0.0, 0.0),0);
		EtatRobot robot2 = new EtatRobot(1,new Position(5.0,0.0),0);
		EtatRobot robot3 = new EtatRobot(2,new Position(20.0,0.0),0);
		EtatRobot robot4 = new EtatRobot(3,new Position(0.0,1.0),0);
		
		LinkedList<EtatRobot> liste_robots = new LinkedList<EtatRobot>();
		
		liste_robots.add(robot1);
		liste_robots.add(robot2);
		liste_robots.add(robot3);
		liste_robots.add(robot4);
		
		EtatSimulation simu = new EtatSimulation(carte, liste_robots);
		
		for(int i = 0; i < nb_tours ; i++){
			System.out.println("======= TOUR " + (i+1) + " =======");
			simu.liste_robots.get(0).pos_robot.x = simu.liste_robots.get(0).pos_robot.x+1.0;
			simu.liste_robots.get(1).pos_robot.x = simu.liste_robots.get(1).pos_robot.x+1.0;
			simu.liste_robots.get(2).pos_robot.x = simu.liste_robots.get(2).pos_robot.x+1.0;
			simu.liste_robots.get(3).pos_robot.x = simu.liste_robots.get(3).pos_robot.x+1.0;
			
			System.out.println("Robot 1 : " + simu.liste_robots.get(0).pos_robot.x +" ; "+ simu.liste_robots.get(0).pos_robot.y);
			System.out.println("Robot 2 : " + simu.liste_robots.get(1).pos_robot.x +" ; "+ simu.liste_robots.get(1).pos_robot.y);
			System.out.println("Robot 3 : " + simu.liste_robots.get(2).pos_robot.x +" ; "+ simu.liste_robots.get(2).pos_robot.y);
			System.out.println("Robot 4 : " + simu.liste_robots.get(3).pos_robot.x +" ; "+ simu.liste_robots.get(3).pos_robot.y);
			
			System.out.println("\n\n");
			bouchon.add(simu);
		}
		
		return bouchon;
	}
	
	public static void main(String[] args){
		int mode = 1;
		
		if(mode == 1){
			//System.out.println(GenerateurDeBouchon.generer_faux_buffer_etat_simulation());
			GenerateurDeBouchon.generer_buffer_50_tours_deplacement_un_robot();
		}
	}
	
	
}
