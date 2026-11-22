public class Recursive_Binary_search {
    static int solver(int arr[], int target,int s,int e){
        if(e<s){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]>target){
            e = mid-1;
        }else if(arr[mid]<target){
            s = mid+1;
        }
        return solver(arr,target,s,e);
    }
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50,60};
        int tar = 40;
        int n = arr.length -1;
        int ans = solver(arr,tar,0,n);
        System.out.println(ans);
    }
}
