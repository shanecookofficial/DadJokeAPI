package io.github.shanecookofficial.dadjokeapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "dadjokes")
public class DadJoke {

    @Id
    private String id;
    private String hook;
    private String punchline;
    private LocalDateTime timestamp;

    // Constructors
    public DadJoke() {}

    public DadJoke(String hook, String punchline) {
        this.hook = hook;
        this.punchline = punchline;
        this.timestamp = LocalDateTime.now();
    }

    // Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHook() {
        return hook;
    }

    public void setHook(String hook) {
        this.hook = hook;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
