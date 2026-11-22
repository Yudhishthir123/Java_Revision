public class countTarget {
    static void countOfTarget(int arr[], int i,int tar,int count){
        if(i>=arr.length){
            System.out.println(count);
            return;
        }
        if(arr[i] == tar){
            count++;
        }
        countOfTarget(arr,i+1,tar,count);
    }
    public static void main(String[] args){
        int arr[] = {1,2,1,3,5,9,1,8,1};
        int count  = 0;
        int target = 1;
        countOfTarget(arr,0,target,count);
    }
}
