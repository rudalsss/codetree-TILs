import java.util.Scanner;

public class Main {
    public static int f1(int n){
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum+=i;
        }
        return sum/10;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int tot = f1(n);
        System.out.println(tot);
    }
}