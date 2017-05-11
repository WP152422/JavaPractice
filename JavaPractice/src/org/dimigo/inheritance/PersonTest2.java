/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ PersonTest2
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 11.
 * </pre>
 *
 * @author	: Hvid
 * @version	: 1.0
 */
public class PersonTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person[] people = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍")
		};
		
		for(Person person : people)
		{
			System.out.println(person);
			greeting(person);
			System.out.println();
		}

	}
	
	private static void greeting(Person p)
	{
		p.sayHello();
		p.sayBye();
	}

}
