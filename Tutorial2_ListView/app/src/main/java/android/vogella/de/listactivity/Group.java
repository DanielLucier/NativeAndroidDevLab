package android.vogella.de.listactivity;

/**
 * Created by Dan on 3/7/2018.
 */

import java.util.ArrayList;
import java.util.List;

public class Group {

    public String string;
    public final List<String> children = new ArrayList<String>();

    public Group(String string) {
        this.string = string;
    }

}
