import java.util.HashMap;

public class Mode_of_array {
    static int modeArray(int arr[]){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int maxFreq = -1;
        int valMaxFreq = -1;
        for(int key: freq.keySet()){
            int currKey = key;
            int freqCurrKey = freq.get(key);
            if(freqCurrKey>maxFreq){
                maxFreq = freqCurrKey;
                valMaxFreq = currKey;
            }
        }
        return valMaxFreq;
    }
    public static void main(String[] args){
        int arr[] = {1,1,2,2,2,3,4,4,5,5,5,5,5};
        System.out.println(modeArray(arr));
    }
}
