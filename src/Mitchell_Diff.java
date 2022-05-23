import java.util.Scanner;
//TODO ideas, create an array and throw all common strings in there, use recursion? :throwup
public class Mitchell_Diff {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            System.out.println("Please input a valid sequence. This code will run " + i + " more time(s).");
            Scanner reader = new Scanner(System.in);
            String[] line = reader.nextLine().split(" ");
            String commonString = "";
            String output = "";
            String secondString = line[1];
            for (int k = 0; k < secondString.length(); k++) {
                String letter = line[0].substring(k,k+1);
                if (secondString.contains(letter)) {
                    secondString = secondString.substring(secondString.indexOf(letter));
                    commonString += line[0].substring(k,k+1);
                }
            }
            String firstString = line[0];
            String secondCommonString = "";
            for (int m = 0; m < firstString.length(); m++) {
                String letter = line[1].substring(m,m+1);
                if (firstString.contains(letter)) {
                    firstString = firstString.substring(firstString.indexOf(letter));
                    secondCommonString += line[1].substring(m,m+1);
                }
            }
            System.out.println(secondCommonString);
        }
        System.out.println("Goodbye!");
    }
}
