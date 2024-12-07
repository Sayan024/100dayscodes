public class factorialOfNumber{

    static int factorialof(int num){
        int res=1;
        for(int i=2;i<=num;i++){
            res*=i;
        }
        return res;
    }
    public static void main(String args[]){
        int num=5;
        int fac=factorialof(num);
        System.out.println("The factorial of "+num+" is "+fac);
    }
}