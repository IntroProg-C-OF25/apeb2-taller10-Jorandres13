
import java.util.Scanner;

/*
 * Crea un juego de tres en raya utilizando una matriz bidimensional de 3x3. 
 * Permita a dos jugadores marcar sus movimientos alternativamente.
 * El juego debe verificar si alguno de los jugadores ha ganado o si hay un empate.
 * @author Jorge Guerrero
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String[][] raya = new String[3][3];
        boolean zi = true, cau = true, si = true, ta;
        String respuesta;
        int fila, columna, bot, bot2;
        while (zi) {
            System.out.print("Jugamos? : ");
            respuesta = tcl.next();
            if (respuesta.equals("si")) {
                for (int i = 0; i < raya.length; i++) {
                    for (int j = 0; j < raya.length; j++) {
                        System.out.print("{  }");
                        raya[i][j] = " ";
                    }
                    System.out.println(" ");
                }
                while (cau) {
                    System.out.println("Ingresa cordenadas: ");
                    fila = tcl.nextInt();
                    columna = tcl.nextInt();
                    raya[fila][columna] = "x";
                    for (int i = 0; i < raya.length; i++) {
                        for (int j = 0; j < raya.length; j++) {
                            System.out.print("{ " + raya[i][j] + " }");

                        }
                        System.out.println(" ");
                    }
                    bot = (int) (Math.random() * 3);
                    bot2 = (int) (Math.random() * 3);
                    si = true;
                    while (si) {
                        if (raya[bot][bot2].equals(("x"))) {
                            bot = (int) (Math.random() * 3);
                            bot2 = (int) (Math.random() * 3);
                        } else if (raya[bot][bot2].equals(("O"))) {
                            bot = (int) (Math.random() * 3);
                            bot2 = (int) (Math.random() * 3);
                        } else {
                            raya[bot][bot2] = "O";
                            si = false;
                        }
                    }
                    System.out.println("++++++++++++++++++++++++++++++");
                    for (int i = 0; i < raya.length; i++) {
                        for (int j = 0; j < raya.length; j++) {
                            System.out.print("{ " + raya[i][j] + " }");

                        }
                        System.out.println(" ");
                    }
                    ta = true;
                    while (ta) {

                        if ((raya[0][0].equals(raya[1][1]) && (raya[1][1].equals(raya[2][2])))) {
                            if (raya[0][0].equals("x")) {
                                System.out.println("ganaste");
                                zi = false;
                                cau = false;
                                ta = false;
                            } else if (raya[0][0].equals("O")) {
                                System.out.println("ganaste");
                                zi = false;
                                cau = false;
                                ta = false;

                            }
                            if ((raya[0][2].equals(raya[1][1]) && (raya[1][1].equals(raya[2][0])))) {
                                if (raya[0][2].equals("x")) {
                                    System.out.println("ganaste");
                                    zi = false;
                                    cau = false;
                                    ta = false;
                                } else if (raya[0][2].equals("O")) {
                                    System.out.println("ganaste");
                                    zi = false;
                                    cau = false;
                                    ta = false;

                                }

                            }

                        }
                        for (int i = 0; i < raya.length; i++) {

                            if (raya[i][0].equals(raya[i][1])) {
                                if (raya[i][2].equals(raya[i][0])) {
                                    if (raya[i][0].equals("x")) {
                                        System.out.println("Ganaste");
                                        zi = false;
                                        cau = false;
                                        ta = false;
                                    } else if (raya[i][0].equals("O")) {
                                        System.out.println("Perdiste");
                                        zi = false;
                                        cau = false;
                                        ta = false;
                                    }
                                }
                            }
                            if (raya[0][i].equals(raya[1][i])) {
                                if (raya[2][i].equals(raya[0][i])) {
                                    if (raya[0][i].equals("x")) {
                                        System.out.println("Ganaste");
                                        zi = false;
                                        cau = false;
                                        ta = false;
                                    } else if (raya[0][i].equals("O")) {
                                        System.out.println("Perdiste");
                                        zi = false;
                                        cau = false;
                                        ta = false;
                                    }
                                }
                            }
                            if (raya[0][2].equals(raya[1][1])) {
                                if (raya[2][0].equals(raya[1][1])) {
                                    if (raya[0][i].equals("x")) {
                                        System.out.println("Ganaste");
                                        zi = false;
                                        cau = false;
                                        ta = false;
                                    } else if (raya[0][i].equals("O")) {
                                        System.out.println("Perdiste");
                                        zi = false;
                                        cau = false;
                                        ta = false;
                                    }
                                }
                            }

                        }
                        ta = false;

                    }
                }
            }
        }
    }
}

/* 
Jugamos? : no
Jugamos? : si
{  }{  }{  } 
{  }{  }{  } 
{  }{  }{  } 
Ingresa cordenadas: 
1 1
{   }{   }{   } 
{   }{ x }{   } 
{   }{   }{   } 
++++++++++++++++++++++++++++++
{   }{   }{ O } 
{   }{ x }{   } 
{   }{   }{   } 
Ingresa cordenadas: 
1 0
{   }{   }{ O } 
{ x }{ x }{   } 
{   }{   }{   } 
++++++++++++++++++++++++++++++
{   }{   }{ O } 
{ x }{ x }{   } 
{ O }{   }{   } 
Ingresa cordenadas: 
1 2
{   }{   }{ O } 
{ x }{ x }{ x } 
{ O }{   }{   } 
++++++++++++++++++++++++++++++
{ O }{   }{ O } 
{ x }{ x }{ x } 
{ O }{   }{   } 
Ganaste
 */
