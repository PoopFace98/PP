class Motorista extends Empregado{
    private static double valorAdicionaKm;
    private int KmPercorridos;

    //construtor vazio
    public Motorista(){

    }

    //construtor para inicialisar os campos
    public Motorista(String codigo, String nome, int diasTrabalho, double salarioDia, double valorAdicionaKm, int KmPercorridos){
        super(codigo,nome,diasTrabalho,salarioDia);

        this.valorAdicionaKm=valorAdicionaKm;
        this.KmPercorridos=KmPercorridos;
    }
    
    //metodos get
    public double getValorAdicionaKm(){
        return this.valorAdicionaKm;
    }

    public int getKmPercorridos(){
        return this.KmPercorridos;
    }

    //metodos set
    public void setValorAdicionaKm(double valorAdicionaKm){
        this.valorAdicionaKm=valorAdicionaKm;
    }

    public void setKmPercorridos(int KmPercorridos){
        this.KmPercorridos=KmPercorridos;
    }

    //metodo para calcular o salario bruto
    public double calculaSalarioBruto(){
        double salario=super.calculaSalarioBruto();
        salario+=valorAdicionaKm;

        return salario;
    }    
    
}