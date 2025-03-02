package Q_07;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;

public class Question_07 {
    public static void main(String[] args) {

        Date today;
        SimpleDateFormat sdf;
        today = new Date( );
        sdf = new SimpleDateFormat("hh:mm:ss a.");
        //System.out.println(sdf.format(today));

        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(600,400);
        myWindow.setTitle(sdf.format(today));
        myWindow.setVisible(true);
    }
}

