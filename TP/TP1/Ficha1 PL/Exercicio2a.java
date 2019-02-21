import java.util.Scanner;

public class Exercicio2a{
	public static void main(String[] args){
		System.out.println("Hipotenusa de um triangulo retangulo");
		Scanner input = new Scanner(System.in); 
	
		System.out.println("Introduza o primeiro cateto");
		int cateto1 = input.nextInt();
		
		System.out.println("Introduza o segundo cateto");
		int cateto2 = input.nextInt();
		
		
		double hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2)) ;
		
		System.out.println("A hipotenusa e: " + hipotenusa);
	}	
}
