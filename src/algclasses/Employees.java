package algclasses;

public class Employees {
	
	private Integer id;
	private String name;
	private Double salario;
	
	public Employees(){
		
	}
	
	public Employees(Integer id, String name, Double salario){
		this.id = id;
		this.name = name;
		this.salario = salario;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void moreSalary(Double percent) {
		this.salario += (salario * percent/100 );
	}
	
	@Override
	public String toString() {
		return id 
				+ ", " 
				+ name + ", "
				+ salario;
	}
}
