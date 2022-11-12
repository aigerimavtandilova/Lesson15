import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Student student1=new Student("Nurgul","Zhumalieva","nurgul@gmal.com");
    Student student2=new Student("Aibek","Bektemirov","aibek@gmal.com");
    Student student3=new Student("Zirek","Aliyeva","zirek@gmal.com");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    LocalDate dateOfBirth=LocalDate.of(2000,11,25);
        System.out.println(dateOfBirth);
        String studentsNames[]=new String[]{student1.getName(), student2.getName(),student3.getName()};
        System.out.println(Arrays.toString(studentsNames));
    Group group1=new Group("Java");
    Group group2=new Group("JS");
    Group group3=new Group("Python");
        String groups[]=new String[]{group1.getLesson(),group2.getLesson(), student3.getName()};
        System.out.println(groups);
        System.out.println(LocalDate.now());
    Course course1=new Course("Java","Aizhamal",28545552);




    }
}