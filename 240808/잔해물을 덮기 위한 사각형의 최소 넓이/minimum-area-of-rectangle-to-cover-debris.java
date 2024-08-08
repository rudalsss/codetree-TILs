import java.util.Scanner;

public class Main {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        int[] x1 = new int[2];
        int[] x2 = new int[2];
        int[] y1 = new int[2];
        int[] y2 = new int[2];

        int[][] cord = new int[2000][2000];
        for(int i=0; i<2; i++){
            x1[i] = sc.nextInt() + 1000;
            y1[i] = sc.nextInt() + 1000;
            x2[i] = sc.nextInt() + 1000;
            y2[i] = sc.nextInt() + 1000;
        }

        // 첫번째(1), 두번째(2), 겹치는 부분(3) 
        for(int i=0; i<2; i++){
            for(int j=x1[i]; j<x2[i]; j++){
                for(int k=y1[i]; k<y2[i]; k++){
                    cord[j][k] += (i+1);
                }
            }
        }

        //사각형 양끝단의 상태색
        int[] color = new int[4];
        color[0] = cord[x1[0]][y1[0]];     //min
        color[1] = cord[x1[0]][y2[0]-1];
        color[2] = cord[x2[0]-1][y2[0]-1]; //max
        color[3] = cord[x2[0]-1][y1[0]];

        int cnt = 0; // 가려진 모서리수 = 3의 값을 가지는 영역
        for(int i=0; i<4; i++){
            //System.out.println(color[i]);
            if(color[i]==3) cnt++;
        } 

        //한점만 가린경우, 겹치지 않는경우 -> 원래 직사각형
        if(cnt==1 || cnt==0){
            for(int i=x1[0]; i<x2[0]; i++){
                for(int j=y1[0]; j<y2[0]; j++){
                    cord[i][j] = 4;
                }
            }
        }

        //두점을 가린경우 -> 새로만들어진 작은 사각형
        if(cnt==2){
            int minx = 1999;
            int miny = 1999;
            int maxx = 0;
            int maxy = 0;
            
            for(int i=0; i<2000; i++){
                for(int j=0; j<2000; j++){
                    if( cord[i][j]==1 && i<=minx ) minx=i;
                    if( cord[i][j]==1 && j<=miny ) miny=j;
                    if( cord[i][j]==1 && i>=maxx ) maxx=i;
                    if( cord[i][j]==1 && j>=maxy ) maxy=j;                
                }
            }
            
            for(int i=minx; i<maxx; i++){
                for(int j=miny; j<maxy; j++){
                    cord[i][j] = 4;
                }
            }
        }

        
        int area = 0;
        for(int i=0; i<2000; i++){
            for(int j=0; j<2000; j++){
                if(cord[i][j]==4) area++;
            }
        }

        System.out.println(area);
    }
}