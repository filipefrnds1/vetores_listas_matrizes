package algclasses;

public class Employees {
	
	private Integer id;
	private String name;
	private double salario;
	
	public Employees(){
		
	}
	
	public Employees(Integer id, String name, double salario){
		this.id = id;
		this.name = name;
		this.salario = salario;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void moreSalary(double percent) {
		this.salario += (salario * percent/100 );
	}
	
	
	public String toString() {
		return id 
				+ ", " 
				+ name + ", "
				+ salario;
	}
}
