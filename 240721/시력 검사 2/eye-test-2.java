import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        if(n>1.0){
            System.out.println("High");
        } else if (n>0.5) {
            System.out.println("Middle");
        } else {
            System.out.println("Low");
        }

    }
}