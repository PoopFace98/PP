public class Empregado {
    
    private double salDia;
    private String codigo;
    private String nome;
    private int dias;
	private double salario;
	public Empregado(){}
	
	
    public Empregado(double salDia, String codigo, String nome, int dias) {
        this.salDia = salDia;
        this.codigo = codigo;
        this.nome = nome;
        this.dias = dias;
    }

	 public void setSalDia(double salDia) {
        this.salDia = salDia;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    public double getSalDia() {
        return salDia;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getDias() {
        return dias;
    }

	public double salario(){
		return salario = salDia*dias ;
	}
	
	public void print(){
		System.out.println("Nome: " +nome+ ", Dias trabalhados: " + dias + ", Salario diario: " + salario);
	}
	
	
	
	
	
	
	
}