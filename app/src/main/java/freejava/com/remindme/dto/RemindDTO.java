package freejava.com.remindme.dto;

import java.util.Date;

/**
 * Created by admin on 10.05.2017.
 */

public class RemindDTO {

    private String id;
    private String title;
    private Date remindDate;

    public RemindDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getRemindDate() {
        return remindDate;
    }

    public void setRemindDate(Date remindDate) {
        this.remindDate = remindDate;
    }

    public RemindDTO (String titile){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
