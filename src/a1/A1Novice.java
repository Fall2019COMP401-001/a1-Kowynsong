package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numOfCustomers = scan.nextInt();
		double customerTotal = 0;
		for (int howManyCustomers = 0; howManyCustomers < numOfCustomers; howManyCustomers++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int numOfItems = scan.nextInt();
			for (int howManyItems = 0; howManyItems < numOfItems; howManyItems++) {
				int numOfEachItem = scan.nextInt();
				String itemBought = scan.next();
				double priceOfItem = scan.nextDouble();
				customerTotal = customerTotal + numOfEachItem * priceOfItem;
			}
			String stringCustomerTotal = String.format("%.2f", customerTotal);
			System.out.println(firstName.charAt(0) + ". " + lastName + ": " + stringCustomerTotal);
			customerTotal = 0;
		}
	}
}
