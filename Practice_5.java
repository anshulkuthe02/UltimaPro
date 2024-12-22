import java.io.*;
import java.util.*;
public class Practice_5  {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String firstName = sc.next();
        String lastName = sc.next();
        double []marks = new double[5];
        double avg = 0;
        for(int i =0; i < marks.length; i++){
            marks[i] = sc.nextDouble();
        }
        File f1 = new File("test1.txt");
        try{
            f1.createNewFile();
            System.out.println("File created.");
        } catch(IOException e){
            e.printStackTrace();
        }
        try(PrintWriter f13 = new PrintWriter(new FileWriter("test1.txt"))){
            f13.println(""+firstName+" "+lastName);
            for(int i = 0; i < marks.length; i++){
                f13.println(" " + marks[i]);
            }
        } finally{
            System.out.println("This is free now.");
        }
       File outFile =  new File("testavg.out");
        try(PrintWriter f13 = new PrintWriter("testavg.out")){
            f13.println(" "+firstName+" "+lastName);
            for(int i = 0; i < marks.length; i++){
                avg += marks[i];
            }
            f13.println("The avg is: " + avg);
            
        } catch(FileNotFoundException e){
            System.out.println("Sorry for error!");
        }
    }
}