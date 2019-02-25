public class Cartao{
	
	private double vtotal;
	private int pontos;
	private String id;
	private String nome;
	private double premio;
	
	
	public double getVtotal(){
		return vtotal;
	}
	
	public int getPontos(){
		return pontos;
	}
	
	public String getId(){
		return id;
	}
	
	public String getNome(){
		return nome;
	}
	
	public double getPremio(){
		return premio;
	}
	
	public void setVtotal(double vtotal){
		this.vtotal = vtotal;
	}
	
	public void setPontos(int pontos){
		this.pontos = pontos;
	}
	
	public void setPremio(double premio){
		this.premio = premio;
	}
	
	
	public Cartao(String id, String nome, int pontos, double vtotal, double premio){
		this.id = id;
		this.nome = nome;
		this.pontos = pontos;
		this.vtotal = vtotal;
		this.premio = premio;
	}
	
	
}