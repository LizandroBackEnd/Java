import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] a = new int[3][3];
        int [][] b = new int[3][3];
        int [][] c = new int[3][3];

        System.out.println("Ingrese los valores del primer arreglo");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("a[" + (i +1) + "," + (j + 1) + "]:");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Ingrese los valores del segundo arreglo");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("b[" + (i +1) + "," + (j + 1) + "]:");
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("============ VALORES SUMADOS POR COORDENADAS ============");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("[" + (i + 1) + "," + (j + 1) + "]: " + a[i][j] + "+" + b[i][j] + "=" +  c[i][j]);
            }
        }

        System.out.println("============ RESULTADO ============");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(c[i][j] + "\t") ;
            }
            System.out.println();
        }


    }
}