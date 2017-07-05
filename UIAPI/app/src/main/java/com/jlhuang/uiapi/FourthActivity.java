package com.jlhuang.uiapi;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class FourthActivity extends Activity 
{
	private EditText et1;
	private EditText et2;
	private EditText et1w;
	private EditText et2w;
	private Button btn1;
	private Button btn2;
	private Button btn1w;
	private Button btn2w;
	private Button btn_set_bg2;
	private Button title_bar_btn_left;
	private TextView title_bar_title;
	private LinearLayout activityfourthLinearLayout2;
	private Boolean background = true;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
		{
			getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		}
		SetAppTitle();
		et1 = (EditText)findViewById(R.id.et1);
		et2 = (EditText)findViewById(R.id.et2);
		et1w = (EditText)findViewById(R.id.et1w);
		et2w = (EditText)findViewById(R.id.et2w);
		btn1 = (Button)findViewById(R.id.btn1);
		btn2 = (Button)findViewById(R.id.btn2);
		btn1w = (Button)findViewById(R.id.btn1w);
		btn2w = (Button)findViewById(R.id.btn2w);
		btn_set_bg2 = (Button)findViewById(R.id.btn_set_bg2);
		activityfourthLinearLayout2 = (LinearLayout) findViewById(R.id.activityfourthLinearLayout2);
		btn_set_bg2.setText("点击切换背景");
		btn1.setText("禁用EditText1");
		btn2.setText("禁用EditText2");
		btn1w.setText("禁用EditText1");
		btn2w.setText("禁用EditText2");
		title_bar_btn_left.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					finish();
				}
			});
		btn1.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					if (et1.isEnabled())
					{
						btn1.setText("启用EditText1");
						et1.setEnabled(false);
					}
					else
					{
						btn1.setText("禁用EditText1");
						et1.setEnabled(true);
					}
					/*	Intent i = null;
					 i = new Intent(AudioService.ACTION_REMOTE_PLAY);
					 */
				}
			});
		btn1w.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					if (et1w.isEnabled())
					{
						btn1w.setText("启用EditText1");
						et1w.setEnabled(false);
					}
					else
					{
						btn1w.setText("禁用EditText1");
						et1w.setEnabled(true);
					}
					/*	Intent i = null;
					 i = new Intent(AudioService.ACTION_REMOTE_PLAY);
					 */
				}
			});
		btn2.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View v)
				{
					if (et2.isEnabled())
					{
						et2.setEnabled(false);
						btn2.setText("启用EditText2");
					}
					else
					{
						et2.setEnabled(true);
						btn2.setText("禁用EditText2");
					}

				}
			});
		btn2w.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View v)
				{
					if (et2w.isEnabled())
					{
						et2w.setEnabled(false);
						btn2w.setText("启用EditText2");
					}
					else
					{
						et2w.setEnabled(true);
						btn2w.setText("禁用EditText2");
					}

				}
			});
		btn_set_bg2.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					switchBackground();
				}
			});
	}

	private void SetAppTitle()
	{
		// TODO: Implement this method
		title_bar_btn_left = (Button)findViewById(R.id.title_bar_btn_left);
		title_bar_title = (TextView) findViewById(R.id.title_bar_title);
		title_bar_btn_left.setText("< Back");
		title_bar_title.setText("EditText");
		title_bar_btn_left.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					finish();
				}
			});
    }
	public void switchBackground()
	{
		if (background == true)
		{
			activityfourthLinearLayout2.setBackgroundResource(R.drawable.lockscreen_107);
			background = false;
		}
		else
		{
			activityfourthLinearLayout2.setBackgroundResource(R.drawable.lockscreen_006);
			background = true;
		}
	}
}
