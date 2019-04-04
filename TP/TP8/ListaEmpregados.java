import java.util.*;

class ListaEmpregados{
    private List<Empregado> listEmpregados;


    //construtor vazio
    public ListaEmpregados(){
        listEmpregados = new ArrayList<Empregado>();

    }

    //metodo para adicionar um novo empregado
    public void addEmpregado(Empregado tmp_empregado){
        this.listEmpregados.add(tmp_empregado);
    }

    //metodo para retornar o total de empregados da empresa
    public int getTotalEmpregados(){
        return this.listEmpregados.size();
    }

    //metodo para devolver o total de salarios a pagar
    public double getTotalSalarios(){
        double valorTotal=0;

        for(int cont=0;cont<this.listEmpregados.size();cont++){
            Empregado tmp_empregado=listEmpregados.get(cont);

            valorTotal+=tmp_empregado.calculaSalarioBruto();
        }
        return valorTotal;
    }

    //metodo para devolver o total de km percorridos pelos motoristas
    public double getTotalKmPercorridos(){
        int valorTotal=0;

        for(int cont=0;cont<this.listEmpregados.size();cont++){
            Empregado tmp_empregado=listEmpregados.get(cont);

            if(tmp_empregado instanceof Motorista) {
                valorTotal+=((Motorista)tmp_empregado).getKmPercorridos();
            }
        }
        return valorTotal;
    }

    //metodo para devolver o numero de gestores da empresa
    public double getTotalGestores(){
        int valorTotal=0;

        for(int cont=0;cont<this.listEmpregados.size();cont++){
            Empregado tmp_empregado=listEmpregados.get(cont);

            if(tmp_empregado instanceof Gestor) {
                valorTotal++;
            }
        }
        return valorTotal;
    }

    //metodo para devolver o numero de motoristas da empresa
    public double getTotalMotoristas(){
        int valorTotal=0;

        for(int cont=0;cont<this.listEmpregados.size();cont++){
            Empregado tmp_empregado=listEmpregados.get(cont);

            if(tmp_empregado instanceof Motorista) {
                valorTotal++;
            }
        }
        return valorTotal;
    }    

    //metodo para verificar se um funcionario com o codigo
    public boolean checkFuncExist(String codigo){
        for(int cont=0;cont<this.listEmpregados.size();cont++){
            Empregado tmp_empregado=listEmpregados.get(cont);

            if(tmp_empregado.codigo.equals(codigo)) {
                return true;
            }
        }
        return false;
    }

    //devolver a ficha do funcionario com o codigo
    public Empregado getEmpregado(String codigo){
        for(int cont=0;cont<this.listEmpregados.size();cont++){
            Empregado tmp_empregado=listEmpregados.get(cont);

            if(tmp_empregado.codigo.equals(codigo)) {
                return tmp_empregado;
            }
        }
        return new Empregado();
    }

}