import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> productos = new ArrayList<>();
        List<Double> precios = new ArrayList<>();

        int option;
        do {
            System.out.println("============ MENU DE PRODUCTOS ============");
            System.out.println("1. Agregar un nuevo producto");
            System.out.println("2. Mostrar la lista de productos");
            System.out.println("3. Buscar producto");
            System.out.println("4. Eliminar un producto");
            System.out.println("5. Verificar existencia de un producto");
            System.out.println("6. Eliminar todos los productos");
            System.out.println("7. Indicar la cantidad de productos");
            System.out.println("8. Salir!!");
            System.out.println("Seleccionar una opcion: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("============ Nombre del producto: ============");
                    String nombre = sc.next();
                    System.out.println("============ Precio del producto: ============");
                    Double precio = sc.nextDouble();
                    productos.add(nombre);
                    precios.add(precio);
                    System.out.println("============= Producto agregado correctamente!!! ============");
                    break;
                case 2:
                    if (productos.isEmpty()) {
                        System.out.println("Lista vacia!!!");
                    } else  {
                        System.out.println("============ Lista de productos: ============");
                        for (int i = 0; i < productos.size(); i++) {
                            System.out.println((i + 1) + ". " + productos.get(i) + " $" + precios.get(i));
                        }
                    }
                    break;
                case 3:
                    if (productos.isEmpty()) {
                        System.out.println("Lista vacia!!!");
                    } else {
                        System.out.println("============= Nombre del producto que deseas buscar: ============");
                        String buscarProducto =  sc.next();
                        if (productos.contains(buscarProducto)) {
                            int productoEncontrado = productos.indexOf(buscarProducto);
                            System.out.println("Producto encontrado: " + productos.get(productoEncontrado) + " $" + precios.get(productoEncontrado));
                        } else {
                            System.out.println("Producto no encontrado!!!");
                        }
                    }
                    break;
                case 4:
                    if (productos.isEmpty()) {
                        System.out.println("Lista vacia!!!");
                    }  else  {
                        System.out.println("============= Nombre del producto que quieres eliminar: ============");
                        String eliminarProducto = sc.next();
                        if (productos.contains(eliminarProducto)) {
                            int productoEncontrado = productos.indexOf(eliminarProducto);
                            productos.remove(productoEncontrado);
                            precios.remove(productoEncontrado);
                            System.out.println("Producto eliminado correctamente!!!");
                        } else  {
                            System.out.println("Producto no encontrado!!!");
                        }
                    }
                    break;
                case 5:
                    if (productos.isEmpty()) {
                        System.out.println("No hay productos en la lista!!!");
                    } else {
                        System.out.println("Hay productos registrados en la lista!!!");
                    }
                    break;
                case 6:
                    if (productos.isEmpty()) {
                        System.out.println("Lista vacia !!!");
                    } else {
                        productos.clear();
                        precios.clear();
                        System.out.println("Productos eliminados correctamente!!!");
                    }
                    break;
                case 7:
                    if (productos.isEmpty()) {
                        System.out.println("No hay productos en la lista!!!");
                    } else {
                        System.out.println("Cantidad de productos en la lista: " + productos.size());
                    }
                    break;
                case 8:
                    System.out.println("============ ADIOS ============");
                    break;
                default:
                    System.out.println("Opcion no valida, intenta de nuevo!!!");

            }

        } while(option != 8);
    }
}