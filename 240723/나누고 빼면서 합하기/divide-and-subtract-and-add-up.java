import java.util.Scanner;

public class Main {

    public static int cal(int[] arr, int m) {
        int sum = 0;
        while (m >= 1) {
            sum += arr[m-1];
            if (m % 2 != 0) {
                m -= 1;
            } else {
                m /= 2;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(cal(arr, m));

    }
}