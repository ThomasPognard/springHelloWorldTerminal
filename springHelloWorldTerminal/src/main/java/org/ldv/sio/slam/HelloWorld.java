package org.ldv.sio.slam;

/**
 * Spring bean
 * 
 */

public class HelloWorld implements Hello {
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public void printHello() {
		System.out.println("Spring 3 : Hello " + name + " !");
	}
}