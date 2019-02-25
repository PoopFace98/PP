public class Teste{
	public static void main(String[] args){
		
		Cartao c1 = new Cartao("abc123", "Goncalo", 123, 14510, 100 );
		
		System.out.println("-----------------------------------");
		System.out.println("Codigo: " + c1.getId());
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Tem " + c1.getPontos() + " pontos");
		System.out.println("Valor Total gasto em compras: " + c1.getVtotal());
		System.out.println("Taxa Premio: " + c1.getPremio());
		
		
		
		System.out.println("-----------------------------------");
		
	}







}
