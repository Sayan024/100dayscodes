class SumofDigits{
    public static void sumOfDigits(int n){
        int r=n;
        int s=0;
        while(n!=0){
                s+=n%10;
                n/=10;
            }
            System.out.println("The Number is "+r+" and Sum of Digits is "+s);
    }
    public static void main(String[] args) {
        int a=3455;
        // int s=0;
        // while(a!=0){
        //     s+=a%10;
        //     a/=10;
        // }
        // System.out.println("Sum "+s);
        sumOfDigits(a);
    }
}