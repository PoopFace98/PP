import java.util.Scanner;
public class Aulas {

	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		int alunos, presencas, n_aulas, presencas_total=0;
		double media;
		
	
		System.out.println ("Introduza o n� de Alunos da turma: ");
		alunos = input.nextInt ();
		
		System.out.println ("  ");
		
		System.out.println ("Insira n� de aulas previstas: ");
		n_aulas = input.nextInt ();
			while (n_aulas > 15){
			System.out.println ("N� m�ximo de aulas previsto � de 15");
			System.out.println ("Insira novamente n� de aulas previstas: ");
			n_aulas = input.nextInt ();
			}

		System.out.println ("  ");
		
		for (int i=1; i <= n_aulas; i++) {
		
		System.out.println ("Indique n� de presen�as na aula " + i);
		presencas = input.nextInt();
			while (presencas > alunos) {
				System.out.println ("N� de presen�as n�o pode ser superior ao n� de alunos");
				System.out.println ("Indique n� de presen�as na aula " + i);
				presencas = input.nextInt();
			}
				presencas_total = presencas_total + presencas;
		}

				media = presencas_total / n_aulas;
				System.out.println ("M�dia de Presen�as = " + media);
	}
		
}