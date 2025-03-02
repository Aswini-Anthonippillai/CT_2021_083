package Q_06;

import javax.swing.*;
import java.util.*;

public class Question_06{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //getting user input
        int w ,h ;
        String title;
        System.out.println("enter the Title of the window :");
        title = scanner.nextLine();
        System.out.println("enter the width :");
        w = scanner.nextInt();
        System.out.println("enter the height :");
        h = scanner.nextInt();

        //window process
        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(w,h);
        myWindow.setTitle(title);
        myWindow.setVisible(true);
    }
}

