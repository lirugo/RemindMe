package freejava.com.remindme.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by admin on 09.05.2017.
 */

public class AbstractTabFragment extends Fragment{
    private String title;
    protected View view;
    protected Context context;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
