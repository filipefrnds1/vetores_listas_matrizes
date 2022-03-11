package vetores_listas_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int n = sc.nextInt();
		
		double vet[] = new double[n];
		double x = 0;
		for(int i = 0;i < n;i++) {
			vet[i] = sc.nextDouble();
			x += vet[i];
		}
		
		System.out.printf("AVARAGE HEIGHT =%.2f%n ", x/n );
		
		
		
 		
		
		
		
		
				
		sc.close();
	}

}
