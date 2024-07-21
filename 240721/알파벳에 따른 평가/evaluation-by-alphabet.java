import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char s = sc.next().charAt(0);

        if(s=='S'){
            System.out.println("Superior");
        } else if (s=='A'){
            System.out.println("Excellent");
        } else if (s=='B'){
            System.out.println("Good");
        } else if (s=='C'){
            System.out.println("Usually");
        } else if (s=='D'){
            System.out.println("Effort");
        } else {
            System.out.println("Failure");
        }



    }
}