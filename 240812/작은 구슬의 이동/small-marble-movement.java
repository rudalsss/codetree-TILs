import java.util.Scanner;

public class Main {
    public static boolean inRange(int x, int y, int n){
        return (x>=0 && x<n && y>=0 && y<n);
    }
    public static int getDir(char dir){
        if(dir=='U') {
            return 0;
        } else if(dir=='R') {
            return 1;
        } else if(dir=='L') {
            return 2;
        } else {
            return 3;
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //n행n열의 격자
        int t = sc.nextInt(); //t초 이동

        int r = sc.nextInt()-1; //초기 구슬 행 인덱스
        int c = sc.nextInt()-1; //초기 구슬 열 인덱스
        char d = sc.next().charAt(0); //초기 구슬 이동방향

        int[][] space = new int[n][n];
        int[] dx = new int[]{ 0, 1, -1, 0 }; //상 우 좌 하 
        int[] dy = new int[]{ 1, 0, 0, 1 };
        
        int dir = getDir(d);
        for(int i=1; i<=t; i++){
            int nr = r + dy[dir];
            int nc = c + dx[dir];
            if(inRange(nr, nc, n)==false) {
                dir = 3 - dir;
                //i++; 
            } else {
                r = nr;
                c = nc;
            }
        }

        r++;
        c++;
        System.out.println(r+" "+c);
    }
}