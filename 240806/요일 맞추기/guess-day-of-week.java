import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dates = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int sumdays1 =0, sumdays2 = 0;

        for(int i=0; i<a; i++) sumdays1 += days[i];
        sumdays1 += b;

        for(int i=0; i<c; i++) sumdays2 += days[i];
        sumdays2 += d;

        int totaldays = sumdays2 - sumdays1 ;
        int result = totaldays<0 ? totaldays*-1 : totaldays;
        
        int idx = 0;
        while(result>7){
           idx = result % 7;
           result /= 7; 
        }

        if(totaldays==0){
            System.out.println(dates[0]);
        } else {
            String date = totaldays<0? dates[7-idx] : dates[idx];
            System.out.println(date);
        }



    }
}