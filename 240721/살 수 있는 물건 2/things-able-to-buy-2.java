import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        if(m>=3000){
            System.out.println("book");
        } else if (m>=1000){
            System.out.println("mask");
        } else if (m>=500){
            System.out.println("pen");
        } else {
            System.out.println("no");
        }
    }
}