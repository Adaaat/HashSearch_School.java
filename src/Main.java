import java.util.Arrays;

public class Main {
    public static void main (String[]args){
        HashSuche hash = new HashSuche();
    int schluessel1 = 10;
    int schluessel2 = 20;
    int schluessel3 = 30;
    int wert1 = 50;
    int wert2 = 60;
    int wert3 = 23;
    hash.fuegeEin(schluessel1, wert1);
    hash.fuegeEin(schluessel2, wert2);
    hash.fuegeEin(schluessel3, wert3);
    int[] test1 = hash.getSchluessel();
    double[] test2 = hash.getWert();
    int[] test3 = hash.getKollision();

        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test1));
        System.out.println(hash.suchePos(30));

    }
}