public class Max_in_arr_by_recursion {
    static void maxEle(int arr[], int i,int maxi){
        if(i>=arr.length) {
            System.out.println(maxi);
            return;
        }
        if(arr[i] > maxi){
            maxi = arr[i];
        }
        maxEle(arr, i+1,maxi);
    }
    public static void main(String[] args){
        int arr[]= {10,20,30,4,0};
        int maxi = Integer.MIN_VALUE;
        maxEle(arr,0,maxi);
    }
}
