import java.util.*;
public class printxtothepowern {
    public static void main(String[] args) {
        int x = 2;
        int n = 15;
        System.out.println(printpower(x,n));
    }
    public static int printpower(int x,int n){
        if(n==0){
            return 1;
        }
        return x * printpower(x,n-1);
    }
}
