
import java.util.Scanner;
// declaration of class

public class VowelCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
// read user nput and convert the input string to lowercase 
        String str = sc.next().toLowerCase();
        // vowel count initialization
        int count = 0;
//iterating over characters
// This line starts a for-each loop that iterates 
// over each character in the string str. The toCharArray() 
// method converts the string into an array of characters.
        for (char c : str.toCharArray()) {
            // Inside the loop, this line checks if the current 
            // character c is a vowel. The expression
            //  "aeiou".indexOf(c) returns the index of the
            //   character c in the string "aeiou". 
            //   If c is a vowel, indexOf will return a value
            //    greater than or equal to 0 (the index of the 
            //    vowel), and if it is not a vowel, it will
            //    return -1. 
            //   Thus, the condition checks if c is a vowel.
            if ("aeiou".indexOf(c) != -1) {
//increment
                count++;
            }
        }
        System.out.println("Number of vowels:" + count);

        sc.close();
    }
}
