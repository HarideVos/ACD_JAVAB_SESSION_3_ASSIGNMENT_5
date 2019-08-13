package threepointfive;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int accNo;
		String accName;
		String accBal;
		double rate;
		
		System.out.print("Enter Savings account number: ");
		accNo = sc.nextInt();
		if (sc.hasNextLine()) {
			sc.nextLine();
		}
		System.out.print("Enter Savings account name: ");
		accName = sc.nextLine();
		System.out.print("Enter Savings account balance: ");
		accBal = sc.nextLine();
		System.out.print("Enter Savings account rate: ");
		rate = sc.nextDouble();
		
		Saving save = new Saving(accNo, accName, accBal, rate);
		
		System.out.println();
		
		System.out.print("Enter current account number: ");
		accNo = sc.nextInt();
		if (sc.hasNextLine()) {
			sc.nextLine();
		}
		System.out.print("Enter current account name: ");
		accName = sc.nextLine();
		System.out.print("Enter current account balance: ");
		accBal = sc.nextLine();
		System.out.print("Enter current account rate: ");
		rate = sc.nextDouble();
		
		Current curr = new Current(accNo, accName, accBal, rate);
		
		System.out.println("\n" + save + "\n");
		System.out.println(curr);
		
		sc.close();
	}
}


