package org.ldv.sio.slam.hw;

import org.ldv.sio.slam.hw.impl.BonjourMonde;
import org.ldv.sio.slam.hw.impl.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LanceurBasique {

	public static void main(String[] args) {
		// instanciation de l'application
		App app = new App();
		
		// instanciation d'un composant
		BonjourMonde hello = new  BonjourMonde();
		hello.setName("SIO slam");
		
		// injection manuelle du composant dans l'application
		app.setHello(hello);	
		
		// appel du service sayHello de App
		app.sayHello();
	}

}
