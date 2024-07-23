import java.util.Scanner;

public class Main {
    public static int cal(int a, int b){
        int c = 1;
        for(int i=0; i<b; i++){
            c *= a;
        }
        return c;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(cal(a,b));
    }
}