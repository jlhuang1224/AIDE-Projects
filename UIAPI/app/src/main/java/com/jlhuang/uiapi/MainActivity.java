package com.jlhuang.uiapi;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.widget.AdapterView.*;

public class MainActivity extends Activity 
{
	private Button title_bar_btn_left;
	private TextView title_bar_title;
	private String[] data = { "TextView文本视图", "Button按钮", "EditText文本框", "CheckBox复选",
		"RadioButton单选", "ProgressBar圆形进度条", "ProgressBar直线进度条", "SeekBar拖动进度条", "Switch开关", "Dialog对话框" };
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		title_bar_btn_left = (Button)findViewById(R.id.title_bar_btn_left);
		title_bar_title = (TextView) findViewById(R.id.title_bar_title);
		title_bar_btn_left.setText("");
		title_bar_title.setText("UI API");
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
			MainActivity.this, android.R.layout.simple_list_item_1, data);
		ListView listView = (ListView) findViewById(R.id.list_view);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
										long arg3) {
					if(arg2==0){
						Intent i = new Intent(MainActivity.this,
						SecondActivity.class);
						startActivity(i);
						}else{
						if(arg2==1){
							Intent i = new Intent(MainActivity.this,
							ThirdActivity.class);
							startActivity(i);
							}else{
								if(arg2==2){
									Intent i = new Intent(MainActivity.this,
									FourthActivity.class);
									startActivity(i);
								}else{
									if(arg2==3){
										Intent i = new Intent(MainActivity.this,
										FifthActivity.class);
										startActivity(i);
								}
							}
						}
					}		
				}
			});
	}
}

