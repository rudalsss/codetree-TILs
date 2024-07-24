import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }

    public static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }

    public static int nlcm(int n){
        if(n==1) return arr[1];
        return lcm(nlcm(lcm(n-1), arr[n]));
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = nlcm(n);
        System.out.println(result);
    }
}