package com.example.wizardapp_table;

import com.example.wizzardapp_table.R;

import option.Option2;
import option.Option1;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
				
		Button clickTask=(Button) findViewById(R.id.bTask);
		//set click Listener
		clickTask.setOnClickListener(new OnClickListener(){

			//implement what it should do
			@Override
			public void onClick(View v) {

				Intent intent=null;
				intent=new Intent(MainActivity.this, Option1.class);
				startActivity(intent);
			}
			
		});
		
		Button clickSearch=(Button)findViewById(R.id.bSearch);
		clickSearch.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {

				Intent intent=null;
				intent=new Intent(MainActivity.this, Option2.class);
				startActivity(intent);
				
			}
			
		});
		
		
		}
		
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		
		
		return true;
	}
	

}
