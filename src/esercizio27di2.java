import java.util.*;

public class esercizio27di2 {
    public static void main(String[] args) {
        Student st1 = new Student("Manuel", 12);
        Student st2 = new Student("George", 23);
        Student st3 = new Student("Manson", 93);
        Student st4 = new Student("Giovani", 22);
        Student st5 = new Student("Pablo", 21);
        Student st6 = new Student("Mario", 97);
        Student st7 = new Student("Martin", 32);
        Student st8 = new Student("Lorena", 41);
        Student st9 = new Student("Avon", 42);
        Student st10 = new Student("Leviatan", 23);
        Student st11 = new Student("Geronimo", 12);
        Student st12 = new Student("GAGA", 18);

        List<Student> Estudiantes = new ArrayList<>(Arrays.asList(st1,st2,st3,st4,st5,st6,st7,st8,st9,st10,st11,st12));
        System.out.println(Estudiantes);

        Estudiantes.sort(Comparator.comparing(Student::getName));
        System.out.println(Estudiantes);

    }
}
