import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Libro> biblioteca = new Stack<>();

        int option = 0;
        do {
            System.out.println("""
                    ============ BIBLIOTECA ============
                    1. Registrar un nuevo libro
                    2. Consultar un libro (nombre)
                    3. Prestar un libro (nombre)
                    4. Mostrar todos los libros 
                    5. Salir (X)
                    Seleccionar una opcion:
                    """);

            try {
                option = Integer.parseInt(sc.nextLine());

                switch (option) {
                    case 1:
                        System.out.println("============ REGISTRO DE UN NUEVO LIBRO =============");
                        System.out.println("Titulo del libro: ");
                        String titulo = sc.nextLine().toUpperCase();
                        System.out.println("Autor: ");
                        String autor = sc.nextLine().toUpperCase();
                        System.out.println("Editora: ");
                        String editora = sc.nextLine().toUpperCase();
                        System.out.println("ISBN: ");
                        String isbn = sc.nextLine().toUpperCase();

                        int paginas = 0;
                        while (true) {
                            System.out.println("Paginas ");
                            try {
                                paginas = Integer.parseInt(sc.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("ERROR: Debes de ingresar un numero");
                            }
                        }

                        Libro libro = new Libro(titulo, autor, editora, isbn, paginas);
                        biblioteca.push(libro);

                        System.out.println("El libro: " + libro.getTitulo() + " ha sido agregado con exito a la biblioteca");
                        break;
                    case 2:
                        if (biblioteca.isEmpty()) {
                            System.out.println("No hay libros registados");
                        } else {
                            System.out.println("""
                                ============ BUSCAR LIBRO ============
                                Nombre del libro que deseas consultar:
                                """);

                            String buscarLibro = sc.nextLine().toUpperCase();
                            boolean encontrado = false;

                            for (Libro l : biblioteca) {
                                if (l.getTitulo().equals(buscarLibro)) {
                                    System.out.println("El libro a sido encontrado con exito");
                                    l.informacionLibro();
                                    encontrado = true;
                                    break;
                                }
                            }

                            if(!encontrado) {
                                System.out.println("El libro: " + buscarLibro + " no se encuentra dentro de la biblioteca");
                            }
                        }
                        break;
                    case 3:
                        if(biblioteca.isEmpty()){
                            System.out.println("No hay libros registados");
                        } else {
                            System.out.println("""
                                ============ PRESTAR LIBRO ============
                                Nombre del libro: 
                                """);

                            String prestarLibro = sc.nextLine().toUpperCase();
                            boolean prestado = false;

                            Iterator<Libro> it = biblioteca.iterator();
                            while (it.hasNext()) {
                                Libro l = it.next();
                                if (l.getTitulo().equals(prestarLibro)) {
                                    System.out.println("El libro a sido encontrado con exito y sera prestado");
                                    l.informacionLibro();
                                    it.remove();
                                    prestado = true;
                                    break;
                                }
                            }

                            if (!prestado) {
                                System.out.println("El libro: " + prestarLibro + " no se encuentra dentro de la biblioteca");
                            }
                        }
                        break;
                    case 4:
                        if(biblioteca.isEmpty()){
                            System.out.println("No hay libros registados");
                        } else {
                            System.out.println("============ LISTA DE TODOS LOS LIBRO DE LA BIBLIOTECA ============");
                            for (Libro l : biblioteca) {
                                System.out.println("-> " + l.getTitulo());
                            }
                            System.out.println("=========================");
                        }
                        break;
                    case 5:
                        System.out.println("============ ADIOS: nos vemos despues!!! ============");
                        break;
                    default:
                        System.out.println("ERROR: Opcion no valida");

                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Debes de ingresar un numero");

            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }

        } while(option != 5);


    }
}