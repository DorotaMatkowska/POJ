package Exercise_03_07;

/*
Dorota Matkowska
zadanie 7
*/

public class Palindrom {
    private String palindrom;

    public Palindrom(String palindrom){
        this.palindrom=palindrom;
    }

    public String getPalindrom() {
        return palindrom;
    }

    public String sprawdz(){
        String a = palindrom.toLowerCase();
        a=a.replace(" ","");
        a=a.replace(",","");
        int h = a.length();

        int kk = 0;
        int k = (h - 1);
        for (int i = 0; i < h; i++) {

            if (a.charAt(i) != a.charAt(k)) {
                kk = 1;
                break;
            }
            k--;
        }

        if (kk == 1)
            return "- nie jest palindromem";
        else {
            return "- jest palindromem";
        }
    }
}