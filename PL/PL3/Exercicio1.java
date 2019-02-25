import java.util.Scanner;

public class Exercicio1{
	public static void main(String[] args){
		System.out.println("Programa de 10 numeros indique o maximo,minimo,media e percentagem de numeros positivos");
		Scanner input = new Scanner(System.in); 
		int x;
		
		int soma = 0;
		float media;
		float percentagem;
		int c = 0;
		int min = 0;
		int max = 0; 
		for(int i=0; i<10; i++){
		System.out.println("Introduza um numero inteiro");
			x = input.nextInt();
			soma = x + soma;
			
			if(min == 0){
				min = x;
			}
			if(max == 0){
				max = x;
			}
			if(x > 0){
				c++;
			}
			
			if(x > max){
				max = x;
			}
			if(x < min){
				min = x;
			}
		}
		
		media = soma / 10;
		percentagem = (c / 10f) * 100;
		
		System.out.println("O minimo e: " + min + ", o maximo e: " + max + ", a media e: " + media + " e a percentagem de numeros positivos e: " + percentagem);
	}	
}
