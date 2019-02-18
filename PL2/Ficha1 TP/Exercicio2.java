import java.util.Scanner;

public class Exercicio2{
	public static void main(String[] args){
			System.out.println("Area e Perimetro de um retangulo");
		Scanner input = new Scanner(System.in); 
	
		System.out.println("Introduza a largura");
		int largura = input.nextInt();
		
		
		System.out.println("Introduza o comprimento");
		int comprimento = input.nextInt();
		
	
		
		double area = comprimento * largura;
		double perimetro = (2* comprimento) + (2* largura);
		System.out.println("O perimetro e " + perimetro);
		System.out.println("A area e " + area);
	}
		
}
