import java.sql.SQLOutput;

public class checkifagivenarrayissortedornot {
    public static void main(String[] args) {
        int  arr [] = {2,3,4,5,61,7};
        if(isSorted(arr,0)==true){
            System.out.println("array is sorted!");
        }
        else{
            System.out.println("array is not sorted!");
        }

    }
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>=arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);

    }
}
