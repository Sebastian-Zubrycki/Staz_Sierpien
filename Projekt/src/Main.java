// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

import static java.lang.Integer.parseInt;

class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int expectedNumber = scanner.nextInt();
//        int expectedNumber = parseInt(input);
        for (int i = 0; i <= expectedNumber; i++) {
            System.out.print(sequenceIter(i) +", ");
        }
        System.out.print("\n" + expectedNumber+ " liczba w ciągu wynosi " + sequenceIter(expectedNumber)+ "\n");
        for (int i = 0; i <= expectedNumber; i++) {
            System.out.print(sequenceRec(i) +", ");
        }
        System.out.print("\n" + expectedNumber+ " liczba w ciągu wynosi " + sequenceRec(expectedNumber));
    }
    static int sequenceIter(int n){
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    static int sequenceRec(int n){
        if (n <= 1)
            return n;
        return sequenceRec(n - 1) + sequenceRec(n - 2);
    }
}