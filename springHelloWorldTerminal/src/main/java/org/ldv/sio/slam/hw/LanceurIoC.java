package org.ldv.sio.slam.hw;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LanceurIoC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String main = "";
		do {
			System.out.println("Saisir la langue (français, anglais, japonais) : ");
			main = sc.next();
		}
		while(!"français".equals(main) && !"anglais".equals(main) && !"japonais".equals(main));
		
		// chargement et initialisation du framework Spring
		ApplicationContext context = new ClassPathXmlApplicationContext(
		    "spring-conf.xml");
		
		// demande explicite d'un bean instance de cette classe (voir fichier XML)
		App app = (App) context.getBean(main);
		App app2 = (App) context.getBean("mainprenom");
		
		// appel d'un de ses services publics (ici la méthode sayHello et sayPrenom)
		app.sayHello(); 
		app2.sayPrenom();
		
	}

}
