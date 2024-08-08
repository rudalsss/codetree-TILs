import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] cord = new int[200][200];

        for(int i=0; i<n; i++){
            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;
            int y2 = sc.nextInt() + 100;
            for(int k=x1; k<x2; k++){
                for(int j=y1; j<y2; j++){
                    cord[k][j] = 1;
                }
            }
        }

        int sum = 0;
        for(int i=0; i<200; i++){
            for(int j=0; j<200; j++){
                if( cord[i][j]==1) sum++;  
            }
        }

        System.out.println(sum);

    }
}