import javax.swing.*;
import java.lang.String;

public class movieTheatre {
    public static void main(String[] args) {
        String movie;
        int TicN;
        int tot = 150;
        int a, c;
        double tax = 0.05;
        double total, fAmt;

        JOptionPane.showMessageDialog(null, "Welcome to Cinepolis!");

        movie = JOptionPane.showInputDialog(null, "Enter movie for watch: ");
        JOptionPane.showMessageDialog(null, "The movie entered is: " + movie);

        if (movie.equals("Godzilla") || movie.equals("godzilla") || movie.equals("GODZILLA")) {

            JOptionPane.showMessageDialog(null, "Adult ticket price: 280" + "\n" + "Child ticket price: 120");
            JOptionPane.showMessageDialog(null, "Total Hall capacity: 150");

            TicN = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter no of tickets"));
            if (TicN <= 10) {
                JOptionPane.showMessageDialog(null, "No of tickets you entered is: " + TicN);
                tot -= TicN;

                a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter no of adult: "));
                JOptionPane.showMessageDialog(null, "No of adults are: " + a);

                c = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter no of child: "));
                JOptionPane.showMessageDialog(null, "No of child are: " + c);

                total = (a * 280) + (c * 120);
                fAmt = total + (total * tax);

                JOptionPane.showMessageDialog(null, "The total is: " + total);
                JOptionPane.showMessageDialog(null, "The final amount after added taxes is: " + fAmt);
                JOptionPane.showMessageDialog(null, "The no of tickets remaining are: " + tot);

            } else {
                JOptionPane.showMessageDialog(null, "Sorry for inconvenience. Talk to Officials for enquiries.");
            }


        } else if (movie.equals("Rockstar") || movie.equals("rockstar") || movie.equals("ROCKSTAR")) {
            JOptionPane.showMessageDialog(null, "Adult ticket price: 250" + "\n" + "Child ticket price: 90");
            JOptionPane.showMessageDialog(null, "Total Hall capacity: 200");

            TicN = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter no of tickets"));
            if (TicN <= 10) {
                JOptionPane.showMessageDialog(null, "No of tickets you entered is: " + TicN);
                tot -= TicN;

                a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter no of adult: "));
                JOptionPane.showMessageDialog(null, "No of adults are: " + a);

                c = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter no of child: "));
                JOptionPane.showMessageDialog(null, "No of child are: " + c);

                total = (a * 250) + (c * 90);
                fAmt = total + (total * tax);

                JOptionPane.showMessageDialog(null, "The total is: " + total);
                JOptionPane.showMessageDialog(null, "The final amount after added taxes is: " + fAmt);
                JOptionPane.showMessageDialog(null, "The no of tickets remaining are: " + tot);
            } else {
                JOptionPane.showMessageDialog(null, "Sorry for inconvenience. Talk to Officials for enquiries.");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Disclaimer! Enter correct movie name.");
        }
    }
}


