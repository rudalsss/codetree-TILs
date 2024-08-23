import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) arr[i][j] = sc.nextInt();
        }

        int sum1 = 0; //첫번째 격자의 합
        int sum2 = 0; //두번째 격자의 합
        int x = 0;  //첫번째 격자x
        int y = 0;  //첫번째 격자y
        int max1 = Integer.MIN_VALUE; //첫번째 격자의 최대값
        int max2 = Integer.MIN_VALUE; //두번째 격자의 최대값

        //첫번째 격자 탐색 : 가장 큰 값으로 탐색
        for(int i=0; i<n; i++){
            for(int j=0; j<=n-3; j++){
                sum1 = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                max1 = Math.max( max1, sum1 );
               
                //최대값이 되는 좌표 저장
                if( max1 == sum1 ){                    
                    x = i;
                    y = j;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<=n-3; j++){
                if( i==x && (j>y-2 && j<y+2) ) continue; //겹치는 경우
                sum2 = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                int hap = sum1+sum2;
                max2 = Math.max(max2, hap);
            }
        }

        //System.out.println(max1+" "+max2);
        System.out.println(max1+max2);
    }
}