import java.util.Scanner;

public class Main {
    public static int f(int n, int cnt){
        if(n==1) return cnt;
        
        cnt++;
        if(n%2==0){
            return f(n/2, cnt);
        } else {
            return f(n/3, cnt);
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int cnt = 0;
        System.out.println(f(a, cnt));



    }
}