public class Presencas {

    private int registados;
    private int aulas;
    private int[] presentes;

    public Presencas() {
        this.registados = 0;
        this.aulas = 15;
        this.presentes = new int[aulas];
        for (int i = 0; i<presentes.length; i++) {
            presentes[i] = 0;
        }
    }

    public Presencas(int registados, int aulas, int[] presentess) {
        this.registados = registados;
        this.aulas = aulas;
        for (int i = 0; i<presentes.length;i++) {
            presentes[i] = presentess[i];
        }
    }

    public Presencas (Presencas x) {
       this.registados = x.getRegistados();
       this.aulas = x.getAulas();
       this.presentes = x.getPresentes();
    }

    public int getRegistados() {
        return this.registados;
    }
    public int getAulas() {
        return this.aulas;
    }

     public void setAulas(int aulas) {
        this.aulas = aulas;
    }


    public int[] getPresentes() {
        int[] novo = new int[aulas];
        for (int i = 0; i<this.presentes.length;i++) {
            novo[i] = this.presentes[i];
        }
        return novo;
    }

    public void setRegistados(int registados) {
        this.registados = registados;
    }


    public void setPresentes(int[] p) {
        for (int i = 0; i<this.presentes.length;i++) {
            this.presentes[i] = p[i];
        }
    }

    public float mediaPresencas() {
        float media = 0;
        for(int i : this.presentes) {
            media += i;
        }
        return (media/aulas);
    }

    // percentagem faltas > 20%
    public float mediaAbove() {
        int numAulas = 0;
        float result = 0;
        for (int i: this.presentes) {
            result = (this.registados-i)/this.registados;
            if(result > 0.2) {
                numAulas++;
            }
        }
        return numAulas;
    }

}
