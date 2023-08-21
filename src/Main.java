import java.lang.invoke.SwitchPoint;
public class Main {
    public static void main(String[] args) {
    }

    static int pieczywo(int saldo, int ilosc){
        saldo -= (ilosc/3 *100) + (ilosc%3 * 50); // 1 bułka kosztuje 0.50, Promocja 3 bułki za 1 zł
        return saldo;
    }
    static int mieso(int saldo, int iloscUncji){
        float cena = 1499; //cena mięsa 14.99 zł za funt
        saldo = (int) (saldo - ((cena / 16) * iloscUncji));
        return saldo;
    }
    static int napoje(int saldo, int ilosc){

        saldo -= (ilosc/3 *600) + (ilosc%3 * 300); // 1 napój kosztuje 3 zł, Promocja 3 napój gratis
        return saldo;
    }


}