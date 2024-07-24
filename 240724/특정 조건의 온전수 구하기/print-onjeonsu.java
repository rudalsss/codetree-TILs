import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i=1; i<=a; i++){
            if( i%2!=0 && i%10!=5 && (i%3!=0||(i%3==0&&i%9==0)) ) System.out.print(i+" ");
        }
    }
}