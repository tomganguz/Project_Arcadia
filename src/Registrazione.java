import java.util.Objects;

public class Registrazione extends Main{

    String nome, cognome, mezzo;
    int eta;
    boolean tren;

    public Registrazione(String nome, String cognome, String mezzo, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.mezzo = mezzo;
        this.eta = eta;
    }

    public void ins(){

        Treno trn = new Treno();

        tren = Objects.equals("Treno", this.mezzo);

        if(tren == true){
            trn.test();
        }


    }


}
