import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(a+" ");

        while(a<b){
            if(a%2==0){
                a+= 3;
            } else {
                a*=2;
            }
            if (a <= b) {
                System.out.print(a + " ");
            }
        }
    }
}