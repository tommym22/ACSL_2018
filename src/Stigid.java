import java.util.Scanner;

public class Stigid {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Please input a number sequence, followed by a space, and then another number");
            Scanner reader = new Scanner(System.in);
            String line = reader.nextLine();

            int nthDigit = Integer.parseInt(line.substring(line.indexOf(" ")+1));
            //System.out.println(nthDigit);
            String newStr = line.substring(0, line.indexOf(" "));
            //System.out.println(newStr);

            int sum = 0;
            //TODO Ask Mr. Moore why this doesn't work with the last example
            while (newStr.length()-nthDigit +1 > 0) {
                sum = sum+ Integer.parseInt(newStr.substring(0, nthDigit));
                System.out.println(Integer.parseInt(newStr.substring(0, nthDigit)));
                newStr = newStr.substring(1);

            }
            System.out.println("Your Sum is: " + sum);
        }

    }
}
