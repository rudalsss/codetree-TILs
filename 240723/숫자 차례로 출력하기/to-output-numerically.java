import java.util.Scanner;

public class Main {
    public static void f1(int n){
        if(n==0) return;
        System.out.print(n+" ");
        f1(n-1);
    }

    public static void f2(int n){
        if(n==0) return;
        f2(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        f2(a);
        System.out.println();
        f1(a);
    }
}