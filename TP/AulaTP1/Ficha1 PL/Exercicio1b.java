import java.util.Scanner;

public class Exercicio1b{
	public static void main(String[] args){
		System.out.println("Programa de horas e minutos correntes dados os minutos corridos");
		Scanner input = new Scanner(System.in); 
	
		System.out.println("Introduza os minutos decorridos desde o inicio do dia");
		int minutostot = input.nextInt();
		
		
		int horas = minutostot / 60;
		int minutos = minutostot - (horas * 60);
		
		System.out.println("Decorreram " + horas + " horas e " + minutos + " minutos.");
	}	
}
