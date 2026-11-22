public class Min_value_inside_the_array {
    public static void main(String[] args){
        int arr[] = {5,6,12,9,11,45,51};
        int min = arr[0];
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min value inside the array = "+min);
    }
}
