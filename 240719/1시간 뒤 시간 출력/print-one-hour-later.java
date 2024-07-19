import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter(":"); // : 기준으로 잘라서 입력 받겠다는 뜻
        int a = sc.nextInt(); // : 기호가 나오기 전까지 입력 진행
        int b = sc.nextInt(); // : 기호가 나오기 전 or 입력의 마지막 부분까지 진행

        a+=1;
        System.out.println(a+":"+b);
    }
}