import java.util.Scanner;

public class Conta{
	private String id;
	private double saldo;
	private String nome;
	private int menu;
	
	Scanner input = new Scanner(System.in);
	
	public Conta(String id, String nome, double saldo){
		this.id = id;
		this.saldo = saldo;
		this.nome = nome;
	}
	
	public String getId(){
		return id;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void depositar(double quantia){
		
		if(quantia > 0 ){
		saldo = saldo + quantia;
		}else{
		System.out.println("Nao pode depositar quantidades negativas");
		}
	}
	public void levantar(double quantia){
		quantia = input.nextDouble();
		if( quantia > 0 && saldo >= quantia){
		saldo = saldo - quantia;
		}else{
		System.out.println("Saldo insuficiente");
		}
	}
	
	public void consultar(){
		System.out.println("Numero de conta: " + id);
		System.out.println("Titular: " + nome);
		System.out.println("Saldo: " + saldo);
	}

		
}
