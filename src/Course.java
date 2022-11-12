public class Course {
    private String coursesName, teachersName;
    private int number;
    public Course(){
    }
    public Course(String coursesName, String teachersName, int number) {
        this.coursesName = coursesName;
        this.teachersName = teachersName;
        this.number = number;
    }
    public String getCoursesName() {
        return coursesName;
    }

    public void setCoursesName(String coursesName) {
        this.coursesName = coursesName;
    }
    public String getTeachersName() {
        return teachersName;
    }
    public void setTeachersName(String teachersName) {
        this.teachersName = teachersName;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Course{" +
                "coursesName='" + coursesName + '\'' +
                ", teachersName='" + teachersName + '\'' +
                ", number=" + number +
                '}';
    }
}
