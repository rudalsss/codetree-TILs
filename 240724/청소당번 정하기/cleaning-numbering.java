import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        
        int d = a/12;
        int c = a/3 -a/12;
        int b = a/2 -a/6 -a/12;

        System.out.print(b+" "+c+" "+d);
    }
}