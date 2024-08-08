import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1[] = new int[3];
        int[] x2 = new int[3];
        int[] y1 = new int[3];
        int[] y2 = new int[3];

        for(int i=0; i<3; i++){
            x1[i] = sc.nextInt()+1000;
            y1[i] = sc.nextInt()+1000;
            x2[i] = sc.nextInt()+1000;
            y2[i] = sc.nextInt()+1000;
        }

        int[][] cord = new int[2000][2000];   
        for(int i=0; i<3; i++){
            for(int j=x1[i]; j<x2[i]; j++){
                for(int k=y1[i]; k<y2[i]; k++){
                    cord[j][k] = i+1;
                }
            }
        }

        int area = 0;
        for(int i=0; i<2000; i++){
            for(int j=0; j<2000; j++){
                if( cord[i][j] == 1 || cord[i][j] == 2 ) area++;
            }
        }

        System.out.println(area);
    }
}