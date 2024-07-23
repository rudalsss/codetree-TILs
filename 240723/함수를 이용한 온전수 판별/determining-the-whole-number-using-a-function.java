import java.util.Scanner;

public class Main {
    public static boolean chk(int n){
        if( n%2!=0 && n%10!=5 ){
            if( n%3!=0 || ( n%3==0 && n%9!=0 ) ){
                return true;
            }
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for(int i =a; i<=b; i++){
            if(chk(i)) cnt++;
        }

        System.out.println(cnt);
    }

}