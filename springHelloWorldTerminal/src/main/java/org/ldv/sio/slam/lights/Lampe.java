/**
 * Interface de service pour l'opération Hello.
 * les classes d'implémentation devront donner corps à (implémenter)
 * la méthode printHello déclarée ici. 
 */
package org.ldv.sio.slam.lights;

public interface Lampe {
	public void allumer();
	public void eteindre();
	public void intensifier();
	public void diminuer();
}
