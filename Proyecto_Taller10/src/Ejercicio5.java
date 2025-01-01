
import java.util.Scanner;

/*
 * Crea un programa que gestione el inventario de una tienda, así como la emisión de facturas. Utiliza una matriz bidimensional para almacenar los productos disponibles en la tienda, con información como nombre, precio y cantidad. El programa debe permitir facturar un producto dado su código, y unidades deseadas. Adicional se debe agregar a la factura al 15% del IVA, y si la compra superar los $100, se debe aplicar un descuento.
 * Nota: Considere la alternativa de inexistencias en Stop, para el caso, muestre la alerta respectiva.
 * @author Andrés

 */
public class Ejercicio5 {
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
                            System.out.print("Ingresar nuevo precio: ");
                            nombreproducto[i][1] = tcl.next();
                            System.out.print("Ingresar nueva cantidad: ");
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
2. Actualizar existencia y precio
3. Buscar producto
4. Eliminar produto
5 salir
Escriba la opcion: 1
Ingresar nombre del producto:leche
Ingresar precio:2
Ingresar cantidad:800
Que desea hacer?
1. Agregar producto
2. Actualizar existencia y precio
3. Buscar producto
4. Eliminar produto
5 salir
Escriba la opcion: 2
Cual producto desea actualizar: leche
Ingresar nuevo precio: 
4
Ingresar nueva cantidad: 
500
Que desea hacer?
1. Agregar producto
2. Actualizar existencia y precio
3. Buscar producto
4. Eliminar produto
5 salir
Escriba la opcion: 5
Saliendo del sistema... espere no se demora mucho
Salida exitosa
BUILD SUCCESSFUL (total time: 36 seconds)
*/
    

