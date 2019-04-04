import java.util.Scanner;

class Teste{
    public static void main(String[] args){
        Gestor func1 = new Gestor("001","Func_A",20,100,5);
        Motorista func2=new Motorista("002","Func_B",10,30,2,500);
        Empregado func3=new Empregado("003","Func_C",5,5);

        ListaEmpregados listTrabalhadores=new ListaEmpregados();

        listTrabalhadores.addEmpregado(func1);
        listTrabalhadores.addEmpregado(func2);
        listTrabalhadores.addEmpregado(func3);

        System.out.println("A empresa tem: "+listTrabalhadores.getTotalEmpregados()+" trabalhadores");
        System.out.println("No final do mes a empresa tem que pagar: "+listTrabalhadores.getTotalSalarios()+" em salarios");
        System.out.println("No final do mes os motoristas percorreram: "+listTrabalhadores.getTotalKmPercorridos()+" km");
        System.out.println("A empresa tem : "+listTrabalhadores.getTotalGestores()+" gestores");
        System.out.println("A empresa tem : "+listTrabalhadores.getTotalMotoristas()+" motoristas");

        Scanner reader=new Scanner(System.in);
        String tipoFuncionario="";

        System.out.println("Introduza o tipo de funcionario (empregado - gestor - motorista):");
        tipoFuncionario=reader.next();

		
			if (tipoFuncionario.equals("motorista")) {
				System.out.println("A empresa tem : "+listTrabalhadores.getTotalMotoristas()+" motoristas");
			}
			if (tipoFuncionario.equals("gestor")) {
				System.out.println("A empresa tem : "+listTrabalhadores.getTotalGestores()+" gestores");
			   
			}
			if (tipoFuncionario.equals("empregado")) {
				System.out.println("A empresa tem : "+(listTrabalhadores.getTotalEmpregados()-listTrabalhadores.getTotalGestores()-listTrabalhadores.getTotalMotoristas())+" empregados");
			}

    }
}