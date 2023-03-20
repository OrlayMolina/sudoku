package principal;

import modelo.Sudoku;

import static modelo.Sudoku.*;

public class Principal {


    public static void main( String[] args ){

        Sudoku sudoku = new Sudoku();
        instruccionInicial();
        recorrerSudoku(0,0);
        System.out.println("\nNúmeros de Sudoku generados automáticamente.");
        System.out.println("\nGenerando solución al SUDOKU ... Espere por favor\n");
        System.out.println("      --- SOLUCIÓN HALLADA ---\n");
        recorrerSudokuSolucion( 0, 0);
        System.out.println("      --- FIN DEL PROGRAMA ---\n");

    }
}
