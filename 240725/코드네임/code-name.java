import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        

        A arr[] = new A[5];
        int score = 100;
        for(int i=0; i<5; i++){
            char a = sc.next().charAt(0);
            int b = sc.nextInt();
            arr[i] = new A(a,b);
            if(arr[i].score<score){
                score = arr[i].score;
                System.out.print(arr[i]);
            }
        }

    }
}


class A{
    private char codename;
    public int score;
    public A(char codename, int score){
        this.codename = codename;
        this.score = score;
    }
    public String toString(){
        return codename+" "+score;
    }
}