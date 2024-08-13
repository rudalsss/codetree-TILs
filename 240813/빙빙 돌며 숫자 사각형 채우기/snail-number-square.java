import java.util.Scanner;

public class Main {
    public static boolean inRange(int x, int y, int n, int m){
        return (x>=0 && x<n && y>=0 && y<m);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //행
        int m = sc.nextInt(); //열

        int[][] arr = new int[n][m];
        int[] dr = new int[]{ 0, 1, 0, -1 }; //우하좌상 순서(달팽이 모양)
        int[] dc = new int[]{ 1, 0, -1, 0 }; //우하좌상
        int dir = 0; 
        int r=0, c=0; //행렬인덱스
        arr[r][c] = 1;
        for(int i=2; i<=n*m; i++){
            //다음위치
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            // 행렬범위를 벗어나거나 이미 숫자가 존재한다면 방향변환(=90도 회전)
            if( !inRange(nr, nc, n, m) || arr[nr][nc] !=0 ) {
                dir = (dir+1)% 4;
                nr = r + dr[dir];
                nc = c + dc[dir];
            }

            //적절한 값으로 이동
            r = nr;
            c = nc;
            arr[r][c] = i;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}