import java.util.Scanner;

public class Exercicio3{
	public static void main(String[] args){
		System.out.println("Avaliacao PP");
		Scanner input = new Scanner(System.in); 
	
		System.out.println("Introduza a media dos Mini-Testes");
		int mt = input.nextInt();
		
		System.out.println("Introduza a nota do Projeto Individual");
		int pi = input.nextInt();
		
		System.out.println("Introduza a nota do Projeto de Grupo");
		int pg = input.nextInt();
		
		double media = (mt * 0.4) + (pi * 0.25) + (pg * 0.35);
		
		if (media < 9.5 ; mt <8 ){
			double mediarecurso = (re * 0.4) + (pi * 0.25) + (pg * 0.35);
			System.out.println("Introduza a nota do Exame de Recurso");
			int re = input.nextInt();
			
		}
		
		if (pi > 8 ){
			if (pg > 9.5){
				if (mt > 8){
					if (media > 9.5){
						System.out.println("Aluno Aprovado com media de " + media);
					}else{
						System.out.println("Aluno admitido a exame de Recurso");		
						if (mediarecurso > 9.5){
							System.out.println("Aluno Aprovado com media de " + mediarecurso);
						}else{
							System.out.println("Aluno reprovado");
						}
					}
				}else{
					System.out.println("Aluno admitido a exame");
						if (mediarecurso > 9.5){
							System.out.println("Aluno Aprovado com media de " + mediarecurso);
							
						}else{
							System.out.println("Aluno reprovado");
						}
				}
			}else{
				System.out.println("Aluno nao admitido");	
			}
		}else{
			System.out.println("Aluno nao admitido");
		}
		
	}
}