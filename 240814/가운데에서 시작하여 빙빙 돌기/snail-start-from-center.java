import java.util.Scanner;

public class Main {
    public static boolean inRange(int r, int c, int n){
        return (r>=0 && r<n && c>=0 && c<n);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int r = n-1;
        int c = n-1;

        int[] dr = new int[]{0, -1, 0, 1}; //좌상우하
        int[] dc = new int[]{-1, 0, 1, 0};

        int[][] space = new int[n][n];
        int num = n*n;
        space[r][c] = num;
        int dir = 0;
        for(int i=1; i<n*n; i++){
            int nr = r + dr[dir];
            int nc = c + dc[dir];
            if( !inRange(nr, nc, n) || space[nr][nc]!=0 ){
                dir = (dir+1)%4;
                nr = r + dr[dir];
                nc = c + dc[dir];
            }
            r = nr;
            c = nc;

            space[r][c] = num-i;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(space[i][j]+" ");
            }
            System.out.println();
        }
    }
}