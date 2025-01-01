/*
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuáles al finalizar el periodo,
 * la Dirección de la carrera de Computación a solicitado las siguientes estadísticas de la materia
 * INTRODUCCIÓN A LA PROGRAMACIÓN en función a los promedios por estudiante, dichos promedios se deben
 * calcular (ponderar, ya que el docente ingresa todo sobre 10pts.) de 3 calificaciones
 * (ACD que representa el 35% de la nota, APE del 35% y la nota del AA con un peso del 30%).
 * En resumen, los requerimientos son los siguientes:
 * Registre los nombres de cada estudiante de dicho paralelo.
 * Genere aleatoriamente las notas ACD, APE, AA, para cada uno de los 28 estudiantes de 0-10 pts.
 * Calcule el promedio de cada uno de los estudiantes del paralelo dada la siguiente
 * ponderación: ACD->35%, APE->35%, y el AA->30%.
 * Obtenga el promedio del curso, del paralelo C.
 * Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio
 * por encima del promedio del curso.
 * Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio
 * por debajo del promedio del curso.
 * Muestre el estudiante con su calificación, si es el del mayor promedio (el más alto de la clase).
 * Muestre el estudiante con su calificación, si es el del menor promedio (el más bajo de la clase).
 *
 * @author Jorge Guerrero
 */
public class Ejercicio3 {
        public static void main(String[] args) {
        String[] name = {"Jorge", "Daniel", "Pedro", "Fernando", "Lucas", "Musiala", "Diego", "Ricardo", "Timmy", "Luisa", "Maria", "Andres", "Pepo", "Neymar", "Messi", "Ronaldo", "Palmer", "Moises", "Caicedo", "Kross", "Bale", "Suarez", "Iniesta", "Xavi", "Hansi", "Lewandoswski", "Lamine", "Yamal"};
        double[] acd = new double[name.length];
        double[] ape = new double[name.length];
        double[] aa = new double[name.length];
        double[] promedio = new double[name.length];
        double max = 0, min = 10, total = 0;
        int n = 0, n2 = 0, cont = 0, cont2 = 0;
        for (int i = 0; i < name.length; i++) {
            acd[i] = (double) (Math.random() * 10);
            ape[i] = (double) (Math.random() * 10);
            aa[i] = (double) (Math.random() * 10);
            promedio[i] = (acd[i] * 0.35) + (ape[i] * 0.35) + (aa[i] * 0.3);
            total += promedio[i];
            if (max < promedio[i]) {
                max = promedio[i];
                n = i;
            }
            if (min > promedio[i]) {
                min = promedio[i];
                n2 = i;
            }

        }
        total /= 28;
        for (int j = 0; j < name.length; j++) {
            if (promedio[j] < total) {
                cont++;
            } else {
                cont2++;
            }
        }
        System.out.printf("%s%.2f%n", "el promedio del curso es: ", total);
        for (int i = 0; i < promedio.length; i++) {
            if (promedio[i] >= total) {
                System.out.printf("%s%s%.2f%s%.2f%s%.2f%s%.2f%s%n", name[i], " ,ACD = ", acd[i], " ,APE = ", ape[i], " AA =  ", aa[i], " ,PROMEDIO = ", promedio[i], " (el estudiante esta por encima del promedio del curso)");
            } else {
                System.out.printf("%s%s%.2f%s%.2f%s%.2f%s%.2f%s%n", name[i], " ,ACD", acd[i], " ,APE", ape[i], " ,AA ", aa[i], " ,PROMEDIO: ", promedio[i], " (el estudiante esta por debajo del promedio del curso)");

            }

        }
        System.out.println("Existen: " + cont + " por encima del promedio\n" + "Existen: " + cont2 + " Por debajo del promedio");
        System.out.printf("%s%s%s%.2f%s%s%s%.2f%n","El mejor estudiantes es: " , name[n] , " con: " , promedio[n] , "\nEl peor es: " , name[n2] , " con: " , promedio[n2]);
    }
}

/* 
el promedio del curso es: 5,18
Jorge ,ACD0,07 ,APE4,51 ,AA 5,30 ,PROMEDIO: 3,19 (el estudiante esta por debajo del promedio del curso)
Daniel ,ACD1,82 ,APE3,10 ,AA 7,93 ,PROMEDIO: 4,10 (el estudiante esta por debajo del promedio del curso)
Pedro ,ACD = 6,78 ,APE = 8,50 AA =  9,65 ,PROMEDIO = 8,25 (el estudiante esta por encima del promedio del curso)
Fernando ,ACD = 6,08 ,APE = 8,88 AA =  1,35 ,PROMEDIO = 5,64 (el estudiante esta por encima del promedio del curso)
Lucas ,ACD5,84 ,APE4,46 ,AA 0,17 ,PROMEDIO: 3,66 (el estudiante esta por debajo del promedio del curso)
Musiala ,ACD = 8,32 ,APE = 4,74 AA =  6,61 ,PROMEDIO = 6,55 (el estudiante esta por encima del promedio del curso)
Diego ,ACD = 5,71 ,APE = 8,74 AA =  3,62 ,PROMEDIO = 6,15 (el estudiante esta por encima del promedio del curso)
Ricardo ,ACD2,45 ,APE6,49 ,AA 4,33 ,PROMEDIO: 4,43 (el estudiante esta por debajo del promedio del curso)
Timmy ,ACD4,30 ,APE4,29 ,AA 3,14 ,PROMEDIO: 3,95 (el estudiante esta por debajo del promedio del curso)
Luisa ,ACD = 3,61 ,APE = 8,51 AA =  9,67 ,PROMEDIO = 7,14 (el estudiante esta por encima del promedio del curso)
Maria ,ACD = 6,89 ,APE = 4,83 AA =  6,61 ,PROMEDIO = 6,09 (el estudiante esta por encima del promedio del curso)
Andres ,ACD = 8,90 ,APE = 7,11 AA =  7,12 ,PROMEDIO = 7,74 (el estudiante esta por encima del promedio del curso)
Pepo ,ACD = 7,23 ,APE = 9,41 AA =  9,39 ,PROMEDIO = 8,64 (el estudiante esta por encima del promedio del curso)
Neymar ,ACD = 5,19 ,APE = 7,30 AA =  7,99 ,PROMEDIO = 6,77 (el estudiante esta por encima del promedio del curso)
Messi ,ACD0,09 ,APE8,62 ,AA 7,08 ,PROMEDIO: 5,17 (el estudiante esta por debajo del promedio del curso)
Ronaldo ,ACD6,82 ,APE3,52 ,AA 2,79 ,PROMEDIO: 4,46 (el estudiante esta por debajo del promedio del curso)
Palmer ,ACD = 2,18 ,APE = 9,19 AA =  5,52 ,PROMEDIO = 5,63 (el estudiante esta por encima del promedio del curso)
Moises ,ACD = 4,77 ,APE = 5,16 AA =  5,74 ,PROMEDIO = 5,20 (el estudiante esta por encima del promedio del curso)
Caicedo ,ACD2,98 ,APE4,24 ,AA 2,71 ,PROMEDIO: 3,34 (el estudiante esta por debajo del promedio del curso)
Kross ,ACD3,05 ,APE2,30 ,AA 6,43 ,PROMEDIO: 3,80 (el estudiante esta por debajo del promedio del curso)
Bale ,ACD0,17 ,APE1,80 ,AA 0,90 ,PROMEDIO: 0,96 (el estudiante esta por debajo del promedio del curso)
Suarez ,ACD1,25 ,APE4,53 ,AA 3,35 ,PROMEDIO: 3,03 (el estudiante esta por debajo del promedio del curso)
Iniesta ,ACD5,21 ,APE0,67 ,AA 8,33 ,PROMEDIO: 4,56 (el estudiante esta por debajo del promedio del curso)
Xavi ,ACD = 9,75 ,APE = 5,10 AA =  3,83 ,PROMEDIO = 6,35 (el estudiante esta por encima del promedio del curso)
Hansi ,ACD1,79 ,APE4,18 ,AA 9,87 ,PROMEDIO: 5,05 (el estudiante esta por debajo del promedio del curso)
Lewandoswski ,ACD = 8,07 ,APE = 7,52 AA =  5,87 ,PROMEDIO = 7,22 (el estudiante esta por encima del promedio del curso)
Lamine ,ACD2,92 ,APE2,24 ,AA 2,71 ,PROMEDIO: 2,62 (el estudiante esta por debajo del promedio del curso)
Yamal ,ACD = 5,94 ,APE = 3,05 AA =  7,69 ,PROMEDIO = 5,46 (el estudiante esta por encima del promedio del curso)
Existen: 14 por encima del promedio
Existen: 14 Por debajo del promedio
El mejor estudiantes es: Pepo con: 8,64
El peor es: Bale con: 0,96
BUILD SUCCESSFUL (total time: 0 seconds)
*/
