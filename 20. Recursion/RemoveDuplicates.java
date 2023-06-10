public class RemoveDuplicates {

    public static void remove_duplicated(String str, int idx, StringBuilder newStr, boolean map[]){

        // Base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        // kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            // duplicate
            remove_duplicated(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            remove_duplicated(str, idx + 1, newStr.append(currChar), map);
        }
        
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        remove_duplicated(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
