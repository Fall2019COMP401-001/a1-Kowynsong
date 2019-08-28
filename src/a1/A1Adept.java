package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
 
		int numOfItems = scan.nextInt();

		String[] namesOfItems = new String[numOfItems];
		double[] pricesOfItems = new double[numOfItems];

		for (int i = 0; i < numOfItems; i++) {
			namesOfItems[i] = scan.next();
			pricesOfItems[i] = scan.nextDouble();
		}

		int numOfCustomers = scan.nextInt();
		double[] priceTotal = new double[numOfCustomers];
		String[] customerNames = new String[numOfCustomers];
		int[] howManyBought = new int[numOfItems];

		for (int i = 0; i < numOfCustomers; i++) {
			customerNames[i] = scan.next() + scan.next();
			int numOfItemsBought = scan.nextInt();

			// reset array per customer
			for (int j = 0; j < howManyBought.length; j++) {
				howManyBought[j] = 0;
			}

			for (int j = 0; j < numOfItemsBought; j++) {
				int quantityEach = scan.nextInt();
				String nameOfEach = scan.next();

				for (int k = 0; k < numOfItems; k++) {

					if (nameOfEach.equals(namesOfItems[k])) {
						howManyBought[k] = quantityEach;
					}
					System.out.println(i + ". " + j + ". " + howManyBought[k]);
				}
				System.out.println();
			}
			
			for (int j = 0; j < howManyBought.length; j++) {
				if (howManyBought[j] > 0) {
					priceTotal[i] = priceTotal[i] + howManyBought[j] * pricesOfItems[j];
				}
			}
			System.out.println("$" + priceTotal[i]);
		}
	}
}
