package urfu.lesson6;

import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

public class Info
{
    private int id;
    private Date date;

    public Info(Date date)
    {
        this.date = date;
    }

    public Info(Date date, int id)
    {
        this.date = date;
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(int id) {
        this.id = id;
    }
}
