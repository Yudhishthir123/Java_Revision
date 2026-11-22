public class LinearSearch {
    static int findTarget(int arr[],int i,int tar){
        if(i>=arr.length){
            return -1;
        }

        if(arr[i] == tar)
            return i;

        int ans = findTarget(arr,i+1,tar);
        return ans;
    }
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50};
        System.out.println(findTarget(arr,0,40));
    }
}
