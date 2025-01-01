
import java.util.Scanner;

/*
Dada una matriz cuadrada (m X m) de valores enteros aleatorios, desarrollar su 
procesamiento para presentar los elementos:

De la diagonal principal.
De la diagonal segundaria.
Ubicados bajo la diagonal principal.
Ubicados sobre la diagonal principal.
Ubicados bajo la diagonal secundaria.
Ubicados sobre la diagonal secundaria.
 * @author Jorge Guerrero
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int lim = 0;
        System.out.print("Deme el limite: ");
        lim = tcl.nextInt();
        int matriz[][] = new int[lim][lim];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("\nDiagonal principal eficiente");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + "\t");
        }
        System.out.println("\nDiagonal secundaria eficiente");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - 1 - i] + "\t");
        }
        System.out.println("\nBajo la diagonal principal");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz [i][j] + "\t");
            }
        }
        System.out.println("\nSobre la diagonal principal");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 1; j < matriz.length -i  ; j++) {
                System.out.print(matriz[i][j + i] + "\t");
                
            }            
        }
        System.out.println("\nBajo la diagonal secundaria");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length - i; j++) {
                System.out.print(matriz [i +j][matriz.length -i] + "\t");               
            }            
        }
        System.out.println("\nSobre la diagonal secundaria");
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length -i -1; j++) {
                System.out.print(matriz [i][j] + "\t");
            }
        }
    }
}
    
      
                
            
            
            

