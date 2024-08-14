import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String input = sc.next();

        int[][] space = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                space[i][j] = sc.nextInt();
            }
        }
        
        int r = n/2;
        int c = n/2;
        int[] dr = new int[]{-1, 0, 1, 0}; //상, 우, 좌
        int[] dc = new int[]{0, 1, 0, -1};
        int sum = space[r][c];
        int dir = 0;

        for(int i=0; i<t; i++){
            char direction = input.charAt(i);

            if(direction=='R') {
                dir = (dir+1)%4;
            } else if(direction=='L') {
                dir = (dir+3)%4;
            } else {
                int nr = r + dr[dir];
                int nc = c + dc[dir];
                if( nr<0 || nr>=n || nc<0 || nc>=n ) continue;
                r = nr;
                c = nc;
                sum += space[r][c];
            }
        }

        System.out.println(sum);

    }
}