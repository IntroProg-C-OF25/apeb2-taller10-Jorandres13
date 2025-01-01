
import java.util.Scanner;

/*
Dadas dos matrices (cuadradas y/o rectangulares) de valores enteros aleatorios, 
desarrollar su procesamiento para calcular y presentar:

La suma de las dos matrices (considerar las restricciones matemáticas para 
ello).
La multiplicación de las dos matrices (considerar las reglas matemáticas para 
ello).
 * @author Jorge Guerrero
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int fila1, columna1, fila2, columna2;
        String respuesta;
        System.out.print("Digame las filas y columnas de la primera matriz: ");
        fila1 = tcl.nextInt();
        columna1 = tcl.nextInt();
        System.out.print("Digame las filas y columnas de la segunda matriz: ");
        fila2 = tcl.nextInt();
        columna2 = tcl.nextInt();
        int[][] matriz1 = new int[fila1][columna1];
        int[][] matriz2 = new int[fila2][columna2];
        int[][] suma = new int[fila1][columna1];
        int[][] multiplicacion = new int[fila1][columna2];

        System.out.println("Matriz 1");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz1[i][j] = (int) (Math.random() * 5);
                System.out.print("[ " + matriz1[i][j] + " ] ");
            }
            System.out.println("");
        }
        System.out.println("Matriz 2");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz2[i][j] = (int) (Math.random() * 5);
                System.out.print("[ " + matriz2[i][j] + " ] ");
            }
            System.out.println(" ");
        }
        System.out.print("Suma, multiplicacion o ambas?: ");
        respuesta = tcl.next();
        switch (respuesta) {
            case "suma":
                if ((fila1 == fila2) && (columna1 == columna2)) {
                    for (int i = 0; i < matriz1.length; i++) {
                        for (int j = 0; j < matriz1[0].length; j++) {
                            suma[i][j] = matriz1[i][j] + matriz2[i][j];
                            System.out.print("[ " + suma[i][j] + " ] ");

                        }
                        System.out.println(" ");
                    }
                } else {
                    System.out.println("No se suma porque son diferentes :C");
                }

                break;
            case "multiplicacion":
                if (columna1 == fila2) {
                    for (int i = 0; i < matriz1.length; i++) {
                        for (int j = 0; j < matriz2[0].length; j++) {
                            for (int k = 0; k < matriz2.length; k++) {
                                multiplicacion[i][j] += matriz1[i][k] * matriz2[k][j];
                            }
                        }
                    }
                    for (int i = 0; i < multiplicacion.length; i++) {
                        for (int j = 0; j < multiplicacion[0].length; j++) {
                            System.out.print("[ " + multiplicacion[i][j] + " ] ");

                        }
                        System.out.println(" ");
                    }
                } else {
                    System.out.println("Imposible multiplicar");
                }

                break;
            case "ambas":
                if ((fila1 == fila2) && (columna1 == columna2)) {
                    System.out.println("Suma");
                    for (int i = 0; i < matriz1.length; i++) {
                        for (int j = 0; j < matriz1[0].length; j++) {
                            suma[i][j] = matriz1[i][j] + matriz2[i][j];
                            System.out.print("[ " + suma[i][j] + " ] ");

                        }
                        System.out.println(" ");
                    }
                } else {
                    System.out.println("No se suma porque son diferentes :C");
                }
                System.out.println("");
                if (columna1 == fila2) {
                    System.out.println("Multiplicacion");
                    for (int i = 0; i < matriz1.length; i++) {
                        for (int j = 0; j < matriz2[0].length; j++) {
                            for (int k = 0; k < matriz2.length; k++) {
                                multiplicacion[i][j] += matriz1[i][k] * matriz2[k][j];
                            }
                        }
                    }
                    for (int i = 0; i < multiplicacion.length; i++) {
                        for (int j = 0; j < multiplicacion[0].length; j++) {
                            System.out.print("[ " + multiplicacion[i][j] + " ] ");

                        }
                        System.out.println(" ");
                    }
                } else {
                    System.out.println("No se multiplica :C");
                }

                break;

            default:
                System.out.println("No");
        }
    }

}

/* 
Digame las filas y columnas de la primera matriz: 3 4
Digame las filas y columnas de la segunda matriz: 3 4
Matriz 1
[ 4 ] [ 1 ] [ 4 ] [ 3 ] 
[ 2 ] [ 1 ] [ 3 ] [ 4 ] 
[ 3 ] [ 2 ] [ 1 ] [ 4 ] 
Matriz 2
[ 4 ] [ 1 ] [ 3 ] [ 0 ]  
[ 4 ] [ 1 ] [ 1 ] [ 0 ]  
[ 3 ] [ 1 ] [ 4 ] [ 2 ]  
Suma, multiplicacion o ambas?: ambas
Suma
[ 8 ] [ 2 ] [ 7 ] [ 3 ]  
[ 6 ] [ 2 ] [ 4 ] [ 4 ]  
[ 6 ] [ 3 ] [ 5 ] [ 6 ]  

No se multiplica :C
*/
