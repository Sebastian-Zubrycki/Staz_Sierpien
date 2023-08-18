class Main {
    public static void main(String[] args) {

        String pesel = getPesel.walidacja();

        String kontrolna = "";
        if (CheckSum.getSumaKontrolna(pesel))
            kontrolna = "poprawna";
        else kontrolna = "niepoprawna";


        String dzien = pesel.substring(4,6);

        int miesiacInt = Integer.parseInt(pesel.substring(2,4));
        String miesiac = Month.getMiesiac(miesiacInt);

        int stulecie = Integer.parseInt(pesel.substring(2,3));
        String rok2 = pesel.substring(0,2);
        String rok = Year.getRok(stulecie,rok2);


        int plecInt = Integer.parseInt(pesel.substring(9,10));
        String plec = "";
        if (plecInt % 2 == 0){
            plec = "kobieta";
        }
        else {
            plec = "mężczyzna";
        }

        System.out.println("Suma kontrolna: "+ kontrolna);
        System.out.println("Data urodzenia: " + dzien + " " + miesiac + " " + rok);
        System.out.println("Płeć: " + plec);
    }
}