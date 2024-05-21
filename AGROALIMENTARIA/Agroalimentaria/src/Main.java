import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        List<ProductosFrescos> listaProductosFrescos = new ArrayList<>();
        List<ProductosRefrigerados> listaProductosRefrigerados = new ArrayList<>();
        List<ProductosCongelados> listaProductosCongelados = new ArrayList<>();

        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar producto fresco");
            System.out.println("2. Agregar producto refrigerado");
            System.out.println("3. Agregar producto congelado");
            System.out.println("4. Salir");

            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("Productos Frescos");
                    System.out.println("Ingrese la fecha de caducidad: ");
                    String caducidadProductosFrescos = scanner.next();

                    System.out.println("Ingrese el número de lote: ");
                    int loteProductosFrescos = scanner.nextInt();

                    System.out.println("Ingrese la fecha de envasado: ");
                    String fechaEnvasado = scanner.next();

                    System.out.println("Ingrese el país: ");
                    String pais = scanner.next();

                    ProductosFrescos productoFresco = new ProductosFrescos(caducidadProductosFrescos,loteProductosFrescos,fechaEnvasado,pais);
                    String informacionProductosFrescos = productoFresco.informacionProductosFrescos();

                    listaProductosFrescos.add(productoFresco);

                    System.out.println("Producto agregado: " + informacionProductosFrescos);

                    break;
                case 2:
                    System.out.println("Productos Refrigerados");
                    System.out.println("Ingrese la fecha de caducidad: ");
                    String caducidadProductosRefrigerados = scanner.next();

                    System.out.println("Ingrese el número de lote: ");
                    int loteProductosRefrigerados = scanner.nextInt();

                    System.out.println("Ingrese el código del organismo de supervicion alimentaria: ");
                    int codigo = scanner.nextInt();


                    ProductosRefrigerados productoRefrigerado = new ProductosRefrigerados(caducidadProductosRefrigerados,loteProductosRefrigerados,codigo);
                    String informacionProductoRefrigerado = productoRefrigerado.informacionProductosRefrigerados();

                    listaProductosRefrigerados.add(productoRefrigerado);

                    System.out.println("Producto agregado: " + informacionProductoRefrigerado);

                    break;
                case 3:
                    System.out.println("Productos Congelados");
                    System.out.println("Ingrese la fecha de caducidad: ");
                    String caducidadProductosCongelados = scanner.next();

                    System.out.println("Ingrese el número de lote");
                    int loteProductosCongelados = scanner.nextInt();

                    System.out.println("Ingrese la temperatura: ");
                    double temperatura = scanner.nextInt();

                    ProductosCongelados productoCongelado = new ProductosCongelados(caducidadProductosCongelados,loteProductosCongelados,temperatura);
                    String informacionProdcutoCongelado = productoCongelado.informacionProductosCongelados();

                    listaProductosCongelados.add(productoCongelado);

                    System.out.println("Producto agregado: " + informacionProdcutoCongelado);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}
