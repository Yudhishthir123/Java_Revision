import java.util.*;

public class subSequence {
    static void getSubSequence (String s, int index, StringBuilder output , List<String> ans){
        if(index>= s.length()){
            String subStr = output.toString();
            ans.add(subStr);
            return;
        }
        char ch = s.charAt(index);
        output.append(ch);
        getSubSequence(s,index+1,output,ans);

        output.deleteCharAt(output.length()-1);
        getSubSequence(s,index+1,output,ans);

    }
    public static void main(String[] args){
        String s = "abc";
        List<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        int index = 0;
        getSubSequence(s,index,output,ans);
        Collections.sort(ans);
        System.out.println(ans);
    }
}
