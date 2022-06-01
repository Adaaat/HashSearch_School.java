import java.util.Arrays;

public class Main {
    public static void main (String[]args){
        HashSuche hash = new HashSuche();
    int schluessel1 = 10;
    int schluessel2 = 20;
    int wert1 = 50;
    int wert2 = 60;
    hash.fuegeEin(schluessel1, wert1);
        System.out.println(hash.fuegeEin(schluessel2, wert2));

    int[] test1 = hash.getSchluessel();
    double[] test2 = hash.getWert();
    int[] test3 = hash.getKollision();
        System.out.println(test1[0]);
        System.out.println(test1[1]);
        System.out.println(test2[0]);
        System.out.println(test2[1]);
        System.out.println(test3[0]);



     //   Arrays.toString(test1);
     //   Arrays.toString(test2);

    }
}
