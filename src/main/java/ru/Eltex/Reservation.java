package ru.Eltex;

import javax.persistence.*;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String text;
    private String table;
    private String data;
    private String time;

    public Reservation() {
    }

    public Reservation(String text, String table, String data, String time) {
        this.text = text;
        this.table = table;
        this.data = data;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
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
}