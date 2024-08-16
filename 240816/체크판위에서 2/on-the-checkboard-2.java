import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        //입력값 처리
        char[][] arr = new char[r][c];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) arr[i][j] = sc.next().charAt(0);
        }  

        //이동규칙 : 열크기 크게, 행크기 크게, 색값 다르게
        // int ans = 0;
        // int cnt = 0;
        // int nr = 0; //now row
        // int nc = 0; //now col
        // char color = arr[nr][nc];
        // for(int i=nr+1; i<r; i++){
        //     for(int j=nc+1; j<c; j++){
        //         if(arr[i][j] != color){ //점프가능조건 만족
        //             nr = i;
        //             nc = j;
        //             System.out.println(cnt+"번째 "+nr+" "+nc);
        //             color = arr[nr][nc];
        //             cnt++; //점프횟수
        //             if(cnt==3 && nr==r-1 && nc==c-1 ) {
        //                 ans++;
        //             }
        //         }
        //     }
        // }

        int ans = 0;
        //첫번째 점프
        for(int i=1; i<r; i++){
            for(int j=1; j<c; j++){
                if(arr[i][j] != arr[0][0]){ //첫번째 점프조건 만족
                    //System.out.println("First jump: " + i +" "+ j);
                    
                    for(int k=i+1; k<r; k++){
                        for(int l=j+1; l<c; l++){
                            if (arr[k][l] != arr[i][j]) { //두번째 점프조건 만족
                                //System.out.println("second jump: " + k +" "+ l);
                                
                                for(int m=k+1; m<r; m++){
                                    for(int n=l+1; n<c; n++){
                                        if(arr[m][n] != arr[k][l] && m==r-1 && n==c-1) ans++;
                                    }
                                }
                                
                            }
                        }
                    }
                }
            }
        }

        System.out.println(ans);


    }
}