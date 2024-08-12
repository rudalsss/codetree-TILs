import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int x=0, y=0;
        int[] dx = new int[]{ 0, 1, 0, -1 };
        int[] dy = new int[]{ 1, 0, -1, 0 };
        int dir = 0;

        String input = sc.next();
        for(int i=0; i<input.length(); i++){
            char order = input.charAt(i);
            if(order=='R') dir = (dir+1) % 4;
            if(order=='L') dir = (dir+3) % 4;
            if(order=='F'){
                x += dx[dir];
                y += dy[dir];
            }
        }

        System.out.println(x+" "+y);

    }
}