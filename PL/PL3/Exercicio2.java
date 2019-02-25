import java.util.Scanner;

public class Exercicio2{
	public static void main(String[] args){
		
		int opcao;
		int x;
		int soma = 0;
		float media;
		float percentagem;
		int c = 0;
		int min = 0;
		int max = 0; 
		
		System.out.println("-------------Escolha uma das opcoes------------");
		System.out.println("1 - Maximo e minimo de 10 numeros");
		System.out.println("2- Media de 10 numeros");
		System.out.println("3 - Percentagem de numeros positivos");
		Scanner input = new Scanner(System.in); 
			opcao = input.nextInt();
		
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
		
		if(opcao == 1){
		System.out.println("O minimo e: " + min + " e o maximo e: " + max );
		}
		if(opcao == 2){
		System.out.println("A media e: " + media );
		}
		if(opcao == 3){
		System.out.println("A percentagem de numeros positivos e:" + percentagem + "%");
		}
		}	
}
