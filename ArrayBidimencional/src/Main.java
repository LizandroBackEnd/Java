import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int EMPLEADOS = 3;
        int DIAS = 4;
        int[][] ventas = new int[EMPLEADOS][DIAS];
        String[] nombres = new String[EMPLEADOS];
        int[] totalPorEmpleado = new int[EMPLEADOS];
        int[] totalPorDia = new int[DIAS];
        int totalGeneral = 0;

        System.out.println("============ EMPLEADOS ============");
        for (int i = 0; i < EMPLEADOS; i++) {
            System.out.print("Nombre empleado " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        }

        System.out.println("============ VENTAS ============");
        for (int i = 0; i < EMPLEADOS; i++) {
            System.out.println("Empleado: " + nombres[i]);
            for (int b = 0; b < DIAS; b++) {
                System.out.print("Día " + (b + 1) + ": ");
                ventas[i][b] = sc.nextInt();

                totalPorEmpleado[i] += ventas[i][b];
                totalPorDia[b] += ventas[i][b];
                totalGeneral += ventas[i][b];
            }
        }

        System.out.println("============ RESUMEN DE VENTAS POR EMPLEADO ============");
        for (int i = 0; i < EMPLEADOS; i++) {
            System.out.printf("%-20s : $%d\n", nombres[i], totalPorEmpleado[i]);
        }

        System.out.println("============ TOTAL DE VENTAS POR DÍA ============");
        for (int i = 0; i < DIAS; i++) {
            System.out.printf("Día %2d : $%d\n", (i + 1), totalPorDia[i]);
        }

        System.out.println("============ TOTAL GENERAL DE VENTAS ============");
        System.out.println("Total: $" + totalGeneral);
    }
}
