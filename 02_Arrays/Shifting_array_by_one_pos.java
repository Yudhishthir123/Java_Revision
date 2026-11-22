public class Shifting_array_by_one_pos {
    static void shftBy1(int arr[]){
        int n = arr.length;
        int temp  = arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
    public  static void main(String[] args){
        int arr[]= {1,2,3,4,5};
        shftBy1(arr);
        for(int val:arr){
            System.out.println(val);
        }
    }
}
