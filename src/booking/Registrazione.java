package booking;

import java.util.Objects;

public class Registrazione extends Main{

    String nome, cognome, mezzo;
    int eta;

    public Registrazione(String nome, String cognome, String mezzo, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.mezzo = mezzo;
        this.eta = eta;
    }

    public void ins(){

        Treno trn = new Treno();

        if(Objects.equals("Treno", this.mezzo)){
            trn.test();
        }


    }


}
