
public class StringDemo {
    public static void main(String[] args) {

        // String pool inside heap memory
        String firstName = "jack";

        // Creates a new String object in heap memory
        String lastName = new String("b");

        // Concatenation
        System.out.println(firstName + " " + lastName);
        // charAt
        System.out.println(firstName.charAt(0));
        //comparison
        // 1 "=="
        String name1 = "yudi";
        String name2 = "yudi";
        if(name1 == name2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        //2 .equals()
        String n1 = "yudi";
        String n2 = "yudi";
        if(n1.equals(n2)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        //3 .equalesIgnoreCase()
        String a = "yudi";
        String b = "YUDI";
        if(a.equalsIgnoreCase(b)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
