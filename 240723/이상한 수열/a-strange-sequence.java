import java.util.Scanner;
public class Main {
    public static int f(int n){
        if(n==1) return 1;
        if(n==2) return 2;

        return f(n/3) + f(n-1);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));
    }
}