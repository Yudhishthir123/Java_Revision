import java.util.*;
public class ArrayListexample {
    public static void main(String[] args){
        List<Integer> arr= new ArrayList<>();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of ArrayList");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            int temp;
            System.out.println("Enter the "+(i+1)+" value of ArrayList ");
            temp = sc.nextInt();
            arr.add(temp);
        }
        System.out.println(arr);
        // remove the value
        arr.remove(0);
        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        arr.addAll(list2);
        System.out.println(arr);
        arr.removeAll(list2);
        System.out.println(arr);
        System.out.println(arr.size());
        arr.clear();

    }
}
