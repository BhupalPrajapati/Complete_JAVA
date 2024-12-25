package Lambda;

public class Student {
    int number;
    int marks;

    public Student(int i, int i1) {
        this.number = i;
        this.marks = i1;
    }

    public int getNumber() {
        return number;
    }

    public int getMarks() {
        return marks;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", marks=" + marks +
                '}';
    }
}


