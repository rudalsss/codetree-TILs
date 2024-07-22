import java.util.Scanner;

public class Main {
    public static int[] func(int a, int b){
        if(a>b){
            a *=2;
            b += 10;
        } else {
            a += 10;
            b *=2;
        }
        return new int[] {a,b};
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] result = func(a,b);
        a = result[0];
        b = result[1];

        System.out.println(a+" "+b);
    }
}