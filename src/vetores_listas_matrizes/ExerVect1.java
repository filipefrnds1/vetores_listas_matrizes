package vetores_listas_matrizes;

import java.util.Locale;
import java.util.Scanner;

import algclasses.ClassRoom;

public class ExerVect1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("How many rooms will be rented? ");
		int rooms = sc.nextInt();
		sc.nextLine();
		ClassRoom[] cr = new ClassRoom[10];
		
		for(int i = 0; i < rooms; i++) {
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: " );
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			cr[room] = new ClassRoom(name,email);
					
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int j = 0; j < cr.length; j++) {
			if(cr[j] != null) {
				System.out.println(j + ": " + cr[j]);
				//System.out.println(j + ": " + cr[j].getName() + ", " + cr[j].getEmail());
			}
		}
		sc.close();
	}

}
