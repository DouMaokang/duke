public class Event extends Task {

    private String time;

    public Event(String description, String time) {
        super(description);
        this.time = time;
    }

    public Event(String description, String time, boolean isDone) {
        super(description, isDone);
        this.time = time;
    }

    @Override
    public String toString() {
        if (this.getStatus())
            return "[E]" + "[✓]" + super.description + " (at: " + time + ")" ;
        else
            return "[E]" + "[✗]" + super.description + " (at: " + time + ")" ;
    }

    @Override
    public Event markAsDone() {
        return new Event(this.description, this.time,true);
    }

    public static void main(String[] args) {}
}
