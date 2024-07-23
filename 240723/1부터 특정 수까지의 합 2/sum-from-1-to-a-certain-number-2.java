import java.util.Scanner;

public class Main {
    public static int add(int n){
        if(n==1) return 1;
        return add(n-1)+n;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum = 0;
        sum = add(a);
        System.out.println(sum);
    }
}