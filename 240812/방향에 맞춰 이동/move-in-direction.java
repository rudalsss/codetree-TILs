import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char[] dir = new char[n];
        int[] dis = new int[n];
        for(int i=0; i<n; i++) {
            dir[i] = sc.next().charAt(0);
            dis[i] = sc.nextInt();
        }

        int[] dx = new int[]{1, -1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};
        int x=0, y=0;

        for(int i=0; i<n; i++){
            for(int j=0; j<dis[i]; j++){
                if(dir[i]=='E') {
                    x += dx[0];
                    y += dy[0];
                } 
                if(dir[i]=='W'){
                    x += dx[1];
                    y += dy[1];
                }
                if(dir[i]=='S'){
                    x += dx[2];
                    y += dy[2];
                }
                if(dir[i]=='N'){
                    x += dx[3];
                    y += dy[3];
                }
            }
        }

        System.out.println(x+" "+y);

    }
}