import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int x = 0;
        int y = 0;
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        int dir = 0;
        int ans = -1;
        int time = 0;
        for(int i=0; i<input.length(); i++){
            char direction = input.charAt(i);
            if(direction=='F'){
                x += dx[dir];
                y += dy[dir];
            } else if(direction=='R'){
                dir = (dir+1)%4;
            } else { //direction=='L'
                dir = (dir+3)%4;
            }

            if( x==0 && y==0 ) ans = i+1;
        }
        System.out.println(ans);
    }
}