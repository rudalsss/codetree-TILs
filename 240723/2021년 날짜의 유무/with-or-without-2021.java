import java.util.Scanner;

public class Main {
    public static boolean chk(int m, int d) {
        // 각 월의 일수를 배열에 저장
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        
        if (m < 1 || m > 12) {
            return false;
        }
        
        if (d < 1 || d > days[m - 1]) {
            return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();

        if (chk(m, d)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}