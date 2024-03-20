import java.util.ArrayList;

public class SudokuRow {
    private ArrayList<SudokuElement> elementsInRow;

    public SudokuRow(ArrayList<SudokuElement> elementsInRow) {
        this.elementsInRow = elementsInRow;
    }

    public ArrayList<SudokuElement> getElementsInRow() {
        return elementsInRow;
    }
}
