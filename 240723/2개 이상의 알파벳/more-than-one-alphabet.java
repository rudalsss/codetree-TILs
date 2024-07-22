import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static boolean check(String str) {
        Set<Character> characters = new HashSet<>();
        for (char c : str.toCharArray()) {
            characters.add(c);
        }
        return characters.size() >= 2;
    }


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        if(check(str)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}