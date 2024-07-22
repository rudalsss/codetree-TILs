import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int mid = a;

        if((b<=mid&&c<=b)||(b>=mid&&b<=c)) mid = b;
        if((c<=mid&&a<=c)||(c>=mid&&c<=a)) mid = c;

        System.out.println(mid);
    }
}