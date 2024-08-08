import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];

        int[][] cord = new int[200][200];
        
        for(int i=0; i<n; i++){
            x1[i] = sc.nextInt() + 100;
            y1[i] = sc.nextInt() + 100;
            x2[i] = sc.nextInt() + 100;
            y2[i] = sc.nextInt() + 100;
        }

        // 빨간색 = 1, 파랑색 = 2
        for(int i=0; i<n; i++){
            for(int j=x1[i]; j<x2[i]; j++){
                for(int k=y1[i]; k<y2[i]; k++){
                    cord[j][k] = i%2+1;
                }
            }
        }

        int area = 0;
        for(int i=0; i<200; i++){
            for(int j=0; j<200; j++){
                if(cord[i][j]==2) area++;
            }
        }

        System.out.println(area);
    }
}