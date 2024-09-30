public class friendspairingproblem {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(friendspairing(n));
    }
    public static int friendspairing(int n ){
        if(n==1|| n==2){
            return n;
        }
        return friendspairing(n-1) + (n-1*friendspairing(n-2));
    }
}
