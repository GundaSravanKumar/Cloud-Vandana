package jdbc_programs;

import java.util.Scanner;

/**
 * @author:G.Sravan Kumar
 */
public class PangramOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Sentence");
        String sentence = sc.next();
        boolean isPangram = checkPangram(sentence);
        if(isPangram==true) {
        System.out.println("Given Sentence is a pangram" );
        }
        else {
            System.out.println("Given Sentence is Not a pangram" );
        }
    }

    public static boolean checkPangram(String sentence) {
        String lowercaseSentence = sentence.toLowerCase();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (lowercaseSentence.indexOf(letter) == -1) {
                return false;
            }
        }
        return true;
    }

}
