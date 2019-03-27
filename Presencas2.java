import java.util.Scanner;
public class Presencas2{
	public static void main(String[] args){
		
		int inscritos, presentes = 0, tot_aulas, presencastot= 0, c= 0;
		double media, percentagem;
		Scanner input = new Scanner(System.in);
		
		
		//Alunos inscritos
		System.out.println("Quantos alunos inscritos?");
		inscritos = input.nextInt();
		
		//Numero total de aulas
		System.out.println("Numero total de aulas? (Max.15)");
		tot_aulas = input.nextInt();
			while(tot_aulas > 15){
				System.out.println("Nao pode haver mais de 15 aulas");
				System.out.println("Numero total de aulas? (Max.15)");
				tot_aulas = input.nextInt();
			}
		
		//Alunos presentes em cada aula
		for(int i=1; i <= tot_aulas; i++){
			System.out.println("Numero de alunos presentes na aula " + i);
			presentes = input.nextInt();
			while(presentes > inscritos){
				System.out.println("Numero de presentes nao pode ser superior a presentes");
				System.out.println("Numero de alunos presentes na aula " + i);
				presentes = input.nextInt();
			}
			percentagem = 100-((presentes/inscritos)*100);
			if(percentagem > 20){
				c++;
			}
			presencastot = presencastot + presentes;
		}
		
		//Media de presencas
		
		media = (double)presencastot/tot_aulas;
		
		System.out.println("Media de presencas: " + media);
		System.out.println("Numero de aulas com 20% faltas: " + c);
		
	}
}