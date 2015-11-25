package fr.univ.tlse2.sfr.communication;

import static org.junit.Assert.*;
import org.junit.Test;
import fr.univ.tlse2.sfr.communication.DemarrerSimulation;;

/**
 * Tests de la classe DemarrerSimulation
 */
public class DemarrerSimulationTest {
	
	@Test 
    public void creer_DemarrerSimulation_sans_parametres() {
		DemarrerSimulation ds = new DemarrerSimulation();
		assertEquals("",ds.getNomSimulation());
    }

	@Test 
    public void creer_DemarrerSimulation_nom_normal() {
		DemarrerSimulation ds = new DemarrerSimulation("SimuTest");
		assertEquals("SimuTest",ds.getNomSimulation());
    }
	
	@Test 
    public void creer_DemarrerSimulation_nom_vide() {
		DemarrerSimulation ds = new DemarrerSimulation("");
		assertEquals("",ds.getNomSimulation());
    }
	
	
	@Test (expected = RuntimeException.class)
    public void creer_DemarrerSimulation_avec_nomSimulation_null_devrait_planter() {
		new DemarrerSimulation(null);
    }

}
