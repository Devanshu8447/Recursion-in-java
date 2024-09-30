public class sumof1stnnaturalnumbers {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printsum(n));
        System.out.println(printtsum(n));
    }
    public static int printsum(int n){
        if (n==1){
            return n;
        }
        int sumnm1= printsum(n-1);
        int sumn = printsum(n-1)+n;
        return sumn;
    }
    //method 2
    public static int printtsum(int n ){
        if (n==1){
            return n;
        }
        return n+printtsum(n-1);
    }
}

