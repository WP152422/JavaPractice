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
public class CarTest3 {
	public static void main(String[] args) {
		Car3 car1 = new Car3("현대", "제네시스", "검정", 225, 50000000);
		Car3 car2 = new Car3("기아", "K7", "흰", 246);
		Car3 car3 = new Car3("삼성", "SM7", "회");
		
		
		
		System.out.println("<<자동차목록>>");
		printCarInfo(car1);
		printCarInfo(car2);
		printCarInfo(car3);
		
		
	}
	
	public static void printCarInfo(Car3 car)
	{
		System.out.println("제조사명 : " + car.getCompany() + "자동차");
		System.out.println("모델명 : " + car.getModel());
		System.out.println("색상 : " + car.getColor() + "색");
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", car.getPrice())+"원");
		System.out.println();
	}
	
	
	
}
