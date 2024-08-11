import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //a의 움직임
        int m = sc.nextInt(); //b의 움직임

        int[] timeA = new int[n];
        char[] distA = new char[n];
        int[] timeB = new int[m];
        char[] distB = new char[m];

        int timesizeA = 0;
        for(int i=0; i<n; i++) {
            int time = sc.nextInt();
            timesizeA += time;
            timeA[i] = time;
            distA[i] = sc.next().charAt(0);
        }

        int timesizeB = 0;
        for(int i=0; i<m; i++) {
            int time = sc.nextInt();
            timesizeB += time;
            timeB[i] = time;
            distB[i] = sc.next().charAt(0);
        }

        int size = Math.max(timesizeA, timesizeB);
        int[] locationA = new int[size+1];
        int[] locationB = new int[size+1];

        int location = 0;
        int idx = 0;
        for(int i=0; i<n; i++){
            if(distA[i]=='R'){
                for(int j=1; j<=timeA[i]; j++){
                    location++;
                    locationA[idx+j] = location;
                }
            } else {
                for(int j=1; j<=timeA[i]; j++){
                    location--;
                    locationA[idx+j] = location;
                    //locationA[idx++] = location;
                }
            }
            idx += timeA[i];
        }

        location = 0;
        idx = 0;
        for(int i=0; i<m; i++){
            if(distB[i]=='R'){
                for(int j=1; j<=timeB[i]; j++){
                    location++;
                    locationB[idx+j] = location;
                }
            } else {
                for(int j=1; j<=timeB[i]; j++){
                    location--;
                    locationB[idx+j] = location;
                }
            }
            idx += timeB[i];
        }

        //마지막 숫자로 채우기
        int min = Math.min(timesizeA, timesizeB);
        if(timesizeA < timesizeB){
            for(int i=min+1; i<=size; i++){
                int last = locationA[min];
                locationA[i] = last;
            }
        } 
        if(timesizeA > timesizeB){
            for(int i=min+1; i<=size; i++){
                int last = locationB[min];
                locationB[i] = last;
            }
        }
        // for(int i=0; i<=size; i++) System.out.print(locationA[i]+" ");
        // System.out.println();
        // for(int i=0; i<=size; i++) System.out.print(locationB[i]+" ");
        // System.out.println();
        
        int cnt = 0;
        int index = 1;
        while(index <= size){
            if( locationA[index]==locationB[index] && locationA[index-1]!=locationB[index-1] ) {
                cnt++;
            }
            index++;
        }

        System.out.println(cnt);

    }
}