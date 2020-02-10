package ru.Eltex.domain;

import javax.persistence.*;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String text;
    private String ntable;
    private String data;
    private String time;
    private String nofP;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;

    private String filename;

    public Reservation() {
    }

    public Reservation(String text, String table, String data, String time, String NofP, User user) {
        this.author = user;
        this.text = text;
        this.ntable = table;
        this.data = data;
        this.time = time;
        this.nofP = NofP;
    }

    public String getAuthorName() {
        return author != null ? author.getUsername() : "<none>";
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTable() {
        return ntable;
    }

    public void setTable(String table) {
        this.ntable = table;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFilename() {
        return filename;
    }

    public String getNtable() {
        return ntable;
    }

    public void setNtable(String ntable) {
        this.ntable = ntable;
    }

    public String getNofP() {
        return nofP;
    }

    public void setNofP(String NofP) {
        this.nofP = NofP;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}