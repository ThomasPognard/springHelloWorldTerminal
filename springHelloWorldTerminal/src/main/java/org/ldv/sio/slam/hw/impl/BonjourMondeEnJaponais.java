package org.ldv.sio.slam.hw.impl;

import org.ldv.sio.slam.hw.Hello;

public class BonjourMondeEnJaponais implements Hello {
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public void printHello() {
		System.out.println("Spring 3 : " + "こんにちは "   + name + " !");
	}
}
