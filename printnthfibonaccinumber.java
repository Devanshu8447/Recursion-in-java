public class printnthfibonaccinumber {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(printfibo(n));
    }
    public static int printfibo(int n ){
        if(n==0 ||n==1){
            return n;
        }

        return printfibo(n-1) + printfibo(n-2);
    }
}

