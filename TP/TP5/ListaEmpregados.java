package salario_empregados;

import java.util.ArrayList;
	
public class ListaEmpregados {

    ArrayList<Empregado> emps;
    
    public ListaEmpregados() 
    {
        emps = new ArrayList<Empregado>();
    }
    
    public boolean existe(Empregado e)
    {
        return emps.contains(e);
    }

    /**
     * 
     * @param codigo    código do empregado a verificar
     * @return          true se existe
     */
    public boolean existe(String codigo)
    {
        if (getEmpregado(codigo) != null)
            return true;
        else
            return false;
    }
        
    public Empregado getEmpregado(String codigo)
    {
        for ( Empregado e : emps)
        {
            if (e.getCodigo().equals(codigo))
            {
                return e;
            }
        }
        return null;
    }

    public ArrayList<Empregado> getListaEmpregados()
    {
        return emps;
    }
    
    public void inserirEmpregado(Empregado e)
    {
        emps.add(e);
    }
    
    public int totalKm()
    {
        int totalKm = 0;
        for (Empregado e: emps)
        {
            if (e instanceof Motorista)
            {
                totalKm += ((Motorista)e).getKmPercorridos();
            }
        }
        return totalKm;
    }
    
    @Override
    public String toString() {
        String s = "ListaEmpregados \n";
        for ( Empregado e : emps)
        {
            s += e.toString();
        }
        return s;
        
    }
    
    
}
