import java.util.Scanner;
public class Presencas{
	public static void main(String[] args) {
		
		int presentes= 0, inscritos, tot_aulas, presencatotal= 0,n_perc = 0;
		double media, percentagem;
		
		Scanner input = new Scanner (System.in);
		
		//Alunos inscritos
		System.out.println("Numero de alunos inscritos: ");
		inscritos = input.nextInt();
		
		//Numero total de aulas(max 15)
		System.out.println("Numero total de aulas no semestre");
		tot_aulas = input.nextInt();
		while(tot_aulas > 15){
			System.out.println("Total de aulas no semestre nao pode ser superior a 15");
			System.out.println("Numero total de aulas no semestre");
			tot_aulas = input.nextInt();
		}
		
		//Registar presencas
		for(int i = 1; i <= tot_aulas; i++){
		System.out.println("Alunos presentes na aula " + i + ": ");
		presentes = input.nextInt();
		
				while(presentes > inscritos){
					System.out.println("Alunos presentes superior a inscritos");
					System.out.println("Alunos presentes na aula " + i + ": ");
					presentes = input.nextInt();
				}
	
				percentagem = 100 -((double)presentes / inscritos * 100);
				if(percentagem > 20){
					n_perc ++;
				}
				
				presencatotal = presencatotal + presentes;
		}
		
		//media de presencas por aula
		media =(double) presencatotal / tot_aulas;
		System.out.println("Media de presencas por aula " + media);
		
		//percentagem faltas
		percentagem = presentes / inscritos * 100;
		System.out.println("Numero de aulas com mais de 20% faltas: " + n_perc);
	}
}