import java.util.Scanner;

public class Main {
    public static int f(int n){
        if(n==1) return 2;
        if(n==2) return 4;

        return f(n-1)*f(n-2)%100;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(f(a));
    }
}