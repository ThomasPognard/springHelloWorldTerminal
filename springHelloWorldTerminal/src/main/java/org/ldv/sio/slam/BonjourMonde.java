package org.ldv.sio.slam;

import org.springframework.stereotype.Service;

/**
 * Spring bean
 * On donne un nom à ce bean 
 * voir App qui demande de l'injecter par défaut, à moins que le
 * fichier de configuration XML n'en impose un autre.
 */
@Service("coucou")
public class BonjourMonde implements Hello {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Spring 3 : Bonjour  " + name + " !");
	}
}