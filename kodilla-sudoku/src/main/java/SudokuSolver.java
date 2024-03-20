import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SudokuSolver {

    public static void solve(SudokuBoard sudokuBoard) {
        SudokuElement currentElement;

        for(int y = 0; y<9; y++) {
            for (int x = 0; x<9; x++) {
                currentElement = sudokuBoard.getRowsInBoard().get(y).getElementsInRow().get(x);
                if(currentElement.getValue() == SudokuElement.EMPTY) {
                    checkRow(sudokuBoard, x, y);
                    checkColumn(sudokuBoard, x, y);
                    checkSegment(sudokuBoard, x, y);
                    if(!currentElement.getPossibleValues().isEmpty()) {
                        currentElement.setValue(currentElement.getPossibleValues().get(0));
                    } else {

                    }
                }
            }
        }
    }

    public static void checkRow(SudokuBoard sudokuBoard, int x, int y) {

        ArrayList<SudokuElement> elements = sudokuBoard.getRowsInBoard().get(y).getElementsInRow();
        SudokuElement currentElement = elements.get(x);
        Set<Integer> possibleValues = new HashSet<>(currentElement.getPossibleValues());

        for(SudokuElement element : elements) {
            possibleValues.remove(element.getValue());
        }
        currentElement.setPossibleValues(new ArrayList<>(possibleValues));
    }

    public static void checkColumn(SudokuBoard sudokuBoard, int x, int y) {

        SudokuElement currentElement = sudokuBoard.getRowsInBoard().get(y).getElementsInRow().get(x);
        Set<Integer> possibleValues = new HashSet<>(currentElement.getPossibleValues());
        ArrayList<SudokuRow> rowsInBoard = sudokuBoard.getRowsInBoard();

        for(SudokuRow row : rowsInBoard) {
            possibleValues.remove(row.getElementsInRow().get(x).getValue());
        }
        currentElement.setPossibleValues(new ArrayList<>(possibleValues));
    }
    public static void checkSegment(SudokuBoard sudokuBoard, int x, int y) {

        SudokuElement currentElement = sudokuBoard.getRowsInBoard().get(y).getElementsInRow().get(x);
        Set<Integer> possibleValues = new HashSet<>(currentElement.getPossibleValues());

        for(int i = x-x%3; i<3; i++) {
            for(int j = y-y%3; j<3; j++) {
                possibleValues.remove(sudokuBoard.getRowsInBoard().get(j).getElementsInRow().get(i).getValue());
            }
        }
        currentElement.setPossibleValues(new ArrayList<>(possibleValues));
    }

}
