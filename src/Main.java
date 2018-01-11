import java.util.Objects;
import java.util.Scanner;
public class Main {


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
        boolean ok = false;

        do{

            System.out.println("\n Treno o Aereo? (Scrivi con la maiuscola!)");
            mezzo = input.next();

            ok = Objects.equals("Aereo", mezzo);

            if(ok == false){
                ok = Objects.equals("Treno", mezzo);
            }

        }while(ok == false);

        System.out.println("\n La tua eta: ");

        eta = input.nextInt();

        Registrazione reg = new Registrazione(nome, cognome, mezzo, eta);

        reg.ins();

    }
}
