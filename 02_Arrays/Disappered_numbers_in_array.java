import java.util.ArrayList;
import java.util.List;

class Disappeared_numbers_in_array {
    static List<Integer> disappearedNumber(int[] nums){
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int val = Math.abs(nums[i]);
            int pos = val-1;
            if(nums[pos]>0){
                nums[pos] = -nums[pos];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i] >0){
                int valAtIdx = i+1;
                ans.add(valAtIdx);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int arr[] = {2,1,3,5,1};
        System.out.println(disappearedNumber(arr));
    }
}
