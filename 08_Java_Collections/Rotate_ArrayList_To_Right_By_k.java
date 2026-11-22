import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rotate_ArrayList_To_Right_By_k {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int n;
        System.out.println("Enter the size of ArrayList");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            int temp;
            System.out.println("Enter the "+(i+1)+" value of ArrayList ");
            temp = sc.nextInt();
            arr.add(temp);
        }
        int k;
        System.out.println("Enter the value of k ");
        k  = sc.nextInt();
        if(n>0){
            k = k%n;
            if (k < 0) {
                k = k + n; // Converts negative rotation into equivalent right rotation
            }
            for(int i = 0;i<k;i++){
                int last = arr.remove(n-1);
                arr.add(0,last);
            }
        }
        System.out.println(arr);
        sc.close();
    }
}
