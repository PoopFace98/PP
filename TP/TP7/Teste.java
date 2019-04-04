import java.util.Scanner;

class Teste{
    public static void main(String[] args){
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