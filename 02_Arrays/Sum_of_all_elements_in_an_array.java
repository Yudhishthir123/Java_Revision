public class Sum_of_all_elements_in_an_array {
    public static void main(String[] argc){
        int arr[] = {10,20,30,40,50,60};
        int sum = 0;
        for(int val : arr){
            sum += val;
        }
        System.out.println("Sum of all values in array = "+sum);

    }
}
