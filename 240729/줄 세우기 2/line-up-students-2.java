import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i=0; i<n; i++){
            int num = i+1;
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students[i] = new Student(num, height, weight);
        }

        Arrays.sort(students);

        for(int i=0; i<n; i++){
            System.out.println(students[i]);
        }
    }
}

class Student implements Comparable<Student>{
    int num;
    int height;
    int weight;

    public int compareTo(Student other){
        if(this.height != other.height){
            return this.height - other.height;
        } else {
            return other.weight - this.weight;
        }
    }

    public Student(int num, int height, int weight){
        this.num = num;
        this.weight = weight;
        this.height = height;
    }

    public String toString(){
        return height+" "+weight+" "+num;
    }
}