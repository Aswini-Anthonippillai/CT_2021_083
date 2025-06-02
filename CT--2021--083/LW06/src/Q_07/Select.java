package Q_07;
import java.util.Scanner;

public class Select {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the original sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Get the word to be replaced
        System.out.print("Enter the word to replace: ");
        String oldWord = sc.nextLine();

        // Get the replacement word
        System.out.print("Enter the replacement word: ");
        String newWord = sc.nextLine();

        // Replace the word
        String newSentence = sentence.replace(oldWord, newWord);

        // Display the result
        System.out.println("Updated sentence: " + newSentence);

        sc.close();
    }
}


