public class primeNumber{
    
    public static void checkPrime(int n) {
        int c = 0;

        if(n<2){
            System.out.println("A prime number");
        }
        
            for(int i=2; i<=n;i++){
                if(n%i==0){
                    c+=1;
                }}
            if(c>2){
                System.out.println("Not prime");
            }
            else{
                System.out.println("Prime");
            }
    }
    public static void main(String[] args) {
        int n = 33;
        checkPrime(n);
    }
}