import java.util.Scanner;

public class Main {
    public static int cal(int a){
        while(a>1){
            if(a%2 != 0){
                a -= 1;
            }else {
                a /= 2;
            }
        }
    };

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        cal(a);
        System.out.println(a);
    }
}