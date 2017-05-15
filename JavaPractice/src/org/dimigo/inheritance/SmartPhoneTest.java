/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 15.
 * </pre>
 *
 * @author	: Hvid
 * @version	: 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone[] phones = {
				new IPhone("iPhone 7", "애플", 900000),
				new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		
		System.out.println(phones[0]);
		phones[0].turnOn();
		phones[0].pay();
		phones[0].useSpecialFunction(phones[0]);
		phones[0].turnOff();
		System.out.println();
		
		System.out.println(phones[1]);
		phones[1].turnOn();
		phones[1].pay();
		phones[1].useSpecialFunction(phones[1]);
		phones[1].turnOff();
		System.out.println();

	}

}
