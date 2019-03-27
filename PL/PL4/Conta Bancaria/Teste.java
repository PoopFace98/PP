public class Teste{
	public static void main(String[] args){
		
		Conta c1 = new Conta("213123", "Ze", 213);
	
			c1.consultar();

			//System.out.println("Quanto pretende levantar? ");
			//c1.levantar(0);

			System.out.println("Quanto pretende depositar? ");
			c1.depositar(7);

			c1.consultar();
		
		
	}
	
	
	
	
	
	
}