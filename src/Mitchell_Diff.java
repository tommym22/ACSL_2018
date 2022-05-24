import java.util.Scanner;
//TODO ideas, create an array and throw all common strings in there
public class Mitchell_Diff {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            System.out.println("Please input a valid sequence. This code will run " + i + " more time(s).");
            Scanner reader = new Scanner(System.in);
            String[] line = reader.nextLine().split(" ");
            String[] commonStrings = {"", "", "", ""};
            String aString = line[0];
            String aStringR = line[0];
            String bString = line[1];
            String bStringR = line[1];
            // Go from A To B, L -> R
            for (int a  = 0; a < bString.length(); a++) {
                String letter = (line[0].substring(a,a+1));
                if (bString.contains(letter)) {
                    commonStrings[0] += letter;
                    bString = bString.substring(bString.indexOf(letter)-1);
                }
            }
            // Go from B To A, L -> R
            for (int b  = 0; b < aString.length(); b++) {
                String letter = (line[1].substring(b,b+1));
                if (aString.contains(letter)) {
                    commonStrings[1] += letter;
                    aString = aString.substring(aString.indexOf(letter)-1);
                }
            }
            //Go From A To B, L -> R
            for (int c = bStringR.length()-1; c > 1; c--) {
                String letter = (line[0].substring(c-1, c));
                if (bStringR.contains(letter)) {
                    commonStrings[2] += letter;
                    bStringR = bStringR.substring(bStringR.indexOf(letter)-1);
                }
            }
            
            System.out.println(commonStrings[0] + " " + commonStrings[1] + " " + commonStrings[2]);
        }
        System.out.println("Goodbye!");
    }
}
