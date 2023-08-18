import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int saldo = 0; // saldo w groszach
        saldo += 1200;
        System.out.println("Posiadasz "+ wypisz(saldo));
        saldo = kup(saldo);

        System.out.println("Posiadasz "+ wypisz(saldo));
    }
    static String wypisz(int grosze){
        float zlote = (float) grosze / 100;
        return zlote+" zł";
    }
    static int kup(int saldo){
        Scanner scaner = new Scanner(System.in);
        System.out.println("Co chcesz kupić w Supermarkecie?");
        System.out.println("1: 1 bułka  0,50 zł"); // podstawowa cana bułki
        System.out.println("2: 3 bułki  PROMOCJA! 1 zł"); // cena po promocji
        System.out.println("3: Inna ilość bułek");
        System.out.println("Wpisz liczbę");
        int wybor = scaner.nextInt();

        switch (wybor) {
            case 1 -> saldo -= 50;
            case 2 -> saldo -= 100;
            case 3 -> {
                System.out.println("Ile bułek chcesz kupić?");
                int ilosc = scaner.nextInt();
                saldo -= (ilosc/3 *100) + (ilosc%3 * 50);
            }
        }
        return saldo;
    }

}