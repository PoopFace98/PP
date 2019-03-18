public class Gestor extends Empregado {
	
	private double premio;
	
	
	public Gestor(double salDia, String codigo, String nome, int dias, double premio){
		this.premio = premio;
	}
	
	public void setPremio(double premio){
		this.premio=premio;
	}
	public double getPremio(){
		return premio;
	}
	
	
	
	
}