import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum = 0;
        for(int i=a; i<=100; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}