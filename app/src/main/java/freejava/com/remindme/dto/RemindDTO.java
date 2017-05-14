package freejava.com.remindme.dto;

/**
 * Created by admin on 10.05.2017.
 */

public class RemindDTO {

    private String title;

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
