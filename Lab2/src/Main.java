
public class Main {
    public static void main(String[] args) {
    Palindrome palindrome = new Palindrome();

    String string = "RADar";

    Boolean isPalindrome = palindrome.isPalindrome(string);

    if(isPalindrome){
        System.out.println("String " + string + " is palindrome");
    } else {
        System.out.println("String " + string + " is not palindrome");
    }
    }
}