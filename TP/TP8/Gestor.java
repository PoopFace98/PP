class Gestor extends Empregado{
    private double premioGestao;

    //construtor vazio
    public Gestor(){

    }

    //construtor para inicialisar os campos
    public Gestor(String codigo, String nome, int diasTrabalho, double salarioDia, double premioGestao){
        super(codigo,nome,diasTrabalho,salarioDia);

        this.premioGestao=premioGestao;
    }

    //metodos get
    public double getPremioGestao(){
        return this.premioGestao;
    }

    //metodos set
    public void setPremioGestao(double premioGestao){
        this.premioGestao=premioGestao;
    }

    //metodo para calcular o salario bruto
    public double calculaSalarioBruto(){
        double salario=super.calculaSalarioBruto();
        //salario+=premioGestao*salario;
        salario=salario+(1*premioGestao);

        return salario;
    }
    
}