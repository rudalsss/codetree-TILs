import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Point[] points = new Point[n];
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            points[i] = new Point(a,b,i+1);
        }

        Arrays.sort(points);

        for(int i=0; i<n; i++)
           System.out.println(points[i].num);

    }
}

class Point implements Comparable<Point>{
    int x;
    int y;
    int num;

    public Point(int x, int y, int num){
        this.x = x;
        this.y = y;
        this.num = num;
    }

    public String toString(){
        return x+" "+y;
    }

    public int compareTo(Point other){
        int x1 = this.x - 0;
        int y1 = this.y - 0;
        if(x1<0) x1 *= -1;
        if(y1<0) y1 *= -1;

        int x2 = ((other.x-0)<0?(other.x)*-1:other.x-0);
        int y2 = ((other.y-0)<0?(other.y)*-1:other.y-0);

        return (x1+y1) - ( x2+y2 );
    }
}