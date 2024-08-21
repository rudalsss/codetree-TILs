import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        
        // 모든합을 구하고 2개씩 임의적으로 제거하는 방식
        int totalSum = 0;
        for(int i=0; i<n; i++) totalSum += nums[i];
        
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int diff = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                sum = totalSum - nums[i] - nums[j];
                diff = Math.abs(s-sum);
                min = Math.min(min, diff);
            }
        }

        System.out.println(min);

        

    }
}