public class nthFibonacci {
    public static int fibonacci(int n){
        int a=0,b=1,c=0;
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            for(int i=2;i<=n;i++){
                c=a+b;
                a=b;
                b=c;
            }
            return c;
        }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("The "+n+"th Fibonacci number is: "+fibonacci(n));
    }
}