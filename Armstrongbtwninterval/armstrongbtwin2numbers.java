import  java.util.Scanner;
public class armstrongbtwin2numbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range between number you want to see:");
        int l = sc.nextInt();
        int h = sc.nextInt();
        System.out.println("Numbers between "+l+" and "+h);
        for(int num=l;num<=h;num++){
            int s=0,d,temp;
            int len = getOrder(num);
            temp=num;
            while(temp!=0){
                d=temp%10;
                s=s+(int)Math.pow(d,len);
                temp/=10;
            }
            if(num==s){
                System.out.print(s+" ");
        }

    }
}
static int getOrder(int num){
    int l=0;
    while(num!=0){
        l++;
        num/=10;
    }
    return l;
}
}