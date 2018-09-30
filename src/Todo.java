import java.text.SimpleDateFormat;
import java.util.Date;

public class Todo {
    private String title = "";
    private String description = "";
    private boolean done = false;
    private Date due;

    public Todo() {
    }

    public Todo(String title, String description, Date due) {
        this.title = title;
        this.description = description;
        this.due = due;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Date getDue() {
        return due;
    }

    public void setDue(String dateString) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = simpleDateFormat.parse(dateString);
            this.due = date;
        } catch (Exception e) {
            System.err.println("Chịu");
        }
    }

    @Override
    public String toString() {
        System.out.printf("Title: %s\nDescription: %s\nTime: %s\n", title, description, due);
        return null;
    }
}
