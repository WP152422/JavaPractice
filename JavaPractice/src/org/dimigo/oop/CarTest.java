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
public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		setCarInfo(car1, "현대", "제네시스", "검정", 225, 50000000);
		setCarInfo(car2, "기아", "K7", "흰", 246, 40000000);
		setCarInfo(car3, "삼성", "SM7", "회", 200, 38000000);
		
		
		System.out.println("<<자동차목록>>");
		printCarInfo(car1);
		printCarInfo(car2);
		printCarInfo(car3);
		
		
	}
	
	public static void printCarInfo(Car car)
	{
		System.out.println("제조사명 : " + car.getCompany() + "자동차");
		System.out.println("모델명 : " + car.getModel());
		System.out.println("색상 : " + car.getColor() + "색");
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", car.getPrice())+"원");
		System.out.println();
	}
	
	public static void setCarInfo(Car car, String _company, String _model, String _color, int _maxSpeed, int _price)
	{
		car.setCompany(_company);
		car.setmodel(_model);
		car.setColor(_color);
		car.setMaxSpeed(_maxSpeed);
		car.setPrice(_price);
	}
	
	
	
}
