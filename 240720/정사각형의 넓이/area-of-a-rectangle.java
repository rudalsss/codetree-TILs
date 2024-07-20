import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = x*x;

        System.out.println(n);
        if(n<5){
            System.out.println("tiny");
        }
    }
}