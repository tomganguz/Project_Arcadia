package CC;
//CREAZIONE DI UN CONTO CORRENTE

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float imp;
        int scelta;
        Scanner num = new Scanner(System.in);
        String nome, numeroconto;

        System.out.println("Inserisci nome: ");
        nome = num.next();

        System.out.println("Inserisci numero conto: ");
        numeroconto = num.next();

        CC conto = new CC(nome, numeroconto);

        do{
            System.out.println("1. Prelievo\n2. versamento\n3. Stampa\n0. Esci\nScelta: ");
            scelta = num.nextInt();

            switch(scelta){
                case 1:
                    System.out.println("Inserisci importo da prelevare: ");
                    imp = num.nextFloat();
                    if(conto.prelievo(imp) != 0){
                        System.out.println("saldo inferiore alla cifra richiesta! saldo disponibile: " + conto.getSaldo());
                    }
                    break;

                case 2:
                    System.out.println("Inserisci importo da versare: ");
                    imp = num.nextFloat();
                    conto.versamento(imp);
                    break;
                case 3:
                    System.out.println(conto);
            }
        } while(scelta != 0);
    }

}
