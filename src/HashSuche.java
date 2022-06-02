public class HashSuche {
    private  int[] schluessel = new int[11];
    private  double[] wert= new double[11];
    private  int [] kollision = new int[11];

    public int suchePos(int pSchluessel){

        if(schluessel[berechneHash(pSchluessel)]==pSchluessel) {
        return berechneHash(pSchluessel);
    }else
        {
           for (int i = 0; i <= kollision[berechneHash(pSchluessel)];i++){

            if (schluessel[berechneHash(pSchluessel) + i] == pSchluessel) {
                return berechneHash(pSchluessel) + i;
            }
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


    public int fuegeEin(int pSchluessel, double pWert){
        int temp = 0;
        if(arrayfull()) {
            System.out.println("Array is full");
            return 0;
        }else {
            if (schluessel[berechneHash(pSchluessel)] == 0) {
                schluessel[berechneHash(pSchluessel)] = pSchluessel;
                wert[berechneHash(pSchluessel)] = pWert;
            } else {
                int i = 0;
                temp= 1;
                for (i =berechneHash(pSchluessel); schluessel[i + 1] != 0;i++) {
                    if(i == schluessel.length - 1) {
                        i = 0;
                    }
                    }
                    temp++;
                }
                schluessel[i + 1] = pSchluessel;
                wert[i + 1] = pWert;
                kollision[berechneHash(pSchluessel)] = temp ;

            }
            return temp;
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
        return (pSchlüssel % 10);
    }
}



