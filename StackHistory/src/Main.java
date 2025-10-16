import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> historial = new Stack<>();
        int option = 0;

        do {
            System.out.println("""
                    ==================== HISTORIAL DE NAVEGACION ============
                    1. Nueva URL ( 0~ Search)
                    2. Retroceder ( <- Atras)
                    3. Mostrar ultima URL visitada ( <= ) 
                    4. Mostrar la cantidad de de URLS en el historial
                    5. Verificar si existen URLS en el historial
                    6. Mostrar todo el historial (ALL)
                    7. Salir (X)
                    Selecciona una opcion:  
                    """);

            try {
                option = sc.nextInt();
                sc.nextLine();

                switch (option) {
                    case 1:
                        System.out.println("""
                                ============ GOOGLE ============
                                Hacer una busqueda: (Introduce la url)
                                """);
                        String url = sc.nextLine();
                        historial.push(url);
                        System.out.println("Redirigiendo a: " + url);
                        System.out.println("Se ha agregado la url al historial con exito!!");
                        break;
                    case 2:
                        if (historial.isEmpty()) {
                            System.out.println("============ HISTORIAL VACIO ============");
                        } else {
                            String urlAnterior = historial.pop();
                            System.out.println("Regresaste desde: " + urlAnterior);

                            if (!historial.isEmpty()) {
                                System.out.println("Redirigido a: " + historial.peek());
                            } else  {
                                System.out.println("============ HISTORIAL VACIO ============");
                            }
                        }
                        break;
                    case 3:
                        if (historial.isEmpty()) {
                            System.out.println("============ HISTORIAL VACIO ============");
                        } else  {
                            System.out.println("Ultima pagina visitada: " +  historial.peek());
                        }
                        break;
                    case 4:
                        System.out.println("Total de URLS guardadas en el navegador: " +  historial.size());
                        break;
                    case 5:
                        if (historial.isEmpty()) {
                            System.out.println("============ HISTORIAL VACIO ============");
                        } else {
                            System.out.println("Hay URLS guardadas en el navegador (Historial)");
                        }
                        break;
                    case 6:
                        if (historial.isEmpty()) {
                            System.out.println("============ HISTORIAL VACIO ============");
                        } else {
                            System.out.println("============ HISTORIAL ===========");
                            for (String i : historial) {
                                System.out.println(" - " + i);
                            }
                        }
                        break;
                    case 7:
                        System.out.println("======================== SALIEDO DEL NAVEGADOR  ========================");
                        break;
                    default:
                        System.out.println("Opcion no valida!!!");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Debes de ingresar un numero");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }

        } while (option != 7);
        sc.close();
    }
}