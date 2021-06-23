package hello;

import java.time.*;


public class Greeting {

    private final long id;
    private final String content;
    private final LocalDateTime date;

    public Greeting(long id, String content, LocalDateTime date) {
        this.id = id;
        this.content = content;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCurrentDate() {
        return date;
    }

}
