import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        Student[] students = new Student[a];
        for(int i=0; i<a; i++){
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();

            students[i] = new Student(i+1, score1, score2);
        }

        Arrays.sort(students);

        for(int i=0; i<a; i++){
            System.out.println(students[i]);
        }
    }
}

class Student implements Comparable<Student>{
    int num;
    int h;
    int w;

    public Student(int num, int h, int w){
        this.num = num;
        this.h = h;
        this.w = w;
    }

    public String toString(){
        return h+" "+w+" "+num;
    }

    public int compareTo(Student other){
        if(this.h != other.h){
            return other.h-this.h;
        } else if (this.w != this.w){
            return other.w-this.w;
        } else {
            return other.num - this.num;
        }
    }
}