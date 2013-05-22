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
		BonjourMonde hello;
		hello = new  BonjourMonde();
		hello.setName("SIO-12 slam");
		
		HelloWorld hello2 = new HelloWorld();
		hello2.setName("Mélanie");
		
		// injection manuelle du composant dans l'application
		app.setHello(hello2);	
		
		// appel du service sayHello de App
		app.sayHello();
	}

}
