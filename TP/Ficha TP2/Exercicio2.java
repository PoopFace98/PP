import java.util.Scanner;

public class Exercicio2{
	public static void main(String[] args){
		System.out.println("Programa de Media de 10 numeros");
		Scanner input = new Scanner(System.in); 
		float x;
		float soma = 0;
		float media;
		int c = 0;
		int v = 0;
		float percentagem = 0;
		for(int i=0; i<10; i++){
		System.out.println("Introduza um numero positivo");
			x = input.nextFloat();
			if(x>10){
				v++;
			}
			if(x>0){
				soma = x + soma;
				c++;
			}
		}
		
		media = soma / c;
		percentagem = (float)v/c * 100;
		
		System.out.println("A media dos positivos e: " + media +" e " + percentagem + "% sao maiores que 10");
	}	
}