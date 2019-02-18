import java.util.Scanner;

public class Exercicio2c{
	public static void main(String[] args){
		System.out.println("Perimetro triangulo sabendo os catetos");
		Scanner input = new Scanner(System.in); 
	
		System.out.println("Introduza o primeiro cateto");
		int cateto1 = input.nextInt();
		
		System.out.println("Introduza o segundo cateto");
		int cateto2 = input.nextInt();
		
		
		double area = (cateto1 * cateto2) / 2 ;
		System.out.println("A area do triangulo e: " + area);
	}	
}