public class tilingproblem {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tilingProblem(n));
    }
    public static int tilingProblem(int n){
        //base case
        if(n==0|| n==1){
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1 = tilingProblem(n-1);

        //horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totways = fnm1+fnm2;
        return totways;
    }
}
