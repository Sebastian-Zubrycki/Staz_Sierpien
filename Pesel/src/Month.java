public class Month {
    static String getMiesiac(int MM) {
        String miesiac = "";
        switch (MM % 20){
            case 1 -> {
                miesiac = "stycznia";
            }
            case 2 -> {
                miesiac = "lutego";
            }
            case 3 -> {
                miesiac = "marca";
            }
            case 4 -> {
                miesiac = "kwietnia";
            }
            case 5 -> {
                miesiac = "maja";
            }
            case 6 -> {
                miesiac = "czerwca";
            }
            case 7 -> {
                miesiac = "lipca";
            }
            case 8 -> {
                miesiac = "sierpnia";
            }
            case 9 -> {
                miesiac = "września";
            }
            case 10 -> {
                miesiac = "października";
            }
            case 11 -> {
                miesiac = "listopada";
            }
            case 12 -> {
                miesiac = "grudnia";
            }

        }
        return miesiac;
    }
}
