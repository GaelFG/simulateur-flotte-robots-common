package fr.univ.tlse2.sfr.communication;

/** Les paramètres de départ d'une simulation. */
public class ParametresSimulation {
	public String nom_simulation;
	public int nombre_robots;
	public int nombre_obstacles;
	
	public ParametresSimulation(String nom_simulation, int nombre_robots, int nombre_obstacles ) {
		this.nom_simulation = nom_simulation;
		this.nombre_robots = nombre_robots;
		this.nombre_obstacles = nombre_robots;
	}
	
	public ParametresSimulation() {
		nom_simulation = "";
		nombre_robots = 0;
		nombre_obstacles = 0;
	}
	
	public String getNomSimulation() {
		return nom_simulation;
	}
}
