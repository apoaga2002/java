package loop;

public class PalinDromePractice {
    public static void main(String[] args) {

        String str = "civic";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0 ;i--){

            reverse += str.charAt(1);
        }
         if (reverse.equalsIgnoreCase(str)) {
             System.out.println("it is a palindrome string");
         }else {
             System.out.println("it is not a palindrome string");

         }
    }
}
