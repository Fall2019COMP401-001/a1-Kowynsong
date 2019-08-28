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

		// organizing customer data
		for (int i = 0; i < numOfCustomers; i++) {
			customerNames[i] = scan.next() + " " + scan.next();
			int numOfItemsBought = scan.nextInt();

			// reset specific item array data per customer
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
					
					// checking specific item arr
//					System.out.println(i + ". " + j + ". " + howManyBought[k]);
				}
				// just to make output look readable when testing
//				System.out.println();
			}
			
			for (int j = 0; j < howManyBought.length; j++) {
				if (howManyBought[j] > 0) {
					priceTotal[i] = priceTotal[i] + howManyBought[j] * pricesOfItems[j];
				}
			}
//			System.out.println("$" + priceTotal[i]);
			
		}
		
		// biggest function
		double biggestPrice = 0;
		for (int i = 0; i < priceTotal.length; i++) {
			if (biggestPrice <= priceTotal[i]) {
				biggestPrice =  priceTotal[i];
			}
		}
		String biggestPriceString = String.format("%.2f", biggestPrice);

		for (int i = 0; i < priceTotal.length; i++) {
			if (biggestPrice == priceTotal[i]) {
				System.out.println("Biggest: " + customerNames[i] + 
						" (" + biggestPriceString + ")");
			}
		}
		
		// smallest function
		double smallestPrice = 2147483647;
		for (int i = 0; i < priceTotal.length; i++) {
			if (smallestPrice >= priceTotal[i]) {
				smallestPrice =  priceTotal[i];
			}
		}
		String smallestPriceString = String.format("%.2f", smallestPrice);

		for (int i = 0; i < priceTotal.length; i++) {
			if (smallestPrice == priceTotal[i]) {
				System.out.println("Smallest: " + customerNames[i] + 
						" (" + smallestPriceString + ")");
			}
		}
		
		// avg function
		double averagePrice = 0;
		for (int i = 0; i < priceTotal.length; i++) {
			averagePrice = averagePrice + priceTotal[i];
		}
		String averagePriceString = String.format("%.2f", averagePrice / numOfCustomers);
		System.out.println("Average: " + averagePriceString);
	}
}
