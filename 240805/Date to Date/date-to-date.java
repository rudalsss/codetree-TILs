import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int sum1 = 0;
        int sum2 = 0;

        for(int i=0; i<a;i++) sum1 += days[i];
        sum1 += b;

        for(int i=0; i<c; i++) sum2 += days[i];
        sum2 += d;

        System.out.println(sum2-sum1);

        

    }
}