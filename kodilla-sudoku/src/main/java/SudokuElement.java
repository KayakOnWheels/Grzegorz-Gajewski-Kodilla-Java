import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    public static int EMPTY = 0;
    private int value;
    private ArrayList<Integer> possibleValues;

    public SudokuElement(int value) {
        this.value = value;
        if (value == EMPTY) {
            this.possibleValues = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        } else{
            this.possibleValues = new ArrayList<>();
        }
    }

    public int getValue() {
        return value;
    }

    public ArrayList<Integer> getPossibleValues() {
        return possibleValues;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setPossibleValues(ArrayList<Integer> possibleValues) {
        this.possibleValues = possibleValues;
    }
}
