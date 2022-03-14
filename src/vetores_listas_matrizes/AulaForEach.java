package vetores_listas_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class AulaForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for(int i = 0; i <vect.length ; i++) {
			System.out.println(vect[i]);
		}
		
		for (String obj : vect) {
			System.out.println(obj);
		}
		
		
		
		sc.close();
	}

}
