import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int mid;

        // a가 중앙값일 경우
        if ((a >= b && a <= c) || (a >= c && a <= b)) {
            mid = a;
        }
        // b가 중앙값일 경우
        else if ((b >= a && b <= c) || (b >= c && b <= a)) {
            mid = b;
        }
        // c가 중앙값일 경우
        else {
            mid = c;
        }

        // 중앙값을 출력합니다.
        System.out.println(mid);
    }
}