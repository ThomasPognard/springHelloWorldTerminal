/**
 * Illustration d'une mise en oeuvre de IoC (ou inversion de dépendance)
 * avec Spring 3, pilotée par des annotations et un fichier de configuration XML
 * @author kpu - fevrier 2012 pour SIO LDV - Melun
 */

package org.ldv.sio.slam.lights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private Lampe obj;

	/**
	 * constructeur par défaut pour les besoins d'instanciation Remarque :
	 * considéré présent par défaut si aucun autre constructeur n'est défini
	 */
	public App() {
	}

	/**
	 * Point d'injection utilisé par Spring (un setter prenant en argument un
	 * objet implémentant l'interface Hello).
	 * "coucou" est le nom (qualifé) du bean à injecter (voir fichier XML)
	 */
	@Autowired
	@Qualifier("coucou")
	public void setLampe(Lampe o) {
		obj = o;
	}

	/**
	 * soutraite le service sayHello à un objet de type Hello (et sa méthode printHello)
	 */
	public void allumer() {
		obj.allumer();
	}

	public static void main(String[] args) {
		// chargement et initialisation du framework Spring
		ApplicationContext context = new ClassPathXmlApplicationContext(
		    "spring-conf.xml");

		// demande explicite d'un bean instance de cette classe (voir fichier XML)
		App app = (App) context.getBean("main");
		
		// appel d'un de ses services publics (ici la méthode sayHello)
		app.allumer();
	}
}