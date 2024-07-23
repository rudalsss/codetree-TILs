import java.util.Scanner;

public class Main {
    public static int f1(int n){
        if(n<=0) return 0;
        if(n%2==0){
            return n+f1(n-2);
        } else {
            return f1(n-1);
        }
    }

    public static int f2(int n){
        if(n<=0) return 0;
        if(n%2!=0){
            return n+f2(n-2);
        } else {
            return f2(n-1);
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a%2==0){
            System.out.println(f1(a));
        } else {
            System.out.println(f2(a));
        }
    }
}