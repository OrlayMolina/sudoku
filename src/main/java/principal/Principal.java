package principal;

import modelo.Sudoku;

import static modelo.Sudoku.instruccionInicial;
import static modelo.Sudoku.recorrerSudoku;

public class Principal {

    static int[][] sudo = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
    };

    public static void main( String[] args ){

        Sudoku sudoku = new Sudoku(sudo);
        instruccionInicial();
        recorrerSudoku(sudo, 0, 0);
        //generarSudoku(sudo, 0, 0);
        System.out.println("\nJuego de Sudoku generado automáticamente.");
        //recorrerSudoku(sudo, 0, 0);
        System.out.println("\nGenerando solución ... Espere por favor\n");
        System.out.println("      --- SOLUCIÓN HALLADA ---\n");
        //recorrerSudoku(sudo, 0, 0);
        System.out.println("      --- FIN DEL PROGRAMA ---\n");

    }
}
