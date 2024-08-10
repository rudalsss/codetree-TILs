import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] num = new int[n];
        for(int i=0; i<n; i++) num[i] = sc.nextInt();

        int cnt = 1;
        int max = 0;
        for(int i=0; i<n-1; i++){
            if(num[i]>t && num[i+1]>t){
                cnt++;
            } else {
                cnt = 1;
            }
            max = Math.max(cnt, max);
        }

        System.out.println(max);
    }
}