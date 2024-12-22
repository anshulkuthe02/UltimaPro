import java.util.Scanner;
import java.util.Random;

public class RocksPapersScissors {
    public static void main(String[] args) {
        System.out.println("welcome to Rock Paper Scissor Game.");
        System.out.println("---------------");
        System.out.println("   1 - Rocks" + "\n" + "   2 - Paper " + "\n" + "   3 - Scissor  ");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the player: ");
        String user = sc.next();
        System.out.println("You will begin the game.Press(1-3) and ENTER.");

        int win1 = 0; // System win score.
        int win2 = 0; // User win score.

        for(int i = 0 ;i < 5; i++) {
            int num = sc.nextInt();
            Random var = new Random();
            int comp = var.nextInt(1, 4);
            System.out.println(comp);

            if (num == 1 && comp == 2) {
                System.out.println("System Wins!");
                win1 = win1 + 1;
            } else if (num == 1 && comp == 3) {
                System.out.println(user + " Wins!");
                win2 = win2 + 1;
            } else if (num == 2 && comp == 1) {
                System.out.println(user + " Wins!");
                win2 = win2 + 1;
            } else if (num == 2 && comp == 3) {
                System.out.println("System Wins!");
                win1 = win1 + 1;
            } else if (num == 3 && comp == 1) {
                System.out.println("System Wins!");
                win1 = win1 + 1;
            } else if (num == 3 && comp == 2) {
                System.out.println(user + " Wins!");
                win2 = win2 + 1;
            } else if (num == comp) {
                System.out.println("It's a Draw!");
            } else if (num > 3) {
                System.out.println("Invalid Move!");
            }
        }

        if(win1 > win2){
            System.out.println("System - "+win1+"        User - "+win2);
            System.out.println("The final score is: "+win1+"\nSystem Wins!");
        } else if(win2 > win1){
            System.out.println("System - "+win1+"        User - "+win2);
            System.out.println("The final score is: "+win2+" \n"+user+" Wins!");
        } else
            System.out.println("System - "+win1+"        User - "+win2);
        System.out.println("The game's a Draw.");
    }
}

