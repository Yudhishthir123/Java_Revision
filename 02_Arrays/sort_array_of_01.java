public class sort_array_of_01 {
    static void sort(int arr[]){
        int n = arr.length;
        int i =0;
        int j = n-1;
        while (i<j){
            if(arr[i] == 1 && arr[j] == 0){
                arr[i] = 0;
                arr[j] = 1;
            }if(arr[i] == 0){
                i++;
            }if(arr[j] == 1){
                j--;
            }
        }
        for(int val:arr){
            System.out.print(val + " ");
        }
    }
    public static void main(String[] args){
        int arr[] = {1,0,0,1,0,1,1};
        sort(arr);
    }
}
