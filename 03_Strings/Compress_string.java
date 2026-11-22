public class Compress_string {
    static String stringCompression(String s){
        StringBuilder sb = new StringBuilder();
        int idx =0;
        while(idx<s.length()){
            char currChar = s.charAt(idx);
            int count = 0;
            while(idx<s.length() && currChar == s.charAt(idx)){
                idx++;
                count++;
            }
            sb.append(currChar);
            if(count>0){
                String str = String.valueOf(count);
                for(char ch : str.toCharArray()){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s = "aabcccdddd";
        System.out.println(stringCompression(s));
    }
}
