import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 기준점 : 2011년 11월 0일 0시 

        int totalMin1 = a*24*60 + b*60 + c;
        int totalMin2 = 11*24*60 + 11*60 + 11;

        int result = totalMin1-totalMin2;

        System.out.println( result>=0? result : -1 );
    }
}