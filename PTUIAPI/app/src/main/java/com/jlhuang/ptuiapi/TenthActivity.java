package com.jlhuang.ptuiapi;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class TenthActivity extends Activity
{
	private Switch activitytenthSwitch1;
	private Switch activitytenthSwitch2;
	private Switch activitytenthSwitch3;
	private Switch activitytenthSwitch4;
	private Button ptuiTitleBack;
	private Button activitytenthButton1;
	private Button activitytenthButton2;
	private Button activitytenthButton3;
	private Button activitytenthButton4;
	private Button activitytenthButton5;
	private LinearLayout activitytenthLinearLayout;
	private Boolean background = true;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tenth);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
		{
			getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		}
		initPtuiView();
		ptuiTitleBack.setText("<Switch");
		ptuiTitleBack.setVisibility(View.VISIBLE);
		ptuiTitleBack.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					finish();
				}
			});
		activitytenthSwitch1 = (Switch)findViewById(R.id.activitytenthSwitch1);
		activitytenthSwitch2 = (Switch)findViewById(R.id.activitytenthSwitch2);
		activitytenthSwitch3 = (Switch)findViewById(R.id.activitytenthSwitch3);
		activitytenthSwitch4 = (Switch)findViewById(R.id.activitytenthSwitch4);
		activitytenthButton1 = (Button)findViewById(R.id.activitytenthButton1);
		activitytenthButton2 = (Button)findViewById(R.id.activitytenthButton2);
		activitytenthButton3 = (Button)findViewById(R.id.activitytenthButton3);
		activitytenthButton4 = (Button)findViewById(R.id.activitytenthButton4);
		activitytenthButton5 = (Button)findViewById(R.id.activitytenthButton5);
		activitytenthLinearLayout = (LinearLayout)findViewById(R.id.activitytenthLinearLayout);
		activitytenthButton1.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					if (activitytenthSwitch1.isEnabled())
					{
						activitytenthSwitch1.setEnabled(false);
						activitytenthButton1.setText("启用");
					}
					else
					{
						activitytenthSwitch1.setEnabled(true);
						activitytenthButton1.setText("禁用");
					}
				}
			});
		activitytenthButton2.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					if (activitytenthSwitch2.isEnabled())
					{
						activitytenthSwitch2.setEnabled(false);
						activitytenthButton2.setText("启用");
					}
					else
					{
						activitytenthSwitch2.setEnabled(true);
						activitytenthButton2.setText("禁用");
					}
				}
			});
		activitytenthButton3.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					if (activitytenthSwitch3.isEnabled())
					{
						activitytenthSwitch3.setEnabled(false);
						activitytenthButton3.setText("启用");
					}
					else
					{
						activitytenthSwitch3.setEnabled(true);
						activitytenthButton3.setText("禁用");
					}
				}
			});
		activitytenthButton4.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					if (activitytenthSwitch4.isEnabled())
					{
						activitytenthSwitch4.setEnabled(false);
						activitytenthButton4.setText("启用");
					}
					else
					{
						activitytenthSwitch4.setEnabled(true);
						activitytenthButton4.setText("禁用");
					}
				}
			});
		activitytenthButton5.setOnClickListener(new OnClickListener()
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
			activitytenthLinearLayout.setBackgroundResource(R.drawable.lockscreen_107);
			background = false;
		}
		else
		{
			activitytenthLinearLayout.setBackgroundResource(R.drawable.lockscreen_006);
			background = true;
		}
	}
}
