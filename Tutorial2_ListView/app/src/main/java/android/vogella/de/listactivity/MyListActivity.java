package android.vogella.de.listactivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.vogella.de.listactivity.adapters.MyPerformanceArrayAdapter;

public class MyListActivity extends ListActivity {
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
				"Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
				"Linux", "OS/2" };
		setListAdapter(new MyPerformanceArrayAdapter(this, values));
	}

}
