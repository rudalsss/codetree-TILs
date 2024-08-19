import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<n; i++) nums[i] = sc.nextInt();

        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i+2; j<n; j++){
                int sum = nums[i] + nums[j];
                max = Math.max(sum, max);
            }
        }
        System.out.println(max);
    }
}