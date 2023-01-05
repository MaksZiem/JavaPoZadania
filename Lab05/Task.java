import java.time.LocalDate;
import java.util.Calendar;

public class Task {
    private String title, description;

    private String priority; //isHigh?

    public Task(String title, String priority) {
        this.title = title;

        this.priority = priority;
    }

    public Task(String title, String description,  String priority) {
        this.title = title;
        this.description = description;

        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }


    public String getPriority() {
        return priority;
    }
}
