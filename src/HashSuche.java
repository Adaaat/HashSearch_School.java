public class HashSuche {
    private  int[] schluessel;
    private  double[] wert;
    private  int [] kollision;
    int mod;

    public HashSuche(int pMod){
    mod = pMod;
    schluessel = new int[mod];
    wert = new double[mod];
    kollision = new int[mod];
    }

    public int suchePos(int pSchluessel){

        if(schluessel[berechneHash(pSchluessel)]==pSchluessel) {
        return berechneHash(pSchluessel);
    }else
        {
            int temp = 0;
           for (int i = berechneHash(pSchluessel); temp <= kollision[berechneHash(pSchluessel)];i++){
               if (schluessel[i] == pSchluessel) {
                   return i;
               }
               if (i == schluessel.length - 1) {
                   i = -1;
               }
               temp++;
        }
        }
        return -1;
    }

    public boolean arrayfull(){
        boolean temp = true;
        for (int j : schluessel) {
            if (j == 0) {
                temp = false;
                break;
            }
        }
        return temp;
        }

    public int fuegeEin(int pSchluessel, double pWert) {
        int temp = 0;
        if (arrayfull()) {
            System.out.println("Array is full");
            return -1;
        } else {
            if (schluessel[berechneHash(pSchluessel)] == 0) {
                schluessel[berechneHash(pSchluessel)] = pSchluessel;
                wert[berechneHash(pSchluessel)] = pWert;
            } else {
                int i;
                for (i = berechneHash(pSchluessel); schluessel[i] != 0; i++) {
                    if (i == schluessel.length - 1) {
                        i = -1;
                    }
                    temp++;
                }
                schluessel[i] = pSchluessel;
                wert[i] = pWert;
                kollision[berechneHash(pSchluessel)] = temp;
            }
            return temp;
        }
    }
    public double[] getWert(){
        return wert;
    }
    public int[] getKollision() {
        return kollision;
    }
    public int[] getSchluessel(){
        return schluessel;
    }
    public int berechneHash(int pSchlüssel) {
        return (pSchlüssel % mod);
    }
}



