public class Multiply_all_elements_of_an_array {
    public static void main(String[] args){
        int arr[] = {2,3,10,20};
        int mul = 1;
        for(int val : arr){
            mul *= val;
        }
        System.out.println("Product of all values in an array = "+mul);
    }
}
