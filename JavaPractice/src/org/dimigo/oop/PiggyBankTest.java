/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ PiggyBankTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 *
 * @author : Hvid
 * @version : 1.0
 */
public class PiggyBankTest {

	public static void main(String[] args) {
		FamilyMember[] family = { new FamilyMember("아빠"), new FamilyMember("엄마"), new FamilyMember("나"),
				new FamilyMember("남동생") };
		int balance = 20000;

		FamilyMember.printMemberCnt();
		for (FamilyMember _family : family) {
			balance /= 2000;
			balance *= 1000;
			PiggyBank.putMoney(_family, balance);
		}

		PiggyBank.printBalance();
		PiggyBank.putMoney(family[2], balance);
		PiggyBank.printBalance();

	}

}
