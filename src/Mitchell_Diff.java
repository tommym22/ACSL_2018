import java.util.Scanner;
public class Mitchell_Diff {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            System.out.println("Please input a valid sequence. This code will run " + i + " more time(s).");
            Scanner reader = new Scanner(System.in);
            String[] line = reader.nextLine().split(" ");
            String oneString = line[0];
            String twoString = line[1];
            String reverseOne = new StringBuilder(oneString).reverse().toString();
            Strign reverseTwo = new StringBuilder(twoString).reverse().toString();
            String[] commonStrings = {"", "", "", ""};
            commonStrings[0] = findCommonString(oneString, twoString);
            commonStrings[1] = findCommonString(twoString, oneString);
            commonStrings[2] = findCommonString();

            System.out.println(commonStrings[0] + " " + commonStrings[1] + " " + commonStrings[2]);
        }

        System.out.println("Goodbye!");
    }
    static String findCommonString(String strOne, String strTwo) {
        String output = "";
        for (int a  = 0; a < strTwo.length()+1; a++) {
            String letter = (strOne.substring(a,a+1));
            if (strTwo.contains(letter)) {
                output += letter;
                strTwo = strTwo.substring(strTwo.indexOf(letter)+1);
            }
        }
        return output;
    }
}
