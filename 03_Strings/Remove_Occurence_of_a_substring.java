public class Remove_Occurence_of_a_substring {
    static String removeOccur(String s,String part){
        while(s.contains(part)){
            int index = s.indexOf(part);
            s = s.substring(0,index) + s.substring(index+part.length());
        }
        return s;
    }
}
