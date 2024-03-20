import java.util.ArrayList;
import java.util.Scanner;

public class IoController {

    public static ArrayList<Integer> getSudokuBoard() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> values = new ArrayList<>();
        System.out.println("enter values");
        String tmp = scanner.nextLine();
        String[] splitted = tmp.split(",");


        for(String s : splitted) {
            values.add(Integer.parseInt(s));
        }
        return values;
    }

    public static void printBoard(SudokuBoard board) {
        ArrayList<SudokuRow> rows = board.getRowsInBoard();
        int i = 0;
        for(SudokuRow row : rows) {
            System.out.println();
            for(SudokuElement element : row.getElementsInRow()) {
                System.out.print(element.getValue());
            }
            i++;
        }

    }

}
//5,3,0,0,7,0,0,0,0,6,0,0,1,9,5,0,0,0,0,9,8,0,0,0,0,0,6,0,8,0,0,0,6,0,0,0,3,4,0,0,8,0,3,0,0,1,7,0,0,0,2,0,0,0,6,0,6,0,0,0,0,2,8,0,0,0,0,4,1,9,0,0,5,0,0,0,0,8,0,0,7,9