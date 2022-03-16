package vetores_listas_matrizes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import algclasses.Employees;

public class ExerPropostoL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		List<Employees> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #" + i+1 + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			//sc.nextLine();
			while(hasId(list, id)) {
				System.out.print("Id already Taken. Try again: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employees(id,name,salary));
			
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Integer pos = position(list,id);
		//Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		//if(emp == null) {
		if(pos == null) {	
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(pos).moreSalary(percentage);
			//emp.moreSalary(percentage);
		}
		
		
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Employees obj : list) {
			System.out.println(obj);
		}
		
		
		
		
		
		sc.close();
	}
	
	public static Integer position(List<Employees> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Employees> list, int id) {
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
