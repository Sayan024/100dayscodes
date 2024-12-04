public class palindromeNumber{
    public static void main(String args[]){
        int n=123,rev=0,r,temp=n;
        while(temp!=0){
            r=temp%10;
            rev=rev*10+r;
            temp/=10;
        }
        // palindrome if num and reverse are equal
        if(n==rev){
            System.out.println("Palidrome");
        }
        else{
            System.out.println("Not a Palidrome");
        }
    }
}