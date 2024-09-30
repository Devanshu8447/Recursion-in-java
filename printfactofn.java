public class printfactofn {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printfact(n));
    }
    public static int printfact(int n){
        if (n==1){
            return 1;
        }
        return n*printfact(n-1);
    }
    //one more function
    public static int factt(int n) {
        if (n==0){
            return 1;

        }
        int fnm1 = factt(n-1);
        int fn = n*factt(n-1);
        return fn;


    }

}


