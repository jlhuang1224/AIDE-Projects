package com.jlhuang.uiapi;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class FourthActivity extends Activity 
{
	private EditText et2;
	private Button btn1;
	private Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
		et2 = (EditText)findViewById(R.id.et2);
		btn1 = (Button)findViewById(R.id.btn1);
		btn2 =(Button)findViewById(R.id.btn2);
		btn1.setText("Enable EditText 2");
		btn2.setText("Disable EditText 2");
		btn1.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v){
				et2.setEnabled(true);
			/*	Intent i = null;
				i = new Intent(AudioService.ACTION_REMOTE_PLAY);
*/
			}
		});
		btn2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				et2.setEnabled(false);
			}
		});
	}
}
