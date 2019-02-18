import java.util.Scanner;

public class Exercicio1{
	public static void main(String[] args){
		System.out.println("Media de 3 numeros");
		Scanner input = new Scanner(System.in); 
	
		System.out.println("Introduza o primeiro numero");
		int numero1 = input.nextInt();
		
		
		System.out.println("Introduza o segundo numero");
		int numero2 = input.nextInt();
		
		
		System.out.println("Introduza o terceiro numero");
		int numero3 = input.nextInt();
		
		double media = (numero1 + numero2 + numero3) / 3;
		
		System.out.println("Media: " + media);
	}
	
	
	
	
}