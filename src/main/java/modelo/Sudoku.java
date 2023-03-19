package modelo;

/**
 * @author Orlay Andrés Molina Gómez
 * version 1.0
 */

public class Sudoku {

    private static int[][] sudoku;

    public Sudoku() {
        int[][] sudo = {
                {0, 6, 0, 1, 0, 4, 0, 5, 0},
                {0, 0, 8, 3, 0, 5, 6, 0, 0},
                {2, 0, 0, 0, 0, 0, 0, 0, 1},
                {8, 0, 0, 4, 0, 7, 0, 0, 6},
                {0, 0, 6, 0, 0, 0, 3, 0, 0},
                {7, 0, 0, 9, 0, 1, 0, 0, 4},
                {5, 0, 0, 0, 0, 0, 0, 0, 2},
                {0, 0, 7, 2, 0, 6, 9, 0, 0},
                {0, 4, 0, 5, 0, 8, 0, 7, 0},
        };
        this.sudoku = sudo;
    }

    public static boolean resolverSudoku() {
        for (int fila = 0; fila < sudoku.length; fila++) {
            for (int columna = 0; columna < sudoku[0].length; columna++) {
                if (sudoku[fila][columna] == 0) {
                    for (int valor = 1; valor <= 9; valor++) {
                        if (validarFila(fila, valor,columna) && validarColumna(columna, valor, fila) && validarCuadrante(fila, columna, valor)) {
                            sudoku[fila][columna] = valor;
                            if (resolverSudoku()) {
                                return true;
                            }
                            sudoku[fila][columna] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean validarCuadrante(int fila, int columna, int valor) {
        int posI = subCuadranteActual(fila);
        int posJ = subCuadranteActual(columna);

        for (int i = posI - 3; i < posI; i++) {
            for (int j = posJ - 3; j < posJ; j++) {
                if (sudoku[i][j] == valor) {
                    return false;
                }
            }
        }
        return true;
    }


    public static int subCuadranteActual(int pos) {
        if (pos <= 2) {
            return 3;
        } else if (pos <= 5) {
            return 6;
        } else {
            return 9;
        }
    }

    public static boolean validarFila(int fila, int valor, int columna) {
        if (columna == sudoku[fila].length) {
            return true;
        } if (sudoku[fila][columna] == valor) {
            return false;
        }
        return validarFila(fila, valor, columna + 1);
    }


    public static boolean validarColumna(int columna, int valor, int fila) {
        if (fila == sudoku.length) {
            return true;
        } if (sudoku[fila][columna] == valor) {
            return false;
        }
        return validarColumna(columna, valor, fila + 1);
    }


            /**
             * Función instruccionInicial() usada para explicar al usuario la finalidad del programa.
             */
    public static void instruccionInicial(){
        System.out.println("\n                                      SUDOKU\n");
        System.out.println("El juego de SUDOKU presentado en este proyecto se generará automáticamente, luego");
        System.out.print("se completará por medio backtraking e informará al usuario sí este tenia solución o no.\n\n");
    }

    /**
     * Función recorrerSudoku() empleada para pasar por cada uno de los componenetes del SUDOKU con recursividad.
     * @param fila
     * @param columna
     */
    public static void recorrerSudoku (int fila, int columna){
        if(fila == sudoku.length || columna == sudoku.length){
            System.out.println("\n      --- SUDOKU RECORRIDO ---");
        } else {
            System.out.print(" "+sudoku[fila][columna]+" |");
            if(columna == sudoku.length-1){
                fila++;
                columna = 0;
                System.out.println("");
            }else{
                columna++;
            }
            recorrerSudoku(fila, columna);
        }
    }

    /**
     * Función recorrerSudokuSolucion() emplea dentro de sí misma la función resolverSudoku() para buscar la solución al SUDOKU planteado.
     * @param fila
     * @param columna
     */
    public static void recorrerSudokuSolucion (int fila, int columna){
        resolverSudoku();
        if(fila == sudoku.length || columna == sudoku.length){
            System.out.println("");
        } else {
            System.out.print(" "+sudoku[fila][columna]+" |");
            if(columna == sudoku.length-1){
                fila++;
                columna = 0;
                System.out.println("");
            }else{
                columna++;
            }
            recorrerSudokuSolucion(fila, columna);
        }
    }


    public int[][] getSudoku() {
        return sudoku;
    }

    public void setSudoku(int[][] sudoku) {
        this.sudoku = sudoku;
    }
}
