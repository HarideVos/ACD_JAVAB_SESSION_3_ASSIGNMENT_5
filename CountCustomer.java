package threepointfive;

import java.util.Scanner;

public class CountCustomer {



	public static void main(String[] args) {
		System.out.println("Customer Count: " + Customer.getCustCount());
		int custNo;
			String custName;
			int n = 3;
			Customer[] c = new Customer[n];
			Scanner sc = new Scanner(System.in);
			for (int i=0; i < n; i++) {
				System.out.print("Enter customer number: ");
				custNo = sc.nextInt();
				if (sc.hasNextLine()) {
					sc.nextLine();
				}
				System.out.print("Enter customer name: ");
				custName = sc.nextLine();
				c[i] = new Customer(custNo, custName);
				System.out.println("Customer count: " + Customer.getCustCount());
			}
			sc.close();
		}
	}


