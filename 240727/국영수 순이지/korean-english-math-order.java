import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Student[] students = new Student[a];
        for(int i=0; i<a; i++){
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            students[i] = new Student(name, kor, eng, math);
        }

        while(a>0){
            for(int i=0; i<a-1; i++){
                if(students[i].getKor() < students[i+1].getKor()){
                    Student temp = students[i];
                    students[i] = students[i+1];
                    students[i+1] = temp;
                } else if (students[i].getKor() == students[i+1].getKor()){
                    if(students[i].getEng() < students[i+1].getEng()){
                        Student temp = students[i];
                        students[i] = students[i+1];
                        students[i+1] = temp;
                    } else if (students[i].getEng()==students[i+1].getEng()){
                        if(students[i].getMath() < students[i+1].getMath()){
                            Student temp = students[i];
                            students[i] = students[i+1];
                            students[i+1] = temp;
                        }
                    }
                }
            }
            a--;
        }



        for(int i=0; i<students.length; i++){
            System.out.println(students[i]);
        }
    }
}

class Student{
    private String name;
    private int kor;
    private int eng;
    private int math;

    public int getKor(){ return kor; }
    public int getEng(){ return eng; }
    public int getMath(){ return math; }

    public Student(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }

    public String toString(){
        return name+" "+kor+" "+eng+" "+math;
    }
}