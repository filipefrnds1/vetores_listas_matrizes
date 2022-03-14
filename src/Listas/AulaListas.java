package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AulaListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();//ctrl+shift+o para importar a lista. Obs: não aceita tipos primitivos
		
		list.add("Maria");
		list.add("Filipe");
		list.add("Joao");
		list.add("Jacque");
		list.add("Gugu");
		list.add("Fernanda");
		
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		//list.remove("Filipe");
		//list.remove(1);
		
		
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------------");
		//list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');//essa função lambda se chama predicado.
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		System.out.println("Index of Bob: " + list.indexOf("Filipe"));//  aparece onde está na lista
		System.out.println("Index of Gugu: " + list.indexOf("Gugu"));
		System.out.println("Index of Bob: " + list.indexOf("Bob")); // quando não encontra retorna -1
		sc.close();
		
		List<String > result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
	
		System.out.println("--------------------------");
		for(String y : result) {
			System.out.println(y);
		}
		
		System.out.println("-----------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
		String name1 = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
		System.out.println(name);
		System.out.println(name1);
	}

}
