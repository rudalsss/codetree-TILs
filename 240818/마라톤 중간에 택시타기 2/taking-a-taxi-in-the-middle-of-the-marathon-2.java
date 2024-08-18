import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for(int i=0; i<n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int j=1; j<n-1; j++){
            int nx[] = new int[n-1];
            int ny[] = new int[n-1];

            int idx = 0;
            for(int i=0; i<n; i++){
                if(i==j) continue;
                nx[idx++] = x[i];
            }
            //for(int i=0; i<n-1; i++) System.out.print(nx[i]+" ");
            //System.out.println();
            
            idx = 0;
            for(int i=0; i<n; i++){
                if(i==j) continue;
                ny[idx++] = y[i];
            }
            //for(int i=0; i<n-1; i++) System.out.print(ny[i]+" ");
            //System.out.println();

            sum = 0;
            for(int i=0; i<n-2; i++){
                sum += Math.abs( nx[i] - nx[i+1] ) + Math.abs( ny[i] - ny[i+1] );
            }
            //System.out.println(sum);
            if( sum < min ) min=sum;
        }
        System.out.println(min);
    }
}