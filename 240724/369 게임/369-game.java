import java.util.Scanner;

public class Main {
    public static boolean chk(int n){
        while(n>0){
            if( n%10 == 3 || n%10 == 6 || n%10 == 9 ){
                return true;
            }
            n /= 10;
            
        }
        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i=1; i<=a; i++){
            if( i%3==0 || chk(i)){
                System.out.print(0+" ");
            }else {
                System.out.print(i+" ");
            }
        }
    }
}