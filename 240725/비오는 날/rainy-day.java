import java.util.Scanner;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        A[] arr = new A[n];
        for(int i=0; i<n; i++){
            LocalDate a = LocalDate.parse(sc.next());
            String b = sc.next();
            String c = sc.next();
            arr[i] = new A(a,b,c);
        }

        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            if(arr[i].weather.equals("Rain")){
                System.out.println(arr[i]);
                return;
            }
        }


    }
}

class A implements Comparable<A>{
    public LocalDate date;
    public String day;
    public String weather;

    public A(LocalDate a, String b, String c){
        this.date = a;
        this.day = b;
        this.weather = c;
    }

    public String toString(){
        return date+" "+day+" "+weather;
    }

    public int compareTo(A other){
        return this.date.compareTo(other.date);
    }   
}