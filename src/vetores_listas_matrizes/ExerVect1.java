package vetores_listas_matrizes;

import java.util.Locale;
import java.util.Scanner;

import algclasses.ClassRoom;

public class ExerVect1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("How many rooms will be rented? ");
		int rooms = sc.nextInt();
		sc.nextLine();
		ClassRoom[] cr = new ClassRoom[9];
		
		for(int i = 0; i < rooms; i++) {
			System.out.println("Rent #" + (i+1));
			System.out.println("Name: " );
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			cr[room] = new ClassRoom(name,email);
					
		}
		
		for(int j = 0; j < 9; j++) {
			if(cr[j] != null) {
				System.out.println(j + ": " + cr[j].getName() + ", " + cr[j].getEmail());
			}
		}
		sc.close();
	}

}
