public class fibonacciSeries{
    public static void main(String[] args) {
        int num = 7;
        int a=0,b=1;
        System.out.print(a+" , "+b+" , ");
        int nextTerm;
        for(int i=2;i<=num;i++){
            nextTerm=a+b;
            a=b;
            b=nextTerm;
            if(i==num){
                System.out.print(nextTerm);
            }
            else{
                System.out.print(nextTerm+" , ");
            }
        }
    }
}