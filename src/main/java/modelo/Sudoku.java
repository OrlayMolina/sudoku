package modelo;

/**
 * @author Orlay Andrés Molina Gómez
 * version 1.0
 */

public class Sudoku {

    private int sudoku[][];

    public Sudoku(int[][] sudoku) {
        this.sudoku = sudoku;
    }

    /**
     * Función generarSudoku recibe por parámetro una matriz de 9x9  y subdivide la matriz en 9 bloques 3x3,
     * en dónde generará tres números aleatorios con la función random() en el rango de 1 a 9 para cada
     * sub-bloque de 3x3 que no puede ser el mismo número, adicionalmente comprobará en la matriz macro de
     * 9x9 que no se repita números en la misma fila y columna.
     * @param sudoku
     * @param fila
     * @param columna
     * @return
     */
    public static int[][] generarSudoku(int[][] sudoku,int fila, int columna){
        if(fila < 2){

        }

        return sudoku;
    }

    /**
     * Función instruccionInicial() usada para explicar al usuario la finalidad del programa.
     */
    public static void instruccionInicial(){
        System.out.println("\n                                      SUDOKU\n");
        System.out.println("El juego de SUDOKU presentado en este proyecto se generará automaticamente, luego");
        System.out.print("se completará por backtraking e informará al usuario si este tenia solución.\n\n");
    }

    /**
     * Función recorrerSudoku() empleada para pasar por cada uno de los componenetes del SUDOKU con recursividad.
     * @param matriz
     * @param fila
     * @param columna
     */
    public static void recorrerSudoku(int[][] matriz, int fila, int columna){
        if(fila == matriz.length || columna == matriz.length){
            System.out.println("\n      --- SUDOKU RECORRIDO ---");
        } else {
            System.out.print(" "+matriz[fila][columna]+" |");
            if(columna == matriz.length-1){
                fila++;
                columna = 0;
                System.out.println("");
            }else{
                columna++;
            }
            recorrerSudoku(matriz, fila, columna);
        }
    }


    public int[][] getSudoku() {
        return sudoku;
    }

    public void setSudoku(int[][] sudoku) {
        this.sudoku = sudoku;
    }
}
