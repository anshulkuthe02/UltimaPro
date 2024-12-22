import javax.swing.*;
public class Theatre1 {
    public static void main(String[] args) {
        String movieName;
        String inputStr;
        String outputStr;

        double adultTicketPrice;
        double childTicketPrice;
        int noOfAdultTicketsSold;
        int noOfChildTicketSold;

        double percentDonation;
        double grossAmount;
        double amountDonated;
        double netSaleAmount;

        movieName = JOptionPane.showInputDialog(null,"Enter Movie Name: ");
        JOptionPane.showMessageDialog(null,"The Movie Name Entered is: "+movieName);

        adultTicketPrice = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Adult ticket price: "));
        JOptionPane.showMessageDialog(null,"The price of adult ticket is: "+adultTicketPrice);

        childTicketPrice = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Child ticket price: "));
        JOptionPane.showMessageDialog(null,"The price of child ticket is: "+childTicketPrice);

        noOfAdultTicketsSold = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of adult tickets sold: "));
        JOptionPane.showMessageDialog(null,"Total adult tickets sold are: "+noOfAdultTicketsSold);

        noOfChildTicketSold = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of child ticket sold: "));
        JOptionPane.showMessageDialog(null,"Total Child tickets sold are: "+noOfChildTicketSold);

        percentDonation = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter percent donation: "));
        JOptionPane.showMessageDialog(null,"Percent Donation is: "+percentDonation);

        grossAmount = (adultTicketPrice+childTicketPrice)+(adultTicketPrice+childTicketPrice)*3/100;
        System.out.println("Gross Amount calculated is: "+grossAmount);

        amountDonated = grossAmount-((adultTicketPrice+childTicketPrice)*(percentDonation)/100);
        System.out.println("Amount Donated is: "+amountDonated);

        netSaleAmount = grossAmount + amountDonated;
        System.out.println("Net Sale Amount is: "+netSaleAmount);

        System.out.println("Movie name: "+movieName+"\n"+"Number of tickets sold: "+(noOfAdultTicketsSold+noOfChildTicketSold)+"\n"+"Gross Amount: $"+String.format("%.2f",grossAmount)+"\n"+"Percentage of Gross Amount Donated: "+String.format("%.2f88",percentDonation)+"\n"+"Amount Donated: $"+String.format("%.2f",amountDonated)+"\n"+"Net Sale: $"+String.format("%.2f",netSaleAmount));
    }
}
