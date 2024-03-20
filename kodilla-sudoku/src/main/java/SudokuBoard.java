import java.util.ArrayList;

public class SudokuBoard {
    private ArrayList<SudokuRow> rowsInBoard;

    public SudokuBoard(ArrayList<SudokuRow> rowsInBoard) {
        this.rowsInBoard = rowsInBoard;
    }

    public ArrayList<SudokuRow> getRowsInBoard() {
        return rowsInBoard;
    }

    public static SudokuBoard generateBoard() {
        ArrayList<SudokuRow> rowList = new ArrayList<>();
        ArrayList<Integer> valuesInRow = IoController.getSudokuBoard();

        for (int i = 0; i < 9; i++) {
            ArrayList<SudokuElement> elementsList = new ArrayList<>();
            int startIndex = i * 9;
            int endIndex = (i + 1) * 9;
            for (int j = startIndex; j < endIndex; j++) {
                elementsList.add(new SudokuElement(valuesInRow.get(j)));
            }
            rowList.add(new SudokuRow(elementsList));
        }
        return new SudokuBoard(rowList);
    }


}
