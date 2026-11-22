public class Digits_0f_A_Number {
    static  void printDigit(int num){
        if(num == 0)
            return;
        int digit = num%10;
        num = num/10;
        printDigit(num);
        System.out.println(digit);
    }
    public static void main(String[] args){
        printDigit(143);
    }
}
