class Teste{
	public static void main(String[] args) {
		
		Presencas83702 p1 = new Presencas83702();
		p1.numeroaulas(5);
		p1.numeroalunos(15);
		p1.alunospresentes(1,16);
		p1.alunospresentes(2,4);
		p1.alunospresentes(3,8);
		p1.alunospresentes(4,0);
		p1.alunospresentes(5,4);
		p1.media();
		p1.faltas();
		
	}
}