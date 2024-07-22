import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        if(a1>b1){
            System.out.println("A");
        } else if (a1<b1){
            System.out.println("B");
        } else {
            if(a2>b2){
            System.out.println("A");
            } else {
            System.out.println("B");

            }
        }

    }
}