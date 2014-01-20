package option;

import com.example.wizzardapp_table.R;
import com.example.wizzardapp_table.R.layout;
import com.example.wizzardapp_table.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Option2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_option2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.search, menu);
		return true;
	}

}
