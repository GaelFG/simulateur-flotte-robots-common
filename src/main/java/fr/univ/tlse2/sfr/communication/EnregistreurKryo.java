package fr.univ.tlse2.sfr.communication;


import java.util.LinkedList;
import java.util.List;

import com.esotericsoftware.kryo.Kryo;

/**
 * Classe utilitaire permettant d'enregistrer au près de Kryo les classes à envoyer sur le réseau.
 * fournit une méthode statique permettant d'enregistrer toutes les classes de message auprès d'une instance de Kryo.
 */
public final class EnregistreurKryo {
	/** La liste des instances Kryo auprès desquelles on à déjà enregistrées les classes de messages.*/
	private static List<Kryo> liste_des_kryo_deja_traites = new LinkedList<Kryo>();
	
	/** Classe statique -> Constructeur privé. */
	private EnregistreurKryo() {}
	
	/**
	 * Enregistre les classes de communication auprès d'une instance Kryo.
	 * @param kryo L'instance de Kryo auprès de laquelle on veut enregistrer les classes de communication.
	 */
	public static void enregistrerLesClassesDeCommunication(Kryo kryo) {
		boolean appelInvalide = kryo == null || liste_des_kryo_deja_traites.contains(kryo);
		if ( appelInvalide ) {
			throw new RuntimeException();
		} else {
			liste_des_kryo_deja_traites.add(kryo);
			kryo.register(DemarrerSimulation.class);
		}
	}

}
