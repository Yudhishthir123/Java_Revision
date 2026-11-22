import java.util.Collections;

public class House_Robber {
    static int Rob(int arr[],int idx){
        if(idx>=arr.length){
            return 0;
        }
        int includeAns = arr[idx] + Rob(arr,idx+2);
        int Exclude = 0 + Rob(arr,idx+1);
        int FinalAns = Math.max(includeAns,Exclude);
        return FinalAns;
    }
    public static void main(String[] args){
        int arr[] = {1,2,4,5};
        System.out.println(Rob(arr ,0));
    }
}
