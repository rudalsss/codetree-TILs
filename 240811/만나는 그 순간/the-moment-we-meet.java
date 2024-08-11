import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] dirA = new int[n];
        int[] sizeA = new int[n];
        int[] dirB = new int[m];
        int[] sizeB = new int[m];

        int size = 0;
        for(int i=0; i<n; i++){
            dirA[i] = sc.next().charAt(0);
            int num = sc.nextInt();
            size += num;
            sizeA[i] = num;
        }

        for(int i=0; i<m; i++){
            dirB[i] = sc.next().charAt(0);
            sizeB[i] = sc.nextInt();
        }

        int[] locationA = new int[size+1];
        int[] locationB = new int[size+1];

        //A의 움직임
        int location = 0;
        int index = 0;
        for(int i=0; i<n; i++){
            if(dirA[i]=='R'){
                for(int j=1; j<=sizeA[i]; j++){
                    location++;
                    locationA[index+j] = location;
                }
            } else {
                for(int j=1; j<=sizeA[i]; j++){
                    location--;
                    locationA[index+j] = location;
                }
            }
            index += sizeA[i];
        }

        //B의 움직임
        location = 0;
        index = 0;
        for(int i=0; i<m; i++){
            if(dirB[i]=='R'){
                for(int j=1; j<=sizeB[i]; j++){
                    location++;
                    locationB[index+j] = location;
                }
            } else {
                for(int j=1; j<=sizeB[i]; j++){
                    location--;
                    locationB[index+j] = location;
                }
            }
            index += sizeB[i];
        }

        int time = 0;
        for(int i=1; i<=size; i++){
            if(locationA[i]==locationB[i]){
                time = i;
                break;
            }
            time = -1;
        }
        System.out.println(time);
        
        // for(int i=0; i<=size; i++){
        //     System.out.print(locationA[i]);
        // }
        // System.out.println();
        // for(int i=0; i<=size; i++){
        //     System.out.print(locationB[i]);
        // }

    }
}