public class Year {
    static String getRok(int stulecie,String rok2){
        String rok1 = "";
        switch (stulecie) {
            case 0, 1 -> {
                rok1 = "19";
            }
            case 2, 3 -> {
                rok1 = "20";
            }
            case 4, 5 -> {
                rok1 = "21";
            }
            case 6, 7 -> {
                rok1 = "22";
            }
            case 8, 9 -> {
                rok1 = "18";
            }
        }
        return rok1+rok2;
    }
}
