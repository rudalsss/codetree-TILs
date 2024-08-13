import java.util.Scanner;

public class Main {
    public static int getDir(char dir){
        if(dir=='W') return 3;
        else if(dir=='S') return 2;
        else if(dir=='N') return 0;
        else return 1;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = 0;
        int y = 0;

        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        int ans = -1;
        int time = 0;
        outerLoop:
        for(int i=0; i<n; i++){
            char direction = sc.next().charAt(0);
            int dis = sc.nextInt();
            int dir = getDir(direction);

            for(int j=0; j<dis; j++){
                time++;
                x += dx[dir];
                y += dy[dir];
                if(x==0 && y==0) {
                    ans = time;
                    break outerLoop;
                }
            }
        }

        System.out.println(ans);
    }
}