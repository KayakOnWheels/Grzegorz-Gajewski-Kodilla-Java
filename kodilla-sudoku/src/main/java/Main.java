import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
/*        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
        }*/
        ArrayList<SudokuRow> rows = new ArrayList<>();
        SudokuBoard board = SudokuBoard.generateBoard();
        IoController.printBoard(board);
        SudokuSolver.solve(board);
        System.out.println();
        IoController.printBoard(board);
    }
}
