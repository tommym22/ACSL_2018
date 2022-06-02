import java.util.ArrayList;
import java.util.Scanner;

public class Mitchell_Stretch {
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
            fillGrid(grid, blockedSpaces, startPiece);
        }
        reader.close();
    }
    public static String[][] fillGrid (String[][] arr, ArrayList<Integer> blocked, int start){
        int number = 1;
        for (int r = 0; r < arr.length; r++){
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = Integer.toString(number);
                number++;
            }
        }
        for (int rb = 0; rb < arr.length; rb++){
            for (int cb = 0; cb < arr[rb].length; cb++) {
               if (blocked.contains(Integer.parseInt(arr[rb][cb]))) {
                   arr[rb][cb] = "X";
               }
               //This breaks TODO find a way to add a start postion without parsing a string
               if (Integer.parseInt(arr[rb][cb]) == start) {
                   arr[rb][cb] = "S";
               }
            }
        }
        return arr;
    }
}
