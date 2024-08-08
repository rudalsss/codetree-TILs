import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x[] = new int[n];
        int y[] = new int[n];
        for(int i=0; i<n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int[][] cord = new int[200][200];

        for(int i=0; i<n; i++){
            for(int j=x[i]; j<x[i]+8; j++){
                for(int k=y[i]; k<y[i]+8; k++){
                    cord[j][k] = 1;
                }
            }
        }

        int area = 0;
        for(int i=0; i<200; i++){
            for(int j=0; j<200; j++){
                if(cord[i][j]==1) area++;
            }
        }


        System.out.println(area);

    }
}