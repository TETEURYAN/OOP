import managment.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Teacher Matheus = new teacher(57, "Matheus", 5600);
        Teacher julia = new teacher(58, "Julia", 6000);
        Teacher ste = new teacher(59, "Stefany", 6000);

        List<Teacher> professor = new ArrayList<>();
        professor.add(Matheus);
        professor.add(julia);
        professor.add(ste);

        Student Joao = new students(1, "Joao", 9);
        Student Carlos = new students(2, "Carlos",9;
        Student Edson = new students(3,"Edson",9);

        List<Student> student = new ArrayList<>();
        student.add(Joao);
        student.add(Carlos);
        student.add(Edson);

        System.out.println(student);

    }
}