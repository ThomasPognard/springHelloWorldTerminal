package org.ldv.sio.slam.hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LanceurIoC {

	public static void main(String[] args) {
		// chargement et initialisation du framework Spring
		ApplicationContext context = new ClassPathXmlApplicationContext(
		    "spring-conf.xml");

		// demande explicite d'un bean instance de cette classe (voir fichier XML)
		App app = (App) context.getBean("main");
		
		// appel d'un de ses services publics (ici la méthode sayHello)
		app.sayHello();
	}

}
