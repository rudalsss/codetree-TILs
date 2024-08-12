import java.util.Scanner;

public class Main {
    public static boolean inRange(int x, int y, int n){
        return ( x>=0 && x<n && y>=0 && y<n );
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] space = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                space[i][j] = sc.nextInt();
            }
        }

        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        int cntNum = 0;
        for(int x=0; x<n; x++){
            for(int y=0; y<n; y++){
                int cnt = 0;
                for(int i=0; i<4; i++){ //상하좌우 4회
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if( inRange(nx,ny,n) && space[nx][ny]==1 ) cnt++;
                }
                if(cnt>=3) cntNum++;
            }
        }

        System.out.println(cntNum);

    }
}