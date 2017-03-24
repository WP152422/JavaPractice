/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ CarTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author	: Hvid
 * @version	: 1.0
 */
public class CarTest2 {
	public static void main(String[] args) {
		Car2 car1 = new Car2("현대", "제네시스", "검정", 225, 50000000);
		Car2 car2 = new Car2("기아", "K7", "흰", 246, 40000000);
		Car2 car3 = new Car2("삼성", "SM7", "회", 200, 38000000);
		
		
		
		System.out.println("<<자동차목록>>");
		printCarInfo(car1);
		printCarInfo(car2);
		printCarInfo(car3);
		
		
	}
	
	public static void printCarInfo(Car2 car)
	{
		System.out.println("제조사명 : " + car.getCompany() + "자동차");
		System.out.println("모델명 : " + car.getModel());
		System.out.println("색상 : " + car.getColor() + "색");
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", car.getPrice())+"원");
		System.out.println();
	}
	
	
	
}
