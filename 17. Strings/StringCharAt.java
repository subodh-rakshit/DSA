public class StringCharAt {

    public static void printLetters(String str){
        for(int i = 0; i < str.length() ; i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
  public static void main(String[] args) {
    String name = "Subodh Rakshit";
    System.out.println(name.charAt(0));
    printLetters(name);
  }  
}
