public class Motorista extends Empregado{
	private double km;
	private static double valorkm;
	
	public Motorista(){}
	
	public Motorista(double salDia, String codigo, String nome, int dias, double km, double valorkm){
		super(salDia, codigo,nome, dias);
		this.km = km;
		this.valorkm = valorkm;
	}
	
	public void setKm(double km) {
        this.km = km;
    }

    public static void setValorkm(double valorkm) {
		valorkm = valorkm;
    }
        
    public double getKm() {
        return km;
    }

    public static double getValorKm() {
        return valorkm;
    }


	public double salario(){
		double sal = super.salario();
		return sal + km*valorkm;
	}

}