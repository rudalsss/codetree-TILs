import java.util.Scanner;

public class Main {
    public static boolean inRange(int r, int c, int n){
        return (r>=0 && r<n && c>=0 && c<n);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] dr = new int[]{0, 1, 0, -1};
        int[] dc = new int[]{1, 0, -1, 0};

        int[][] space = new int[n][n];
        for(int i=0; i<m; i++){
            int r = sc.nextInt()-1;
            int c = sc.nextInt()-1;
            space[r][c] = 1;
            int cnt = 0;
            for(int j=0; j<4; j++){
                int nr = r + dr[j];
                int nc = c + dc[j];
                if(inRange(nr, nc, n) && space[nr][nc]==1) cnt++;
            }
            if(cnt==3) System.out.println(1);
            else System.out.println(0);
        }


    }
}