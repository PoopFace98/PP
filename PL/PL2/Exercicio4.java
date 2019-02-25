import java.util.Scanner;

public class Exercicio4{
	public static void main(String[] args){
		System.out.println("Data dia seguinte");
		Scanner input = new Scanner(System.in); 
	
		System.out.println("Introduza o ano");
		int ano = input.nextInt();
		boolean bissexto = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);
		
		
		System.out.println("Introduza o mes");
		int mes = input.nextInt();
		
		
		System.out.println("Introduza o dia");
		int dia = input.nextInt();
		
		boolean ultimoDiaMes = dia == 31 || (dia == 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) || (mes == 2 && (dia == 28 && !bissexto || dia == 29 && bisexto));
		
		int proximaDataDia, proximaDataMes, proximaDataAno;
		
		if(ultimoDiaMes){
			proximaDataDia = 1;
			
			if(mes == 12){
				proximaDataMes = 1;
				proximaDataAno = ano + 1;
			}else{
				proximaDataMes = mes + 1;
				proximaDataAno = ano;
			}
		}else{
			
		}
		
		System.out.println("Decorreram " + total + " segundos desde a meia noite");
	}	
}
