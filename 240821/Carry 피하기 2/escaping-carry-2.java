import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();

        int ans = 0;
        int max = -1;
        //3가지 수를 조합
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                outerLoop:
                for(int k=j+1; k<n; k++){
                    int[] arr = new int[]{nums[i], nums[j], nums[k]};
                    Arrays.sort(arr);

                    while(arr[2]>0){
                        if( arr[0]%10 + arr[1]%10 + arr[2]%10 >= 10 ) {
                            //ans = -1;
                            continue outerLoop ;
                        }
                        arr[0] /= 10;
                        arr[1] /= 10;
                        arr[2] /= 10;
                    }

                    ans = nums[i] + nums[j] + nums[k];
                    max = Math.max(max, ans);
                }
            }
        }

        System.out.println(max);

    }
}