package prepar;

import java.util.Scanner;

public class ex3 {

    public static int[][] initNum(int[][] lista) {

        for (int i = 0; i < lista.length; i++) {

            for (int j = 0; j < lista[i].length; j++) {
                lista[i][j] = (int) (Math.random()*10);
            }
        }

        return lista;

    }

    public static int numSolo(int num) {
        Scanner sc = new Scanner(System.in);
        int columna = -1;

        do {
           try {
               columna = sc.nextInt();
           } catch (NumberFormatException ex) {
               System.out.println("error");
               sc.nextLine();
               continue;
           }
        } while (columna < 0 || columna >= num );

        return columna ;
    };

    public static void pintar(int[][] lista) {
        for (int i = 0; i < lista.length; i++) {

            for (int j = 0; j < lista[i].length; j++) {
                System.out.println("alumno " + i + " nota es " + lista[i][j]);
            }
        }
    }

    public static void remplaceNota(int[][] lista) {
        for (int i = 0; i < lista.length; i++) {

            System.out.print("أدخل رقم العمود (بين 0 و " + (i + 1) + "): ");
            int c1 = numSolo(lista.length);
            System.out.print("أدخل رقم العمود (بين 0 و " + (i + 1) + "): ");
            int c2 = numSolo(lista.length);

            int temp = lista[i][c1];
            lista[i][c1] = lista[i][c2];
            lista[i][c2] = temp;

        }

        // عرض النتيجة
        System.out.println("\nالمصفوفة بعد التبديل:");
        pintar(lista);
    }

    public static void alumnoMaxNota(int[][] lista) {



        int max = -1;

        int alumnoId = 0;
        for (int i = 0; i < lista.length; i++) {


            int suma = 0;

            for (int j = 0; j < lista[i].length; j++) {


                suma = suma + lista[i][j] ;
            }

            if (max < suma) {
                max = suma;
                alumnoId = i;
            }
        }

        System.out.println("alumno es " + alumnoId + " sum nota total es " + max);

    }

    public static int[][] alumnoFalla(int[][] lista) {

        int numCheck = 0;

        for (int i = 0; i < lista.length; i++) {

            for (int j = 0; j < lista[i].length; j++) {

                if (lista[i][j] < 5) {
                    numCheck++;
                }

            }
        }

        int[][]  alumnoFallaLista = new int[numCheck][numCheck];

        for (int i = 0; i < lista.length; i++) {

            for (int j = 0; j < lista[i].length; j++) {

                if (lista[i][j] < 5) {
                    alumnoFallaLista[i][j] = lista[i][j] ;
                }

            }
        }

        return alumnoFallaLista ;
    }

    public static void menuList(int[][] lista) {
        Scanner sc = new Scanner(System.in);
        int menu = -1;



        do {
            System.out.println("*****************************************");
            System.out.println("عرض الدرجات 1");
            System.out.println("أعلى طالب 2");
            System.out.println("تبديل المواد 3");
            System.out.println("الرسوب 4");
            System.out.println("exit 0");
            System.out.println("*****************************************");

            try {
                System.out.print("dami un num: ");
                menu = sc.nextInt();

                switch (menu) {
                    case 1: pintar(lista);  break;
                    case 2: alumnoMaxNota(lista);  break;
                    case 3: remplaceNota(lista);  break;
                    case 4: alumnoFalla(lista);  break;
                    default: System.out.println("error");
                }


            } catch (NumberFormatException ex) {
                System.out.println("num solo");
                sc.nextLine();
                continue;
            }
        } while (menu != 0);



    }



    public static void main(String[] args) {
        int[][] notas = new int[5][5];




        notas = initNum(notas);

        menuList(notas);

    }
}
