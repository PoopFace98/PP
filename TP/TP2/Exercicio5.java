
public class Exercicio5{
	public static void main(String[] args){
		System.out.println("Programa de Media de 6 numeros do array");
		
		int[] array = {23,6,47,35,2,14};
		int total = 0;
		
		for(int i=0; i<array.length; i++){
        	total = total + array[i];
        }

        float media = (float)total / array.length;
       
		System.out.println("A media e: " + media);
		
		
	}	
}
