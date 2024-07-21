import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(check(n));
    }

    public static String check(int n){
        if(n%2==0 && (n%10+n/10)%5==0 ){
            return "Yes";
        } else {
            return "No";
        }
    }
}