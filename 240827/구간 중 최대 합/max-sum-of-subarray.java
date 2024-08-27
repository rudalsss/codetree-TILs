import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();

        int maxSum = 0;
        for(int i=0; i<n-k; i++){
            int sum = 0;
            for(int j=i; j<i+k; j++) sum +=nums[j] ;
            maxSum = Math.max(sum, maxSum);  
        }

        System.out.println(maxSum);
    }
}