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
		
		list.add("Geraldo");
		list.add("Gabriel");
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
		
		
		List<String > result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());//tipo stream 
		// tipo stream é um tipo que aceita operações lambda, aqui é convertido a lista para o tipo stream.
		//depois é chamado o filter, pois ele quem recebe o predicado, mas o tipo stream não é compativel com listas.
		// pra converter novamente para listas é preciso usar o collect(Collectors.tolist());
		//
	
		System.out.println("--------------------------");
		for(String y : result) {
			System.out.println(y);
		}
		
		System.out.println("-----------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
		String name1 = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		String name2 = list.stream().filter(x -> x.charAt(0) == 'G').findAny().orElse(null);
		
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
		sc.close();
	}

}
