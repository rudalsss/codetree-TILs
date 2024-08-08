import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char[] color = new char[200*n];
        char[] dir = new char[n];
        int[] size = new int[n];
        for(int i=0; i<n; i++){
            size[i] = sc.nextInt();
            dir[i] = sc.next().charAt(0);
        }

        int index = 100*n;
        for(int i=0; i<n; i++){
            if(dir[i]=='R'){
                for(int j=0; j<size[i]; j++){
                    color[index] = 'b';
                    index++;
                }
                index--;
            } else {
                for(int j=0; j<size[i]; j++){
                    color[index] = 'w';
                    index--;
                }
                index++;
            }
        }

        int blackCnt = 0;
        int whiteCnt = 0;
        for(int i=0; i<color.length; i++){
            if(color[i]=='b') blackCnt++;
            if(color[i]=='w') whiteCnt++;
        }

        System.out.println(whiteCnt+" "+blackCnt);
    }
}