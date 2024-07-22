import java.util.Scanner;

public class Main {
    public static int cal(int[] arr, int a, int b){
        int sum = 0;
        for(int i=a; i<=b; i++){
            sum += arr[i-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(cal(arr,a,b));
        }


        
    }
}