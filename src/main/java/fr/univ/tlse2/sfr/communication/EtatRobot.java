package fr.univ.tlse2.sfr.communication;

/**
 * <b>Classe EtatRobot</b>
 * <p>
 * Un EtatRobot est caractérisé par :
 * <ul>
 * <li>Un identifiant</li>
 * <li>Une position</li>
 * <li>Une orientation</li>
 * </ul>
 * </p>
 * 
 * <p>Un EtatRobot pourra changer de Position</p>
 * @author Nicolas
 *
 */

public class EtatRobot {

	/**
	 * Identifiant d'un EtatRobot
	 * 
	 * @see EtatRobot#get_id_robot()
	 * @see EtatRobot#set_id_robot(int)
	 */
	public int id_robot;
	
	/**
	 * Position de l'EtatRobot
	 * @see Position
	 */
	public Position pos_robot;
	
	/**
	 * Orientation d'un EtatRobot
	 * 
	 * @see EtatRobot#get_orientation_robot()
	 * @see EtatRobot#set_orientation_robot(int)
	 */
	public int orientation_robot;
	
	/**
	 * Constructeur d'un EtatRobot sans paramètres d'entrée
	 * <p>
	 * Par défaut, un EtatRobot créé aura un identifiant  à 0, une position en (0,0) et une orientation à 0
	 * </p>
	 * 
	 * @see EtatRobot#id_robot
	 * @see Position
	 * @see EtatRobot#orientation_robot
	 */
	public EtatRobot(){
		this.id_robot = 0;
		this.pos_robot = new Position();
		this.orientation_robot = 0 ;
	}
	
	/**
	 * <b>Constructeur d'un EtatRobot en lui faisant passer un identifiant, une position et une orientation</b>
	 * 
	 * @param id
	 * 			Identifiant de l'EtatRobot
	 * @param pos
	 * 			Position de l'EtatRobot
	 * @param orientation
	 * 			Orientation de l'EtatRobot
	 * 
	 * @see EtatRobot#id_robot
	 * @see Position
	 * @see EtatRobot#orientation_robot
	 */
	public EtatRobot(int id, Position pos, int orientation){
		this.id_robot = id;
		this.pos_robot = new Position(pos);
		this.orientation_robot = orientation;
	}
}
