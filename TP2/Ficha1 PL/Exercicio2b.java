import java.util.Scanner;

public class Exercicio2b{
	public static void main(String[] args){
		System.out.println("Perimetro triangulo sabendo os catetos");
		Scanner input = new Scanner(System.in); 
	
		System.out.println("Introduza o primeiro cateto");
		int cateto1 = input.nextInt();
		
		System.out.println("Introduza o segundo cateto");
		int cateto2 = input.nextInt();
		
		double hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2)) ;
		double perimetro = cateto1 + cateto2 + hipotenusa;
		
		System.out.println("O perimetro e: " + perimetro);
	}	
}
