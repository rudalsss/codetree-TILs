import java.util.Scanner;

public class Main {
    public static int find(String str1, String str2){
        return str1.indexOf(str2);

    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(find(str1, str2));
    }
}