class Empregado{
    protected String codigo;
    protected String nome;
    protected int diasTrabalho;
    protected double salarioDia;

    //construtor vazio
    public Empregado(){

    }

    //construtor para inicializar os campos
    public Empregado(String codigo, String nome, int diasTrabalho, double salarioDia){
        this.codigo=codigo;
        this.nome=nome;
        this.diasTrabalho=diasTrabalho;
        this.salarioDia=salarioDia;
    }

    //metodos get
    public String getCodigo(){
        return this.codigo;
    }

    public String getNome(){
        return this.nome;
    }

    public int getDiasTrabalho(){
        return this.diasTrabalho;
    }

    public double getSalarioDia(){
        return this.salarioDia;
    }

    public void setCodigo(String codigo){
        this.codigo=codigo;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setDiasTrabalho(int diasTrabalho){
        this.diasTrabalho=diasTrabalho;
    }

    public void setSalarioDia(double salarioDia){
        this.salarioDia=salarioDia;
    }

    public double calculaSalarioBruto(){
        double salario=0;

        salario=diasTrabalho*salarioDia;

        return salario;
    }    

    //metodo tostring
    public String toString(){
        return "Codigo:  "+this.codigo+" Nome: "+this.nome+" Dias trabalho:"+this.diasTrabalho+" Salario dia: "+this.salarioDia;
    }    
    
    //metodo clone
    public Empregado clone(){
        Empregado tmp_func=new Empregado();

        tmp_func.setCodigo(this.codigo);
        tmp_func.setNome(this.nome);
        tmp_func.setDiasTrabalho(this.diasTrabalho);
        tmp_func.setSalarioDia(this.salarioDia);

        return tmp_func;
    }    

    //metodo equals
    public boolean equals(Object func){
        if (func instanceof Empregado) {
            Empregado tmp_func=(Empregado)func;

            if ((tmp_func.getCodigo().equals(this.codigo)) && (tmp_func.getNome().equals(this.nome)) && (tmp_func.getDiasTrabalho()==this.diasTrabalho) && (tmp_func.getSalarioDia()==this.salarioDia)) {
                return true;
            }else{
                return false;
            }

        }else{
            return false;
        }
    } 
}