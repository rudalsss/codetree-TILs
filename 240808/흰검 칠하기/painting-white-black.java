import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] black = new int[200*n];
        int[] white = new int[200*n];
        //int[] gray = new int[200*n];
        char[] color = new char[200*n];

        //명령
        int[] size = new int[n];
        char[] dir = new char[n];
        for(int i=0; i<n; i++){
            size[i] = sc.nextInt();
            dir[i] = sc.next().charAt(0);
        }

        int index = 100*n;
        for(int i=0; i<n; i++){
            if(dir[i]=='R'){
                for(int j=0; j<size[i]; j++){
                    if(color[index] !='g') {
                        color[index] = 'b';
                        black[index]++;
                    }
                    if(black[index]==2 && white[index]==2) color[index]='g';
                    index++;
                }
                index--; //마지막 위치조정
            } else {
                for(int j=0; j<size[i]; j++){
                    if(color[index]!='g'){
                        color[index] = 'w';
                        white[index]++;
                    }
                    if(black[index]==2 && white[index]==2) color[index]='g';
                    index--;
                }
                index++;
            }
            
        }

        int whiteCnt = 0;
        int blackCnt = 0;
        int grayCnt = 0;
        for(int i=0; i<color.length; i++){
            //System.out.print(color[i]); //bbbgwww, bbbbgww, bbbbgwww
            //System.out.print(black[i]); //1222211, 1222211, 12222110
            //System.out.print(white[i]); //1112211, 1111211, 01112211

            if(color[i]=='w'){
                whiteCnt++;
            } else if(color[i]=='b'){
                blackCnt++;
            } else if(color[i]=='g'){
                grayCnt++;
            }
        }

        System.out.println(whiteCnt+" "+blackCnt+" "+grayCnt);

        
    }
}