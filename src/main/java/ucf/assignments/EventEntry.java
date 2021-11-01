package ucf.assignments;

public class EventEntry {
    private String description;
    private String year;
    private String month;
    private String day;
    private int complete;

    public EventEntry(){
        this.description = description;
        this.year = year;
        this.month = month;
        this.day = day;
        this.complete = complete;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getComplete() {
        return complete;
    }

    public void setComplete(int complete) {
        this.complete = complete;
    }

    public String getDate(){
        return String.format("%s-%s-%s", getYear(), getMonth(), getDay());
    }
    //Will store description, due date, and
    //completion status
}
