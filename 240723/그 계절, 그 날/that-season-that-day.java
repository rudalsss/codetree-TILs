import java.util.Scanner;

public class Main {
    public static void chk( int a, int b, int c ){
        int[] arr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if( ( a%4==0 && a%100!=0 ) || ( a%4==0 && a%100==0 && a%400==0 ) ){
            arr[1] = 29;
        }

        if( (b>=1 && b<=12) && (c>=1 && c<=arr[b-1]) ){
            if(b>=3&&b<=5){
                System.out.println("Spring");
            } else if (b>=6 && b<=8){
                System.out.println("Summer");
            } else if(b>=9 && b<=11){
                System.out.println("Fall");
            } else {
                System.out.println("Winter");
            }

        } else {
            System.out.println(-1);
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();//년
        int b = sc.nextInt();//월
        int c = sc.nextInt();//일

        chk(a,b,c);


    }
}