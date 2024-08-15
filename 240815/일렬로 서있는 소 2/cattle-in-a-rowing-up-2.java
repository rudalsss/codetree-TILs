import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] cows = new int[n];
        for(int i=0; i<n; i++) cows[i] = sc.nextInt();

        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    int a = cows[i];
                    int b = cows[j];
                    int c = cows[k];

                    if(a<=b && b<=c) cnt++; 
                }
            }
        } 

        System.out.println(cnt);
    }
}