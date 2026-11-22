public class oneToN {
    static void print1ToN(int n, int count){
        if(count>n)
            return ;
        System.out.println(count);

        print1ToN(n,count+1);
    }
    static void printNTo1(int n1, int count1){
        if(count1>n1)
            return ;
        print1ToN(n1,count1+1);
        System.out.println(count1);
    }

    public static void main(String[] args){
        print1ToN(5,1);
        printNTo1(4,1);
    }
}
