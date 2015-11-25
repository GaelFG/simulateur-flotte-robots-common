package fr.univ.tlse2.sfr.communication;
import org.junit.Test;

import com.esotericsoftware.kryo.Kryo;
import fr.univ.tlse2.sfr.communication.EnregistreurKryo;

/**
 * Tests de la classe EnregistreurKryo.
 * Ne teste en théorie que la validité des appels et pas leur efficacité.
 * Dans la pratique si une des classes enregistrées n'es pas valide, les tests vont échouer.
 */
public class EnregistreurKryoTest {
	
	@Test 
    public void enregistrer_aupres_d_une_instance_Kryo() {
		Kryo kryo = new Kryo();
        EnregistreurKryo.enregistrerLesClassesDeCommunication(kryo);
    }
	
	@Test 
    public void enregistrer_aupres_de_trois_instance_kryo_differentes_devrait_marcher() {
		Kryo kryoA = new Kryo();
		Kryo kryoB = new Kryo();
		Kryo kryoC = new Kryo();
		
		EnregistreurKryo.enregistrerLesClassesDeCommunication(kryoA);
		EnregistreurKryo.enregistrerLesClassesDeCommunication(kryoB);
		EnregistreurKryo.enregistrerLesClassesDeCommunication(kryoC);
		
    }
	
	@Test (expected = RuntimeException.class)
    public void enregistrer_aupres_de_null_devrait_planter() {
		EnregistreurKryo.enregistrerLesClassesDeCommunication(null);
    }
	
	@Test (expected = RuntimeException.class)
    public void enregistrer_plusieurs_fois_aupres_de_la_meme_instance_kryo_devrait_planter() {
		Kryo kryo = new Kryo();
		EnregistreurKryo.enregistrerLesClassesDeCommunication(kryo);
		EnregistreurKryo.enregistrerLesClassesDeCommunication(kryo);
    }
	

}
