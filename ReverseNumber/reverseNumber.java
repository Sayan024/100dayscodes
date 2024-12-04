public class reverseNumber{
    public static void main(String[] args) {
        int n = 431, rev=0, r;
        while(n!=0){
            r=n%10;
            rev = rev*10 + r;
            n = n/10;
        }
        System.err.println("Reversed Number is "+rev);
    }
}