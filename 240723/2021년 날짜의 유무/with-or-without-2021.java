import java.util.Scanner;

public class Main {
    public static boolean chk(int a, int b){
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if( b<=days[a+1] ){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(chk(a,b)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}