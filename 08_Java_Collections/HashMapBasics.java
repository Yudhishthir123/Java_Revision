import java.util.*;
public class HashMapBasics {
    public static void main(String[] args){
        Map<String,String> mapping = new HashMap<>();
        //Insertion
        mapping.put("in","India");
        mapping.put("en","england");
        mapping.put("us","United States");
        System.out.println(mapping);
        HashMap<String,String> table = new HashMap<>();
        table.put("br","Brazil");
        System.out.println("Before :"+table);
        table.putAll(mapping);
        System.out.println("After :"+table);
        //Deletion
        table.remove("en");
        System.out.println(table);
        System.out.println(table.size());
        table.clear();
        System.out.println(table.size());
        //putIfAbsent()
        table.putIfAbsent("in","India3");
        System.out.println(table);
        table.putIfAbsent("id","India3");
        System.out.println(table);
        // getOrDefault()
        System.out.println(table.getOrDefault("us","NONE"));
        //replace
        table.replace("id","Indonesia");
        System.out.println(table);
        //keySet()
        Set<String> keyset =table.keySet();
        System.out.println(keyset);
        //values()
        Collection<String> value = table.values();
        System.out.println(value);
    }
}
