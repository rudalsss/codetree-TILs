import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        x+=8;
        int y = sc.nextInt();
        y*=3;

        System.out.println(x);
        System.out.println(y);
        System.out.println(x*y);

    }
}