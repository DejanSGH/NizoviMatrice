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



    }

    public static void ucitajMatricu (int[][] matrica){

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < matrica.length; i++) {
            for (int k = 0; k < matrica[i].length ; k++) {
                matrica[i][k] = scanner.nextInt();
            }
        }
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
    //NIZOVI
    //niz[3][3] x 2
    // [[1,2,3],
    // [1,2,3],
    // [1,2,3]]

//    public static void ispisiNiz(int[] niz){
//        for (int i = 0; i < niz.length; i++) {
//            System.out.print("," + niz[i]);
//        }
//    }
}
