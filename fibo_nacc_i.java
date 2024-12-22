import java.util.*;
class Fibot{
    public int fibot1(int x, int y, int fibo){
        int a = 0;
        if(x > y) {
            if (fibo == 1) {
                return y;
            } else if (fibo == 2) {
                return x;
            }
        } else if(y > x) {
        if (fibo == 1) {
            return x;
        } else if (fibo == 2) {
            return y;
            }
        }
        for(int i = 3; i <= fibo; i++){
            a = x + y;
            x = y;
            y = a;
        }
        return a;
    }
}
public class fibo_nacc_i {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter details: ");
        Fibot f1 = new Fibot();
        int a = sc.nextInt();
        int b =sc.nextInt();
        int fibo = sc.nextInt();
        //f1.fibot1(a,b,fibo);
        System.out.println(f1.fibot1(a,b,fibo));
    }
}
