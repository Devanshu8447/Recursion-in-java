public class findfirstOccurence {
    public static void main(String[] args) {
        int arr[]= {8,3,6,9,10,2,5};
        int key = 5;
        System.out.println(firstOccurence(arr,key,0));

    }
    public static int firstOccurence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr,key,i+1);
    }
}
