class Presencas83702{
	
	private int[] alunos;
	
	public Presencas83702(){
		alunos = new int[20];
	}
	
	//registar número de aulas do semestre
	public void numeroaulas(int numero){
		numero = numero + 1;
		int[] alunos = new int[numero];
		System.out.println("Numero de Aulas: " + numero);
	}
	
	
	//registar numero de alunos na posicao 0
	public void numeroalunos(int numero){
	alunos[0] = numero;
	System.out.println("Numero de Alunos: " + numero);
	}
	
	
	//registar numero de alunos presentes em cada aula 
	public void alunospresentes(int aula, int numero){
	alunos[aula]= numero;
	System.out.print("Numero de Alunos presentes: " + numero);
	System.out.println(" ;na aula: " + aula);	
	}
	
	//calcular media
	public double media(){
		int soma = 0;
		int media = 0;
		for( int i= 1; i<=15; i++){
			soma = soma + alunos[i];
		}
		media = soma/alunos[0];
		System.out.println("Media:" + media);
		return media;
	}
	
	//numero de aulas com perc de faltas superior a 20%, quer dizer que menos de 80% vao ...
	public double faltas(){
		int faltas = 0;
		for(int i=1; i<=alunos[16]; i++){
			double quemapareceu = 0;
			quemapareceu = 100 - ((alunos[i]  * 100)/ alunos[0]);
			if (quemapareceu > 20){
			System.out.println("Aula " + i);
			}
		}
		return faltas;
	}
}