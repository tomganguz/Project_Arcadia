package booking;

import java.util.Objects;
import java.util.Scanner;
public class Main {


    //Classe principale
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome, cognome, mezzo;
        int eta;

        System.out.print("==TOMMY BOOKING SYSTEM==" +
                "\n Benventuo al sistema di booking per treni ed arei" +
                "\n mi servirebbero un po di tue infomrazioni" +
                "\n NOME: ");

        nome = input.next();

        System.out.print("\n COGNOME: ");

        cognome = input.next();


        //Ciclo while per ottenere esclusivamente Treno o Aereo come valore in input
        do{

            System.out.println("\n Treno o Aereo? (Scrivi con la maiuscola!)");
            mezzo = input.next();

        }while(!((Objects.equals("Treno", mezzo))||(Objects.equals("Aereo", mezzo))));
        //APPLICATA CORREZIONE, Objects.equals adesso è direttamente nel ciclo while

        System.out.println("\n La tua eta: ");

        eta = input.nextInt();

        Registrazione reg = new Registrazione(nome, cognome, mezzo, eta);

        reg.ins();

    }
}
