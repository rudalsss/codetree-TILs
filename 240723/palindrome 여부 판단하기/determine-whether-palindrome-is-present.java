import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String str){
        String reversed = new StringBuilder(str).reverse().toString();
        if(str.equals(reversed)){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        if(isPalindrome(str)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}