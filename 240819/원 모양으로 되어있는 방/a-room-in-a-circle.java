import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        
        int min = Integer.MAX_VALUE;
        for(int start=0; start<n; start++ ){ //시작지점 0~n-1의 인덱스
            int sum = 0;
            for(int i=1; i<n; i++){ // n-1회의 이동, 이동횟수 = 이동거리
                int next = (start+i)%n; //시작지점에서 반시계방향의 다음 인덱스
                sum += i * nums[next]; //이동거리*인덱스에 위치해야하는 인원
            }
            //System.out.println(start+" "+sum);
            min = Math.min(min,sum);
        }
        System.out.println(min);
    }
}