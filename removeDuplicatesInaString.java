public class removeDuplicatesInaString {
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeduplicates(str,0,new StringBuilder(""),new boolean[26]);
    }
    public static void removeduplicates(String str, int idx , StringBuilder newstr ,boolean map[]){
        if(idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']==true){
            //duplicate
            removeduplicates(str,idx+1,newstr,map);

        }
        else{
            map[currChar - 'a']=true;
            removeduplicates(str,idx+1,newstr.append(currChar),map);

        }
    }
}
