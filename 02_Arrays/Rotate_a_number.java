import java.util.Scanner;

public class Rotate_a_number {
    public static void main(String[] args){
        int n;
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String num = Integer.toString(n);
        int len = num.length();
        int rotate;
        System.out.println("Enter the value of rotation = ");
        rotate = sc.nextInt();
        int mod = rotate%len;
        if(mod< 0){
            mod += len;
        }
        String val = num.substring(mod) + num.substring(0,mod);
        int val1 = Integer.parseInt(val);
        System.out.println("value after rotation "+val1);
    }

}
