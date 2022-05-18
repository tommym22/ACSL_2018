import java.util.Scanner;

public class Mitchell_Stigid {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            System.out.println("Please input a valid sequence. This code will run " + i + " more time(s).");
            Scanner reader = new Scanner(System.in);
            String line = reader.nextLine();

            int nthDigit = Integer.parseInt(line.substring(line.indexOf(" ")+1));
            String newStr = line.substring(0, line.indexOf(" "));

            long sum = 0;

            while (newStr.length()-nthDigit +1 > 0) {
                sum = sum+ Long.parseLong(newStr.substring(0, nthDigit));
                newStr = newStr.substring(1);

            }
            System.out.println("Your Sum is: " + sum);
        }
        System.out.println("Goodbye!");
    }
}
