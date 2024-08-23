import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] arr = new char[n][m];
        for(int i=0; i<n; i++){
            String str = sc.next();
            for(int j=0; j<m; j++) arr[i][j] = str.charAt(j);
        }

        //가로 : 행고정, 열이 1씩 변화하는 3개
        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m-2; j++){
                if( arr[i][j] == 'L' && arr[i][j+1] == 'E' && arr[i][j+2] == 'E' ) cnt++;
                if( arr[i][j] == 'E' && arr[i][j+1] == 'E' && arr[i][j+2] == 'L' ) cnt++;
            }
        }

        //세로 : 열고정, 행이 1씩 변화하는 3개
        for(int i=0; i<n-2; i++){
            for(int j=0; j<m; j++){
                if( arr[i][j] == 'L' && arr[i+1][j] == 'E' && arr[i+2][j] == 'E' ) cnt++;
                if( arr[i][j] == 'E' && arr[i+1][j] == 'E' && arr[i+2][j] == 'L' ) cnt++;
            }
        }  

        //대각선 : 행과 열이 1씩 감소하는 3개, 행과 열이 1씩 증가하는 3개,
        //      행은 1씩감소, 열은 1씩 증가하는 3개, 행은 1씩 증가 열은 1씩감소
        for(int i=0; i<n-2; i++){
            for(int j=0; j<m-2; j++){
                if( arr[i][j] == 'L' && arr[i+1][j+1] == 'E' && arr[i+2][j+2] == 'E' ) cnt++;
                if( arr[i][j] == 'E' && arr[i+1][j+1] == 'E' && arr[i+2][j+2] == 'L' ) cnt++;

                if( arr[i][j+2] == 'L' && arr[i+1][j+1] == 'E' && arr[i+2][j] == 'E' ) cnt++;
                if( arr[i][j+2] == 'E' && arr[i+1][j+1] == 'E' && arr[i+2][j] == 'L' ) cnt++;

            }
        } 


        System.out.println(cnt);

    }
}