import java.util.Scanner;
public class Aulas {

	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		int alunos, presencas, n_aulas, presencas_total=0;
		double media;
		
	
		System.out.println ("Introduza o nº de Alunos da turma: ");
		alunos = input.nextInt ();
		
		System.out.println ("  ");
		
		System.out.println ("Insira nº de aulas previstas: ");
		n_aulas = input.nextInt ();
			while (n_aulas > 15){
			System.out.println ("Nº máximo de aulas previsto é de 15");
			System.out.println ("Insira novamente nº de aulas previstas: ");
			n_aulas = input.nextInt ();
			}

		System.out.println ("  ");
		
		for (int i=1; i <= n_aulas; i++) {
		
		System.out.println ("Indique nº de presenças na aula " + i);
		presencas = input.nextInt();
			while (presencas > alunos) {
				System.out.println ("Nº de presenças não pode ser superior ao nº de alunos");
				System.out.println ("Indique nº de presenças na aula " + i);
				presencas = input.nextInt();
			}
				presencas_total = presencas_total + presencas;
		}

				media = presencas_total / n_aulas;
				System.out.println ("Média de Presenças = " + media);
	}
		
}