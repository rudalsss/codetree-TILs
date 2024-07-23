import java.util.Scanner;

public class Main {
    public static int f(int n){
        if(n<10) return n;
        return f(n/10) + n%10;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = a*b*c;
        System.out.println(f(d));
    }
}