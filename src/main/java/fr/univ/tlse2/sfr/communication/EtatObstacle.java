package fr.univ.tlse2.sfr.communication;

public class EtatObstacle {
	public int taille;
	public Position position_obstacle;
	
	public EtatObstacle(){
		this.taille = 1;
		this.position_obstacle = new Position();
	}
	
	public EtatObstacle(int ptaille, Position pposition){
		this.taille = 1;
		this.position_obstacle = pposition;
	}
}
