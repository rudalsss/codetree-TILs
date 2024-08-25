import java.util.Scanner;

// [n][n]에 위치 = n+1행, n+1행에 위치

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int n = 19;
        int[][] board = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = sc.nextInt(); //검정돌1, 흰색돌2
            }
        }

        int x = 0; // 가운데 행번호
        int y = 0; // 가운데 열번호
        int win = 0; // 이긴 돌번호

        // 가로 : 행고정, 열1씩 증가
        for(int i=0; i<n; i++){
            for(int j=0; j<=n-5; j++){
                if( board[i][j] != 0 && board[i][j] == board[i][j+1] && 
                board[i][j+1] == board[i][j+2] && board[i][j+2] == board[i][j+3] && 
                board[i][j+3] == board[i][j+4] ){
                    win = board[i][j];
                    x = i;
                    y = j+2;
                }
            }
        }
        
        // 세로 : 열고정, 행1씩 증가
        for(int i=0; i<=n-5; i++){
            for(int j=0; j<n; j++){
                if( board[i][j] != 0 && board[i][j] == board[i+1][j] &&
                board[i+1][j] == board[i+2][j] && board[i+2][j] == board[i+3][j] &&
                board[i+3][j] == board[i+4][j] ){
                    win = board[i][j];
                    x = i+2;
                    y = j;
                }
            }
        }
        
        // 대각선(/) : 행1씩증가, 열1씩증가 & 행1씩감소, 열1씩감소(V)
        for(int i=4; i<n; i++){
            for(int j=4; j<n; j++){
                if( board[i][j] != 0 && board[i][j] == board[i-1][j-1] &&
                board[i-1][j-1] == board[i-2][j-2] && board[i-2][j-2] == board[i-3][j-3] &&
                board[i-3][j-3] == board[i-4][j-4] ){
                    win = board[i][j];
                    x = i-2;
                    y = j-2;
                }
            }
        }

        // 대각선(\) : 행1씩감소, 열1씩증가(V) & 행1씩증가, 열1씩감소
        for(int i=4; i<n; i++){
            for(int j=0; j<=n-5; j++){
                if( board[i][j] != 0 && board[i][j] == board[i-1][j+1] &&
                board[i-1][j+1] == board[i-2][j+2] && board[i-2][j+2] == board[i-3][j+3] &&
                board[i-3][j+3] == board[i-4][j+4] ){
                    win = board[i][j];
                    x = i-2;
                    y = j+2;
                }
            }
        }

        System.out.println(win);
        x++;
        y++;
        System.out.println(x+" "+y);
    }
}