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
	private int id_robot;
	
	/**
	 * Position de l'EtatRobot
	 * @see Position
	 */
	private Position pos_robot;
	
	/**
	 * Orientation d'un EtatRobot
	 * 
	 * @see EtatRobot#get_orientation_robot()
	 * @see EtatRobot#set_orientation_robot(int)
	 */
	private int orientation_robot;
	
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
	
	/**
	 * Retourne l'identifiant de l'EtatRobot
	 * @return L'identifiant de l'EtatRobot
	 */
	public int get_id_robot() {
		return id_robot;
	}
	
	/**
	 * Permet de modifier l'identifiant de l'EtatRobot
	 * @param id_robot
	 * 			Nouvel identifiant de l'EtatRobot
	 * 
	 * @see EtatRobot#id_robot
	 */
	public void set_id_robot(int id_robot) {
		this.id_robot = id_robot;
	}

	/**
	 * Retourne la position de l'EtatRobot
	 * @return La position de l'EtatRobot
	 */
	public Position get_pos_robot() {
		return pos_robot;
	}

	/**
	 * Permet de modifier la Position d'un EtatRobot en faisant passer une nouvelle Position en paramètre
	 * @param pos_robot 
	 * 			La nouvelle Position de l'EtatRobot
	 * @see Position
	 */
	public void set_pos_robot(Position pos_robot) {
		this.pos_robot = new Position(pos_robot);
	}

	/**
	 * Retourne l'orientation de l'EtatRobot
	 * @return l'orientation de l'EtatRobot
	 */
	public int get_orientation_robot() {
		return orientation_robot;
	}

	/**
	 * Permet de modifier l'orientation de l'EtatRobot en faisant passer une nouvelle orientation en paramètre
	 * @param orientation_robot
	 * 			La nouvelle orientation de l'EtatRobot
	 * 
	 * @see EtatRobot#orientation_robot
	 */
	public void set_orientation_robot(int orientation_robot) {
		this.orientation_robot = orientation_robot;
	}
}
