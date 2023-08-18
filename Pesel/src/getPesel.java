import java.util.Scanner;

public class getPesel {
    static String walidacja(){
        Scanner scanner = new Scanner(System.in);
        String pesel = "";
        boolean isPeselValid = false;
        while(!isPeselValid) {
            System.out.print("Podaj numer PESEL: ");
            pesel = scanner.next();
            if (pesel.length() != 11) {
                System.out.println("Numer PESEL powinien mieć długość 11 cyfr.");
            }
            else {
                try {
                    long peselLong = Long.parseLong(pesel);
                    if (peselLong > 0){
                        isPeselValid = true;
                    }
                    else {
                        System.out.println("Numer PESEL powinien zawierać tylko cyfry. Podany numer PESEL nie spełnia tych warunków.");
                    }
                } catch (Exception e) {
                    System.out.println("Numer PESEL powinien zawierać tylko cyfry. Podany numer PESEL nie spełnia tych warunków.");
                }
            }

        }
        return pesel;
    }
}
