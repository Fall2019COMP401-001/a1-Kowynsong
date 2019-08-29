package a1;

import java.util.Scanner;

public class A1Jedi {

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
		int[] totalHowManyBought = new int[numOfItems];
		
		// organizing customer data
		for (int i = 0; i < numOfCustomers; i++) {
			customerNames[i] = scan.next() + " " + scan.next();
			int numOfItemsBought = scan.nextInt();
			

			for (int j = 0; j < numOfItemsBought; j++) {
				int quantityEach = scan.nextInt();
				String nameOfEach = scan.next();

				for (int k = 0; k < numOfItems; k++) {

					if (nameOfEach.equals(namesOfItems[k])) {
						howManyBought[k] = howManyBought[k] + quantityEach;
					}
					
					// checking specific item arr
//					System.out.println(i + ". " + j + ". " + howManyBought[k]);
				}
				// just to make output look readable when testing
//				System.out.println();
			}
			
			for (int j = 0; j < numOfItems; j++) {
				totalHowManyBought[j] = howManyBought[j];
				System.out.println(totalHowManyBought[j] + " " + namesOfItems[j]);
			}			
		}
	}
}
