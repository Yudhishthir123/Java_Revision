public class Max_element_of_array {
    public static void main(String[] args){
        int arr[] = {5,6,12,9,11,45,51};
        int max = arr[0];
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max value of array = "+max);
    }
}
