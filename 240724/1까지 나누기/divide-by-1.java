import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int cnt = 1;

        while(true){
            cnt++;
            a /= cnt;
            
            if(a<=1) break;
        }
        System.out.println(cnt);
    }
}