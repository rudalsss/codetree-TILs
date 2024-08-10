import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] num = new int[n];
        for(int i=0; i<n; i++) num[i] = sc.nextInt();

        int cnt = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            if(i==0 || num[i]==num[i-1]){
                cnt++;
            }
            if(cnt>max) max = cnt;
        }

        System.out.println(max);
    }
}