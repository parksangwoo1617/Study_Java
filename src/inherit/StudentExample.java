package inherit;

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student("홍길동", "1235231", 1);
        System.out.println("name: " + student.name);
        System.out.println("ssn: " + student.ssn);
        System.out.println("studentNo: " + student.studentNo);
    }
}
