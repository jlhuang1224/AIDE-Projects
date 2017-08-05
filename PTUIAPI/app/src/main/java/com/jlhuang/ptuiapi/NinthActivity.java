package com.jlhuang.ptuiapi;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class NinthActivity extends Activity
{
	private ToggleButton activityninthToggleButton1;
	private ToggleButton activityninthToggleButton2;
	private ToggleButton activityninthToggleButton3;
	private ToggleButton activityninthToggleButton4;
	private Button activityninthButton1;
	private Button activityninthButton2;
	private Button activityninthButton3;
	private Button activityninthButton4;
	private Button activityninthButton5;
	private Button ptuiTitleBack;
	private LinearLayout activityninthLinearLayout1;
	private Boolean background = true;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ninth);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
		{
			getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		}
		initPtuiView();
		ptuiTitleBack.setText("<ToggleButton");
		ptuiTitleBack.setVisibility(View.VISIBLE);
		ptuiTitleBack.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					finish();
				}
			});
		activityninthToggleButton1 = (ToggleButton)findViewById(R.id.activityninthToggleButton1);
		activityninthToggleButton2 = (ToggleButton)findViewById(R.id.activityninthToggleButton2);
		activityninthToggleButton3 = (ToggleButton)findViewById(R.id.activityninthToggleButton3);
		activityninthToggleButton4 = (ToggleButton)findViewById(R.id.activityninthToggleButton4);
		activityninthButton1 = (Button)findViewById(R.id.activityninthButton1);
		activityninthButton2 = (Button)findViewById(R.id.activityninthButton2);
		activityninthButton3 = (Button)findViewById(R.id.activityninthButton3);
		activityninthButton4 = (Button)findViewById(R.id.activityninthButton4);
		activityninthButton5 = (Button)findViewById(R.id.activityninthButton5);
		activityninthLinearLayout1 = (LinearLayout)findViewById(R.id.activityninthLinearLayout1);
		activityninthButton1.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					if (activityninthToggleButton1.isEnabled())
					{
						activityninthToggleButton1.setEnabled(false);
						activityninthButton1.setText("启用");
					}
					else
					{
						activityninthToggleButton1.setEnabled(true);
						activityninthButton1.setText("禁用");
					}
				}
			});
		activityninthButton2.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					if (activityninthToggleButton2.isEnabled())
					{
						activityninthToggleButton2.setEnabled(false);
						activityninthButton2.setText("启用");
					}
					else
					{
						activityninthToggleButton2.setEnabled(true);
						activityninthButton2.setText("禁用");
					}
				}
			});
		activityninthButton3.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					if (activityninthToggleButton3.isEnabled())
					{
						activityninthToggleButton3.setEnabled(false);
						activityninthButton3.setText("启用");
					}
					else
					{
						activityninthToggleButton3.setEnabled(true);
						activityninthButton3.setText("禁用");
					}
				}
			});
		activityninthButton4.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					if (activityninthToggleButton4.isEnabled())
					{
						activityninthToggleButton4.setEnabled(false);
						activityninthButton4.setText("启用");
					}
					else
					{
						activityninthToggleButton4.setEnabled(true);
						activityninthButton4.setText("禁用");
					}
				}
			});
		activityninthButton5.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					switchBackground();
				}
			});
	}
	public void initPtuiView()
	{
		ptuiTitleBack = (Button)findViewById(R.id.ptuiTitleBack);
	}
	public void switchBackground()
	{
		if (background == true)
		{
			activityninthLinearLayout1.setBackgroundResource(R.drawable.lockscreen_107);
			background = false;
		}
		else
		{
			activityninthLinearLayout1.setBackgroundResource(R.drawable.lockscreen_006);
			background = true;
		}
	}
}
