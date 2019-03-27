public class Gestor extends Empregado {
	
	private double premio;
	
	public Gestor(){}
	
	public Gestor(double salDia, String codigo, String nome, int dias, double premio){
		super(salDia, codigo,nome, dias);
		this.premio = premio;
	}
	
	public void setPremio(double premio){
		this.premio=premio;
	}
	public double getPremio(){
		return premio;
	}
	
	public double salario(){
		double sal = super.salario();
		return sal + premio;
	}
	
	public void print(){
		super.print();
		System.out.println(", com premio de " + premio);
	}
}