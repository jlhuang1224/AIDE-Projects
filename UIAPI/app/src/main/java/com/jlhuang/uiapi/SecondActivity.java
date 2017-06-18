package com.jlhuang.uiapi;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class SecondActivity extends Activity 
{
	private Button title_bar_btn_left;
	private TextView title_bar_title;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
		{
			getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		}
		title_bar_btn_left = (Button)findViewById(R.id.title_bar_btn_left);
		title_bar_title = (TextView) findViewById(R.id.title_bar_title);
		title_bar_btn_left.setText("↩返回");
		title_bar_title.setText("TextView");
		title_bar_btn_left.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					finish();
				}
			});

	}
}
