public class factorsOfNumberSqrt {
    public static void main(String[] args) {
        int num = 100;
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                if(i==(num/i)){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(i+" "+num/i+" ");
                }
            }
        }
    }
}
