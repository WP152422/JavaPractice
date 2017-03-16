package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		int damage = 100;
		int choice = 1;
		Scanner scanner = new Scanner(System.in);
		String[] job = { "마법사", "영주", "기사", "농민" };
		while (choice != 9) {
			System.out.println("-------------------");
			System.out.println("<<게임 메뉴>>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("-------------------");
			System.out.print("메뉴 입력=> ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				damage += 10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : " + damage);
				break;
			case 2:
				damage -= 10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : " + damage);
				break;
			case 3:
				System.out.println(job[new Random().nextInt(4)] + "(으)로 설정되었습니다");
				break;
			case 9:
				break;
			default:
				System.out.println("없는 메뉴입니다!!");
			}
		}
		System.out.println("이제 공부하세요!");
	}
}
