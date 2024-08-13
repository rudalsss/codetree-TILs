import java.util.Scanner;

public class Main {
    public static boolean inRange(int r, int c, int n, int m){
        return (r>=0 && r<n && c>=0 && c<m);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] dr = new int[]{1, 0, -1, 0};
        int[] dc = new int[]{0, 1, 0, -1};

        int r = 0, c = 0; 
        int dir =0;
        int[][] space = new int[n][m];
        space[0][0] = 1;
        for(int i=2; i<=n*m; i++){
            int nr = r + dr[dir];
            int nc = c + dc[dir];
            if( !inRange(nr, nc, n, m) || space[nr][nc]!=0 ){
                dir = (dir+1)%4;
            }

            r += dr[dir];
            c += dc[dir];
            space[r][c] = i;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(space[i][j]+" ");
            }
            System.out.println();
        }
    }
}