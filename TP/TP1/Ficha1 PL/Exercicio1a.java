import java.util.Scanner;

public class Exercicio1a{
	public static void main(String[] args){
		System.out.println("Programa de Segundos decorridos desde o inicio do dia");
		Scanner input = new Scanner(System.in); 
	
		System.out.println("Introduza a hora");
		int horas = input.nextInt();
		
		
		System.out.println("Introduza os minutos");
		int minutos = input.nextInt();
		
		
		System.out.println("Introduza os segundos");
		int segundos = input.nextInt();
		
		double total = (horas * 3600) + (minutos *60) + segundos;
		
		System.out.println("Decorreram " + total + " segundos desde a meia noite");
	}	
}
