package src.models;

import java.util.Date;

public class Fecha{
    private Date date;

    public Fecha(Date date){
        this.date = date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
}