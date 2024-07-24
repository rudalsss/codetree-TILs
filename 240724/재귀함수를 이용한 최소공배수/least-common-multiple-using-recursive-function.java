import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }

    public static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }

    public static int nlcm(int[] arr, int n){
        if(n==1) return arr[0];
        return lcm(arr[n-1], nlcm(arr, n-1));
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = nlcm(arr, n);
        System.out.println(result);
    }
}