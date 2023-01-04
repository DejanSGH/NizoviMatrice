import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] niz = new int[]{7,6,3,1,2,9};
        sortirajRastuce(niz);
        System.out.println(Arrays.toString(niz));
        obrtanjeNiza(niz);

        int n = 5;

        int[][] matrica = new int[n][n];

        ucitajMatricu(matrica);
        ispisMatrice(matrica);
        prerasporedjivanje(matrica);
        ispisMatrice(matrica);



    }

    public static void ucitajMatricu (int[][] matrica){

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < matrica.length; i++) {
            for (int k = 0; k < matrica[i].length ; k++) {
                matrica[i][k] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    public static void ispisMatrice(int[][] matrica){
        for (int i = 0; i < matrica.length; i++) {
            System.out.println(Arrays.toString(matrica[i]));
        }
    }

    public static void swapKolona(int[][] matrica, int prvaKolona, int drugaKolona){
        int trenutna = 0;
        int brojac = 0;
        while(brojac < matrica.length){

            trenutna = matrica[brojac][prvaKolona];
            matrica[brojac][prvaKolona] = matrica[brojac][drugaKolona];
            matrica[brojac][drugaKolona] = trenutna;
            brojac++;

        }
    }

    public static void swapVrsta(int[][] matrica, int prvaVrsta, int drugaVrsta){
        int trenutna = 0;
        int brojac = 0;
        while(brojac < matrica.length){

            trenutna = matrica[prvaVrsta][brojac];
            matrica[prvaVrsta][brojac] = matrica[drugaVrsta][brojac];
            matrica[drugaVrsta][brojac] = trenutna;
            brojac++;

        }
    }

    public static void prerasporedjivanje(int[][] matrica){
        int trenutni = 0;
        int najmanji = Integer.MAX_VALUE;
        int indeksNajmanjeg = 0;

        for (int i = 0; i < matrica.length; i++) {
            trenutni = 0;
            for (int k = 0; k < matrica[i].length; k++) {
                trenutni += matrica[k][i];
            }
            if(trenutni < najmanji){
                najmanji = trenutni;
                indeksNajmanjeg = i;
            }

        }
        swapKolona(matrica, 0, indeksNajmanjeg);
    }


    public static int najveciBroj (int[] niz){
        int x = niz[0];
        for (int i = 0; i < niz.length; i++) {
            if(niz[i] > x){
                x = niz[i];
            }
        }
        return x;
    }

    public static void sortirajRastuce(int[] niz){
        for (int i = 0; i < niz.length; i++) {
            int indexNajmanjeg = i;
            for (int k = i+1; k < niz.length; k++) {
                if(niz[indexNajmanjeg] > niz[k]){
                    indexNajmanjeg = k;
                }
            }
            int pomocna;
            pomocna = niz[i];
            niz[i] = niz[indexNajmanjeg];
            niz[indexNajmanjeg] = pomocna;
        }
    }

    public static void obrtanjeNiza(int[] niz){
        int trenutni = 0;
        for (int i = 0; i < niz.length / 2 ; i++) {
            trenutni = niz[i];
            niz[i] = niz[niz.length-i-1];
            niz[niz.length-i-1] = trenutni;
        }

    }

}
