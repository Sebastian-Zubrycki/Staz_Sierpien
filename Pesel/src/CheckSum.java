public class CheckSum {
    static Boolean getSumaKontrolna(String pesel){
        int kontrolna = Integer.parseInt(pesel.substring(10,11));
        int j = 1;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (j > 9){
                j = 1;
            }
            int subString = Integer.parseInt(pesel.substring(i,i+1));
            sum+=(subString *j)%10;
            j+=2;
        }

        return kontrolna == 10 - sum % 10;

    }
}
