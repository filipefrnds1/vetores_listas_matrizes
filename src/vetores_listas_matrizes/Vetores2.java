package vetores_listas_matrizes;

import java.util.Locale;
import java.util.Scanner;

import algclasses.ProductVet;

public class Vetores2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProductVet[] vect = new ProductVet[n];
		
		double sum = 0;
		
		for(int i=0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductVet(name,price);
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		
		
		sc.close();
	}

}
