package org.example.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Log implements Serializable {
    private Book book;
    private UUID clientId;
    private String takeOrReturned;
    private Calendar calendar;


    @Override
    public String toString() {
        return "Log{" +
                "book=" + book +
                ", clientId=" + clientId +
                ", takeOrReturned='" + takeOrReturned + '\'' +
                ", date=" + calendar +
                '}';
    }

    public Log(Book book, UUID clientId, String takeOrReturned, Calendar calendar){
        this.book = book;
        this.clientId = clientId;
        this.takeOrReturned = takeOrReturned;
        this.calendar = calendar;
    }

    public String getTakeOrReturned() {
        return takeOrReturned;
    }

    public void setTakeOrReturned(String takeOrReturned) {
        this.takeOrReturned = takeOrReturned;
    }

    public UUID getClientId() {
        return clientId;
    }

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
}
