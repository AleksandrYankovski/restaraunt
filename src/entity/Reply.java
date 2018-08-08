package entity;


import java.time.LocalTime;
import java.util.Date;

public class Reply {


    private int id;
    private User user;
    private Date date;
    private LocalTime time;
    private String message;


    public Reply() {
    }


    public void setId(int id)
    {
        this.id = id;
    }

    public void setUser(User user)    {
        this.user = user;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public void setTime(LocalTime time)
    {
        this.time = time;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public int getId()  {
        return id;
    }

    public User getUser()  {
        return user;
    }

    public Date getDate()  {
        return date;
    }

    public LocalTime getTime()  {
        return time;
    }

    public String getMessage()  {
        return message;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "id=" + id +
                ", user=" + user +
                ", date=" + date +
                ", time=" + time +
                ", message='" + message + '\'' +
                '}';
    }
}
