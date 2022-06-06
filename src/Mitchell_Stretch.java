import java.util.ArrayList;
import java.util.Scanner;

public class Mitchell_Stretch {
    int  number = 0;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        for (int i = 5; i > 0; i--) {
            System.out.println("Please input a valid sequence. This code will run " + i + " more time(s).");
            String[] line = reader.nextLine().split(" ");
            String[][] grid = new String[Integer.parseInt(line[0])][Integer.parseInt(line[1])];

            //Add all blocked spaces to an arrayList
            ArrayList<Integer> blockedSpaces = new ArrayList<Integer>();
            for (int a = 4; a < line.length; a++) {
                blockedSpaces.add(Integer.parseInt(line[a]));
            }
            int startPiece = Integer.parseInt(line[2]);
            //Use the fillGrid method to add numbers and blocked Spaces and the starting piece.
            grid = fillGrid(grid, blockedSpaces, startPiece);
            //use the placePieces method to place the pieces and print out that result
            System.out.println(placePieces(grid));
        }
        reader.close();
    }

    /*Take in an empty 2d array, a filled ArrayList with the blocked elements, and a starting integer
      First, loop through and add a bunch of numbers to the grid in numerical order
      Next, loop through and add all the blocked spaces and the starting space
      Return this new 2d array
     */
    public  String[][] fillGrid(String[][] arr, ArrayList<Integer> blocked, int start) {
        int number = 1;
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = Integer.toString(number);
                number++;
            }
        }
        for (int rb = 0; rb < arr.length; rb++) {
            for (int cb = 0; cb < arr[rb].length; cb++) {
                if (!arr[rb][cb].equals("X") && blocked.contains(Integer.parseInt(arr[rb][cb]))) {
                    arr[rb][cb] = "X";
                }

                if ((!arr[rb][cb].equals("X") && !arr[rb][cb].equals("S")) && Integer.parseInt(arr[rb][cb]) == start) {
                    arr[rb][cb] = "S";
                }
            }
        }
        return arr;
    }

    public  String placePieces(String[][] arr) {
        String output = "";

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c].equals("S")) {
                    if (currentPiece().equals("A") && c + 2 < arr[c].length && !arr[r][c].equals("X")) {
                        output += currentPiece();

                    }
                    currentPiece();
                }
                if ()

            }
        }
        return output;
    }

    public String currentPiece() {
        String[] arr = {"A", "B", "C"};
            return arr[number];
            if (number > 2) {
                number = 0;
                return number;

            }
    }
    public void setNumberToZero
}
