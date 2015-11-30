package Models;

public class EtatRobot {

	private int id_robot;
	private Position pos_robot;
	private int orientation_robot;
	
	public EtatRobot(){
		this.id_robot = 0;
		this.pos_robot = new Position();
		this.orientation_robot = 0 ;
	}
	
	public EtatRobot(int id, Position pos, int orientation){
		this.id_robot = id;
		this.pos_robot = new Position(pos);
		this.orientation_robot = orientation;
	}
	
	public int getId_robot() {
		return id_robot;
	}

	public void setId_robot(int id_robot) {
		this.id_robot = id_robot;
	}

	public Position getPos_robot() {
		return pos_robot;
	}

	public void setPos_robot(Position pos_robot) {
		this.pos_robot = pos_robot;
	}

	public int getOrientation_robot() {
		return orientation_robot;
	}

	public void setOrientation_robot(int orientation_robot) {
		this.orientation_robot = orientation_robot;
	}
}
