import java.time.LocalDate;

public class Group {
    private String lesson;
    public Group(){
    }
    public Group( String lesson){
        this.lesson=lesson;
    }
    public String getLesson() {
        return lesson;
    }
    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
    @Override
    public String toString() {
        return "Group{" +
                "lesson='" + lesson + '\'' +
                '}';
    }
}
