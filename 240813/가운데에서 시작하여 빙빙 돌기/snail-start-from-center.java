import java.util.Scanner;

public class Main {
    public static boolean inRange(int r, int c, int n){
        return (r>=0 && r<n && c>=0 && c<n);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int r = n/2;
        int c = n/2;

        int[] dr = new int[]{1, 0, -1, 0}; //하좌상우
        int[] dc = new int[]{0, 1, 0, -1};

        int[][] space = new int[n][n];
        int changeCnt = 0;
        int cnt = 0;
        space[r][c] = 1;
        int dir = 0;
        for(int i=2; i<=n*n; i++){
            if(i%2==1) changeCnt++;
            
            int nr = r + dr[dir];
            int nc = c + dc[dir];
            if( !inRange(nr, nc, n) || changeCnt == cnt ){
                dir = (dir+1)%4;
            }
            r += dr[dir];
            c += dc[dir];

            space[r][c] = i;
            cnt++;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(space[i][j]+" ");
            }
            System.out.println();
        }
    }
}