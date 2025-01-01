
import java.util.Scanner;

/*
 * Crea un programa que gestione el inventario de una tienda. 
 * Utiliza una matriz bidimensional para almacenar los productos disponibles en 
 * la tienda, con información como nombre, precio y cantidad. El programa debe permitir 
 * agregar nuevos productos, actualizar existencias, buscar productos y eliminarlos.
 * @author Jorge Guerrero
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String[][] nombreproducto = new String[1000][3];
        int cantidad = 0, producto = 0, opcion = 0;
        String busqueda, refresh;
        boolean respuesta;
        while (cantidad == 0) {
            if (producto <= nombreproducto.length) {
                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s", "Que desea hacer?", "1. Agregar producto", "2. Actualizar existencia y precio", "3. Buscar producto", "4. Eliminar produto", "5 salir", "Escriba la opcion: ");
                opcion = tcl.nextInt();
            }
            respuesta = false;
            switch (opcion) {
                case 1:
                    System.out.print("Ingresar nombre del producto:");
                    nombreproducto[producto][0] = tcl.next();
                    System.out.print("Ingresar precio:");
                    nombreproducto[producto][1] = tcl.next();
                    System.out.print("Ingresar cantidad:");
                    nombreproducto[producto][2] = tcl.next();
                    producto++;
                    break;
                case 3:
                    System.out.print("Cual productos busca: ");
                    busqueda = tcl.next();
                    for (int i = 0; i < nombreproducto.length; i++) {
                        if (busqueda.equals(nombreproducto[i][0])) {
                            System.out.println("Producto: " + busqueda);
                            System.out.println("Precio: " + nombreproducto[i][1]);
                            System.out.println("Cantidad: " + nombreproducto[i][2]);
                            respuesta = false;
                            break;
                        } else {
                            respuesta = true;
                        }

                    }
                    if (respuesta) {
                        System.out.println("no se encontro el producto");
                    }

                    break;
                case 2:
                    System.out.print("Cual producto desea actualizar: ");
                    refresh = tcl.next();
                    for (int i = 0; i < nombreproducto.length; i++) {
                        if (refresh.equals(nombreproducto[i][0])) {
                            System.out.println("Ingresar nuevo precio: ");
                            nombreproducto[i][1] = tcl.next();
                            System.out.println("Ingresar nueva cantidad: ");
                            nombreproducto[i][2] = tcl.next();
                            respuesta = false;
                            break;
                        } else {
                            respuesta = true;
                        }

                    }
                    if (respuesta) {
                        System.out.println("no se encontro el producto");
                    }
                    break;
                case 4:
                    System.out.print("Ingresar producto a eliminar: ");
                    busqueda = tcl.next();
                    for (int i = 0; i < nombreproducto.length; i++) {
                        if (busqueda.equals(nombreproducto[i][0])) {
                            nombreproducto[i][0] = " ";
                            nombreproducto[i][0] = " ";
                            nombreproducto[i][0] = " ";
                            producto--;
                            respuesta = false;
                            break;
                        } else {
                            respuesta = true;
                        }
                    }
                    if (respuesta) {
                        System.out.println("No se encontro el producto");
                    }

                    break;
                case 5:
                    System.out.println("Saliendo del sistema... espere no se demora mucho");
                    cantidad = 1;
                    break;
                default:
                    System.out.println("Intente de nuevo por favor... gracias");
            }

        }
        System.out.println("Salida exitosa");
    }
}
/* 
run:
Que desea hacer?
1. Agregar producto
2 Actualizar existencia y precio
3 Buscar producto
4 Eliminar produto
5 salir
Escriba la opcion: 4
Ingresar producto a eliminar: leche
No se encontro el producto
Que desea hacer?
1. Agregar producto
2 Actualizar existencia y precio
3 Buscar producto
4 Eliminar produto
5 salir
Escriba la opcion: 1
Ingresar nombre del producto:leche
Ingresar precio:2,30
Ingresar cantidad:6
Que desea hacer?
1. Agregar producto
2 Actualizar existencia y precio
3 Buscar producto
4 Eliminar produto
5 salir
Escriba la opcion: 1
Ingresar nombre del producto:almendra
Ingresar precio:1
Ingresar cantidad:3
Que desea hacer?
1. Agregar producto
2 Actualizar existencia y precio
3 Buscar producto
4 Eliminar produto
5 salir
Escriba la opcion: 4
Ingresar producto a eliminar: leche
Que desea hacer?
1. Agregar producto
2 Actualizar existencia y precio
3 Buscar producto
4 Eliminar produto
5 salir
Escriba la opcion: 5
Saliendo del sistema... espere no se demora mucho
Salida exitosa
BUILD SUCCESSFUL (total time: 2 minutes 14 seconds)
*/
