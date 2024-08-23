// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         // 여기에 코드를 작성해주세요.
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int[][] arr = new int[n][n];
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++) arr[i][j] = sc.nextInt();
//         }

//         int sum1 = 0; //첫번째 격자의 합
//         int sum2 = 0; //두번째 격자의 합
//         int x = 0;  //첫번째 격자x
//         int y = 0;  //첫번째 격자y
//         int max1 = Integer.MIN_VALUE; //첫번째 격자의 최대값
//         int max2 = Integer.MIN_VALUE; //두번째 격자의 최대값

//         //첫번째 격자 탐색 : 가장 큰 값으로 탐색
//         for(int i=0; i<n; i++){
//             for(int j=0; j<=n-3; j++){
//                 sum1 = arr[i][j] + arr[i][j+1] + arr[i][j+2];
//                 max1 = Math.max( max1, sum1 );
               
//                 //최대값이 되는 좌표 저장
//                 if( max1 == sum1 ){                    
//                     x = i;
//                     y = j;
//                 }
//             }
//         }

//         for(int i=0; i<n; i++){
//             for(int j=0; j<=n-3; j++){
//                 if( i==x && (j>=y-2 || j<=y+2) ) continue; //겹치는 경우
//                 sum2 = arr[i][j] + arr[i][j+1] + arr[i][j+2];
//                 int hap = sum1+sum2;
//                 max2 = Math.max(max2, hap);
//             }
//         }

//         //System.out.println(max1+" "+max2);
//         System.out.println(max1+max2);
//     }
// }

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxSum = 0;

        // 첫 번째 1*3 격자 선택
        for (int i1 = 0; i1 < n; i1++) {
            for (int j1 = 0; j1 <= n - 3; j1++) {
                int sum1 = arr[i1][j1] + arr[i1][j1 + 1] + arr[i1][j1 + 2];

                // 두 번째 1*3 격자 선택 (겹치지 않도록)
                for (int i2 = 0; i2 < n; i2++) {
                    for (int j2 = 0; j2 <= n - 3; j2++) {
                        // 두 격자가 겹치는지 확인
                        if (i1 == i2 && !(j2 + 2 < j1 || j2 > j1 + 2)) {
                            continue; // 두 격자가 겹치는 경우
                        }

                        int sum2 = arr[i2][j2] + arr[i2][j2 + 1] + arr[i2][j2 + 2];
                        maxSum = Math.max(maxSum, sum1 + sum2);
                    }
                }
            }
        }

        System.out.println(maxSum);
    }
}