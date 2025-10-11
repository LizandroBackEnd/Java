import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> actividades = new ArrayList<>();

        int option;
        do {
            System.out.println("""
                    ============ ADMINISTRADOR DE TAREAS ============
                    1. Agendar actividad
                    2. Realizar actividad
                    3. Cambiar orden de las actividades
                    4. Mostrar actividades
                    5. Listar la cantidad de actividades
                    6. Eliminar todas las actividades
                    7. Salir
                    Seleccionar una opcion:
                    """);
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("============ AGENDAR ACTIVIDAD ===============");
                    System.out.println("Nombre de la actividad");
                    String nombre = sc.next();
                    actividades.add(nombre);
                    System.out.println("ACTIVIDAD AGREGADA CORRECTAMENTE");
                    break;
                case 2:
                    if (actividades.isEmpty()) {
                        System.out.println("No hay actividades agregadas");
                    } else  {
                        System.out.println("============ REALIZAR ACTIVIDAD ===============");
                        System.out.println("============ Lista de actividades ===============");
                        for (int i  = 0; i < actividades.size(); i++) {
                            System.out.println((i + 1) + ". " + actividades.get(i));
                        }

                        System.out.println("Nombre de la actividad");
                        String buscarActividad = sc.next();
                        if (actividades.contains(buscarActividad)) {
                            int actividadEncontrada =  actividades.indexOf(buscarActividad);
                            System.out.println("Actividad: " +  actividades.get(actividadEncontrada) + " realizada");
                            actividades.remove(actividadEncontrada);
                        } else  {
                            System.out.println("Actividad no encontrada");
                        }
                    }
                    break;
                case 3:
                    if (actividades.isEmpty()) {
                        System.out.println("No hay actividades agregadas");
                    } else {
                        System.out.println("============ CAMBIAR ORDEN DE LAS ACTIVIDADES ===============");
                        System.out.println("============ Lista de actividades ===============");
                        for (int i =  0; i < actividades.size(); i++) {
                            System.out.println((i + 1) + ". " + actividades.get(i));
                        }
                        System.out.println("Escribe el numero de la actividad que quieres mover");
                        int indicemover = sc.nextInt();

                        if(indicemover >= 0 && indicemover < actividades.size()) {
                            System.out.println("A que posicion lo quieres mover (1 a" + actividades.size() + ")");
                            int indicedest =  sc.nextInt();

                            if (indicedest >= 0 && indicedest < actividades.size()) {
                                String actividad = actividades.remove(indicemover);
                                actividades.add(indicedest, actividad);
                                System.out.println("Actividad movida correctamente");
                            } else {
                                System.out.println("Posicion no validad!!!");
                            }
                        } else {
                            System.out.println("Numero de actividad invalido");
                        }
                    }
                    break;
                case 4:
                    if (actividades.isEmpty()) {
                        System.out.println("No hay actividades agregadas");
                    } else {
                        System.out.println("============ LISTA DE ACTIVIDADES ===============");
                        for (int i =  0; i < actividades.size(); i++) {
                            System.out.println((i + 1) + ". " + actividades.get(i));
                        }
                    }
                    break;
                case 5:
                    if (actividades.isEmpty()) {
                        System.out.println("No hay actividades agregadas");
                    } else {
                        System.out.println("Cantidad de actividades: " +  actividades.size());
                    }
                    break;
                case 6:
                    if (actividades.isEmpty()) {
                        System.out.println("No hay actividades agregadas");
                    } else {
                        actividades.clear();
                        System.out.println("Actividades eliminadas correctamente");
                    }
                case 7:
                    System.out.println("=========== ADIOS ===========");
                    break;
                default:
                    System.out.println("Opcion no valida, intenta de nuevo!!!!");
            }

        } while (option != 7);
    }
}