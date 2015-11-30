package Models;

public class Position {

	private double x;
	private double y;
	
	public Position(){
		this.x = 0.0;
		this.y = 0.0;
	}
	
	public Position(Position pos){
		this.x = pos.getX();
		this.y = pos.getY();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
