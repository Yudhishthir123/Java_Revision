import java.util.Scanner;

public class Array {
    public static void main(String[] ar){
        //decleration
        int arr[] = new int [5];
        //init
        int brr[] = {1,2,3};
        for (int val:brr){
            System.out.println(val);
        }

        // taking input in an array
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+" value of array ");
            arr[i] = sc.nextInt();
        }
        for(int val : arr){
            System.out.println(val);
        }
    }
}
