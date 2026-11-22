import java.util.Scanner;

public class Power0fNumber {
    static int pow(int val,int x){
        if(x == 0){
            return 1;
        }
        return val*pow(val,x-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int val,x;
        System.out.print("\n Enter the value = ");
        val = sc.nextInt();
        System.out.print("\n Enter the power = ");
        x = sc.nextInt();
        int out = pow(val,x);
        System.out.print("\n Answer = "+out);
    }
}
