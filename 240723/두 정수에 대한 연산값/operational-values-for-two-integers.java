import java.util.Scanner;

public class Main {
    public static int[] func(int a, int b){
        if(a>b){
            a += 25;
            b *= 2;
        } else {
            b += 25;
            a *= 2;
        }

        return new int[] {a,b};
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] result = func(a,b);
        System.out.println(result[0]+" "+result[1]);
    }
}