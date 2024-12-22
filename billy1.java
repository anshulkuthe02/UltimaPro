import java.util.Scanner;
class Bill {
    private
    int accNum;
    int noOfPChan;
    int noOfBasiCon;
    double aDue;
    char cusType;
    static final double R_Bill_Pro_Fee = 4.50;
    static final double R_Basic_Serv_Cost = 20.50;
    static final double R_Cost_Prem_Chan = 7.50;
    static final double B_Bill_Pro_Fee = 15.00;
    static final double B_Basic_Ser_cost = 75.00;
    static final double B_Bas_Cons_cost = 5.00;
    static final double B_Cost_Prem_Ch = 50.00;
    public
    void setData(int accNum, int noOfBasiCon, int noOfPChan, char cusType, double aDue){
        this.accNum = accNum;
        this.aDue = aDue;
        this.cusType = cusType;
        this.noOfBasiCon = noOfBasiCon;
        this.noOfPChan = noOfPChan;
    }
    void total(){
        aDue = R_Bill_Pro_Fee+ R_Basic_Serv_Cost + (noOfPChan * R_Cost_Prem_Chan);
        System.out.println("The final billing amount of account number " + accNum + " is: "+aDue);
    }
    void total1(){
        if(noOfBasiCon <= 10){
            aDue = B_Bill_Pro_Fee + B_Basic_Ser_cost + (this.noOfPChan * B_Cost_Prem_Ch);
            System.out.println("The final billing amount of account number " + accNum + " is: "+aDue);
        } else {
            aDue = B_Bill_Pro_Fee + B_Basic_Ser_cost + ((noOfBasiCon-10) * B_Bas_Cons_cost) + (noOfPChan * B_Cost_Prem_Ch);
            System.out.println("The final billing amount of account number " + accNum + " is: "+aDue);
        }
    }
}

public class billy1 {
    public static void main(String[] args) {

        Bill b1 = new Bill();
        System.out.println("Enter Account number: ");
        Scanner sc = new Scanner(System.in);
        int accNum = sc.nextInt();
        System.out.println("Account number is: "+accNum);

        System.out.println("---------------------------------------");
        System.out.println("'R' or 'r' for RESIDENTIAL connections"+"\n"+"'B' or 'b' for BUSINESS connections");
        System.out.println("---------------------------------------");

        System.out.println("Enter account type: ");
        char cusType = sc.next().charAt(0);

        if(cusType == 'R' || cusType == 'r'){
            System.out.println("Account type entered is RESIDENTIAL type.");

            System.out.println("Enter number of premium channels: ");
            int noOfPChan = sc.nextInt();
            System.out.println("Premium channels are: " + noOfPChan);
            b1.total();
        } else if( cusType == 'B' || cusType == 'b'){
            System.out.println("Account type entered is BUSINESS type.");
            System.out.println("Enter number of premium channels: ");
            int noOfPChan = sc.nextInt();
            System.out.println("Premium channels are: "+noOfPChan);

            System.out.println("Enter number of Basic Connections: ");
            int noOfBasiCon = sc.nextInt();
            System.out.println("Number of basic connections: "+noOfBasiCon);
            b1.total1();
        } else
            System.out.println("Error! Please check spelling again.");
    }
}
