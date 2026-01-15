package prepar;

public class ex2 {
    public static void main(String[] args) {

        int[][] matris = new int[4][4];


        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {

                matris[i][j] = 5;

                if (i+j == matris.length-1){

                    matris[i][j] = 1;
                    System.out.print( matris[i][j]  + " ");
                } else {
                    System.out.print( matris[i][j] + " ");
                }

            }
            System.out.println();

        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < matris.length; i++) {

            for (int j = 0; j < matris[i].length; j++) {

                System.out.print( matris[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println();
        System.out.println("القطر الرئيسي:");
        for (int i = 0; i < matris.length; i++) {

            for (int j = 0; j < matris[i].length; j++) {
                matris[i][j] = 5;

                if ( i== j ){

                    matris[i][j] = 1;
                    System.out.print( matris[i][j]  + " ");
                } else {
                    System.out.print( matris[i][j] + " ");
                }
            }

            System.out.println();
            System.out.println(matris[i][i] + " ");


        }

        System.out.println("القطر الثانوي:");
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j <  matris[i].length; j++) {

                matris[i][j] = 5;

                if ( i + j > matris.length - 1 ){

                    matris[i][j] = 1;
                    System.out.print( matris[i][j]  + " ");
                } else {
                    System.out.print( matris[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
