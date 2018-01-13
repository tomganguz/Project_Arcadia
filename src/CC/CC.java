package CC;

public class CC {
    String correntista;
    String nc; // Numero conto corrente
    float saldo;

    //COSTRUTTORE
    public CC(String correntista, String nc) {
        this.correntista = correntista;
        this.nc = nc;
        this.saldo = 0;
    }


    public String getCorrentista(){
        return correntista;
    }

    public String getNc(){
        return nc;
    }

    public float getSaldo(){
        return saldo;
    }

    public int prelievo(float s){
        int eseguito = 0;

        if(saldo > s){
            saldo = saldo - s;
            eseguito = 0;
        } else {
            eseguito = 1;
        }

        return eseguito;
    }

    public void versamento(float s){
        saldo = saldo + s;
    }

    public String toString(){
        String s = "";
        s = s + "Nome: " + getCorrentista() +
                " Numero: " + getNc() + " Saldo: " + getSaldo();
        return s;
    }
}
