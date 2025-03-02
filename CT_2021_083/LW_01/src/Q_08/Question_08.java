package Q_08;
import java.util.*;

public class Question_08 {
    public static void main(String[] args) {
        String word ,a,b ;
        //new array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word :");
        word = scanner.nextLine();

        String[] sentence = word.split("!",2);

        if (sentence.length == 2){
            System.out.println(sentence[0].trim());
            System.out.println(sentence[1].trim());
        }
    }
}



