import java.util.Scanner;

public class Exercicio1{
	public static void main(String[] args){
		System.out.println("Programa de Media de 10 numeros");
		Scanner input = new Scanner(System.in); 
		float x;
		float soma = 0;
		float media;
		int c = 0;
		for(int i=0; i<10; i++){
		System.out.println("Introduza um numero positivo");
			x = input.nextFloat();
			if(x>0){
				soma = x + soma;
				c++;
			}
		}
		
		media = soma / c;
		
		System.out.println("A media dos positivos e: " + media);
	}	
}
