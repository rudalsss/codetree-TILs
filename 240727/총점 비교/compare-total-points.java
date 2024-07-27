import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        Student[] students = new Student[a];
        for(int i=0; i<a; i++){
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();

            students[i] = new Student(name, score1, score2, score3);
        }

        Arrays.sort(students);

        for(int i=0; i<a; i++){
            System.out.println(students[i]);
        }
    }
}

class Student implements Comparable<Student>{
    String name;
    int score1;
    int score2;
    int score3;

    public Student(String name, int score1, int score2, int score3){
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public String toString(){
        return name+" "+score1+" "+score2+" "+score3;
    }

    public int compareTo(Student other){
        return (score1+score2+score3) - (other.score1+other.score2+other.score3);
    }
}