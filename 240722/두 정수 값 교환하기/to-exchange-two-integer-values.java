import java.util.Scanner;

public class Main {

    public static int[] swap(int m, int n) {
        int temp = n;
        n = m;
        m = temp;
        return new int[]{n, m};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] result = swap(a, b);

        // 올바르게 출력하도록 수정
        System.out.print(result[0] + " ");
        System.out.print(result[1]);
    }
}