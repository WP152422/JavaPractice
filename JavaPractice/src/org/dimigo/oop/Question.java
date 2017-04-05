/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author : Hvid
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] question = { "가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목은?" };
		String[] answer = { "화나", "베네딕트 컴버배치", "응용 프로그래밍" };
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("" + (i + 1) + ". " + question[i]);
			System.out.println((answer[i].equals(scanner.nextLine())) ? "정답입니다!" : "틀렸습니다!");
		}
		System.out.println("<<결과 출력>>");
		StringBuilder print;
		for (int i = 0; i < 3; i++) {
			print = new StringBuilder(question[i]);
			print.append(" ").append(answer[i]).append("입니다.");
			System.out.println(print);
		}

	}

}
