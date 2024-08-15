import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dr = new int[]{1, 0, -1, 0}; // 하, 좌, 상, 우
        int[] dc = new int[]{0, -1, 0, 1}; 

        //이차원 배열 채우기
        char[][] space = new char[n+2][n+2];
        String[] input = new String[n];
        for(int i=0; i<n; i++) input[i] = sc.next();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                space[i][j] = input[i-1].charAt(j-1);
            }
        }
        // for(int i=0; i<n+1; i++){
        //     for(int j=0; j<n+1; j++){
        //         System.out.print(space[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        int r = 0;
        int c = 0;
        int dir = 0;
        int k = sc.nextInt(); //처음 레이저 쏘는 위치
        //위치에 따른 방향 & 시작인덱스 설정
        if(k>=1 && k<=n) {
            dir = 0; //하
            r = 0;
            c = k;
        } else if(k>=n+1 && k<=2*n) {
            dir = 1; //좌
            r = k-n;
            c = n+1;
        } else if(k>=2*n+1 && k<=3*n) {
            dir = 2; //상
            r = n+1;
            c = (k-3*n)*-1;
        } else if(k>=3*n+1 && k<=4*n) {
            dir = 3;
            r = (k-4*n)*-1;
            c = 0;
        }

        /*
            /는 상<->우, 하<->좌
            \는 상<->좌, 하<->우
        */
        int cnt = 0;
        do {
            r = r + dr[dir];
            c = c + dc[dir];

            if(space[r][c]=='/' && (dir==0||dir==2)) dir = (dir+1)%4;
            else if(space[r][c]=='/' && (dir==1||dir==3)) dir = (dir+3)%4;
            else if(space[r][c]=='\\' && (dir==1||dir==3)) dir = (dir+1)%4;
            else if(space[r][c]=='\\' && (dir==0||dir==2)) dir = (dir+3)%4;
            cnt++;
        } while(r>=1 && r<=n && c>=1 && c<=n);

        System.out.println(cnt-1);
    }
}