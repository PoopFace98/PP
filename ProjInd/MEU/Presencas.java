import java.util.Scanner;

public class Presencas{
	private int alunos;
	private int totaulas;
	private int presencas;
	private double media;
	private double percentagem;
	Scanner input = new Scanner(System.in); 
	
	public Presencas(int alunos, int totaulas){
		this.alunos = alunos;
		this.totaulas = totaulas;
	}
	
	public int getAlunos(){
		return alunos;
	}
	
	public int getTotaulas(){
		return totaulas;
	}
	
	public int getPresencas(){
		return presencas;
	}
	
	public double getMedia(){
		return media;
	}
	
	public double getPercentagem(){
		return percentagem;
	}
	
	public void setAlunos(int alunos){
		System.out.println("Numero de alunos inscritos");
		alunos = input.nextInt();
		alunos = alunos + alunos;
	}
	
	public void setTotaulas(int totaulas){
		System.out.println("Numero de aulas no semestre(1 a 15)");
		totaulas = input.nextInt();
		if(totaulas > 15 && totaulas < 1){
			System.out.println("Numero de aulas invalido");
			System.out.println("Numero de aulas no semestre(1 a 15)");
			totaulas = input.nextInt();
		}
	}
	
	public void setPresencas(int presencas){
		this.presencas = presencas;
	}

}