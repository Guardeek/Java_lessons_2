package lesson10.task1;

public class Demo {
    public static void main(String[] args) {
        Student anyStudent = new Student (); //Создать переменную типа Student, которая ссылается
        // на объект типа Aspirant.

        Aspirant aspirant = new Aspirant("One", "Two", "Three", "Four");
        Student student = new Student();
        System.out.println(aspirant);
        System.out.println(student);
        Student[] students = new Student[2];
        students[0] = aspirant;
        students[1] = student;
        for (Student student1 : students) {
            System.out.println(student1.getScholarship());
            System.out.println(student);
        }
        System.out.println(anyStudent.equals(student));

    }
}
