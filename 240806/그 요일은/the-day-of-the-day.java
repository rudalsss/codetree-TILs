import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dates = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        String date = sc.next();

        //연산대상 요일찾기
        int idx = 0;
        for (int i = 0; i < dates.length; i++) {
            if (dates[i] == date) {
                idx = i;
            }
        }

        int sumdays1 =0, sumdays2 = 0;

        for(int i=0; i<a; i++) sumdays1 += days[i];
        sumdays1 += (b+idx);

        for(int i=0; i<c; i++) sumdays2 += days[i];
        sumdays2 += d;

        int totaldays = sumdays2 - sumdays1 ;

        System.out.println(totaldays/7 + 1);
    }
}