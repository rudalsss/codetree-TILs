import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char a2 = sc.next().charAt(0);
        int b = sc.nextInt();
        char b2 = sc.next().charAt(0);

        if((a2=='M'||b2=='M') && (a>=19||b>=19)){
            System.out.println(1);
        }
    }
}