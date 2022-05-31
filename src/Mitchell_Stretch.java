import java.util.Scanner;

public class Mitchell_Stretch {
    public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
        for (int i = 5; i > 0; i--) {
            System.out.println("Please input a valid sequence. This code will run " + i + " more time(s).");
            String[] line = reader.nextLine().split(" ");
        }
        reader.close();
    }
}
