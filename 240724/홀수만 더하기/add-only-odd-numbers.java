import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum = 0;

        for (int i=0; i<a; i++){
            int b = sc.nextInt();
            if(b%2!=0&&b%3==0) sum += b;
        }

        System.out.println(sum);
    }
}