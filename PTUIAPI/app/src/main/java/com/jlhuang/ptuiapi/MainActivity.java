package com.jlhuang.ptuiapi;

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
	private Button view_ptui_btn;
	private String[] data = { "TextView", "Button", "EditText", "CheckBox",
		"RadioButton & RadioGroup", "ProgressBar(round)", "ProgressBar", "SeekBar", "Switch", "Dialog" };

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
		{
			getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		}
		title_bar_btn_left = (Button)findViewById(R.id.title_bar_btn_left);
		title_bar_title = (TextView) findViewById(R.id.title_bar_title);
		view_ptui_btn = (Button)findViewById(R.id.view_ptui_btn);
		view_ptui_btn.setOnClickListener(new OnClickListener()
			{
				@Override

				public void onClick(View v)
				{
					Intent i = new Intent(MainActivity.this,
										  PtuiMainActivity.class);
					startActivity(i);
				}
			});
		title_bar_btn_left.setText("");
		title_bar_title.setText("PTUI API");
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
			MainActivity.this, android.R.layout.simple_list_item_1, data);
		ListView listView = (ListView) findViewById(R.id.list_view);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
										long arg3)
				{
					if (arg2 == 0)
					{
						Intent i = new Intent(MainActivity.this,
											  SecondActivity.class);
						startActivity(i);
					}
					else
					{
						if (arg2 == 1)
						{
							Intent i = new Intent(MainActivity.this,
												  ThirdActivity.class);
							startActivity(i);
						}
						else
						{
							if (arg2 == 2)
							{
								Intent i = new Intent(MainActivity.this,
													  FourthActivity.class);
								startActivity(i);
							}
							else
							{
								if (arg2 == 3)
								{
									Intent i = new Intent(MainActivity.this,
														  FifthActivity.class);
									startActivity(i);
								}
								else
								{
									if (arg2 == 4)
									{
										Intent i = new Intent(MainActivity.this,
															  SixthActivity.class);
										startActivity(i);
									}
								}
							}
						}
					}
				}
			});
		AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
		dialog.setTitle("请问");
		dialog.setMessage("敲一上午的代码，你说累不累？");
//		dialog.setCancelable(false);
		dialog.setPositiveButton("累", new DialogInterface. OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which)
				{
					Toast.makeText(MainActivity.this, "谢谢你的理解和支持！开始体验吧，记得做个评价哦！我们UI以后就是这样的啦！", Toast.LENGTH_SHORT).show();
					dialog.cancel();
				}
			});
		dialog.setNegativeButton("不累", new DialogInterface. OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which)
				{
					Toast.makeText(MainActivity.this, "不累才怪！！谢谢你的支持，开始体验吧，记得做个评价哦！我们UI以后就是这样的啦！", Toast.LENGTH_SHORT).show();
					dialog.cancel();
				}
			});
//		dialog.show();
	}
}

