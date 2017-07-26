package com.jlhuang.ptuiapi;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class FifthActivity extends Activity 
{
	private CheckBox activityfifthCheckBox1;
	private CheckBox activityfifthCheckBox2;
	private CheckBox activityfifthCheckBox3;
	private CheckBox activityfifthCheckBox4;
	private Button ptuiTitleBack;
	private Button activityfifthButton1;
	private Button activityfifthButton2;
	private Button activityfifthButton3;
	private Button activityfifthButton4;
	private Button activityfifthButton5;
	private LinearLayout activityfifthLinearLayout;
	private Boolean background = true;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
		{
			getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		}
		initPtuiView();
		ptuiTitleBack.setText("<CheckBox");
		ptuiTitleBack.setVisibility(View.VISIBLE);
		ptuiTitleBack.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					finish();
				}
			});
		activityfifthCheckBox1 = (CheckBox)findViewById(R.id.activityfifthCheckBox1);
		activityfifthCheckBox2 = (CheckBox)findViewById(R.id.activityfifthCheckBox2);
		activityfifthCheckBox3 = (CheckBox)findViewById(R.id.activityfifthCheckBox3);
		activityfifthCheckBox4 = (CheckBox)findViewById(R.id.activityfifthCheckBox4);
		activityfifthButton1 = (Button)findViewById(R.id.activityfifthButton1);
		activityfifthButton2 = (Button)findViewById(R.id.activityfifthButton2);
		activityfifthButton3 = (Button)findViewById(R.id.activityfifthButton3);
		activityfifthButton4 = (Button)findViewById(R.id.activityfifthButton4);
		activityfifthButton5 = (Button)findViewById(R.id.activityfifthButton5);
		activityfifthLinearLayout = (LinearLayout)findViewById(R.id.activityfifthLinearLayout);
		activityfifthButton1.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					if (activityfifthCheckBox1.isEnabled())
					{
						activityfifthCheckBox1.setEnabled(false);
						activityfifthButton1.setText("启用");
					}
					else
					{
						activityfifthCheckBox1.setEnabled(true);
						activityfifthButton1.setText("禁用");
					}
				}
			});
		activityfifthButton2.setOnClickListener(new OnClickListener()
			{
				@Override

				public void onClick(View v)
				{
					if (activityfifthCheckBox2.isEnabled())
					{
						activityfifthCheckBox2.setEnabled(false);
						activityfifthButton2.setText("启用");
					}
					else
					{
						activityfifthCheckBox2.setEnabled(true);
						activityfifthButton2.setText("禁用");
					}
				}
			});
		activityfifthButton3.setOnClickListener(new OnClickListener()
			{
				@Override

				public void onClick(View v)
				{
					if (activityfifthCheckBox3.isEnabled())
					{
						activityfifthCheckBox3.setEnabled(false);
						activityfifthButton3.setText("启用");
					}
					else
					{
						activityfifthCheckBox3.setEnabled(true);
						activityfifthButton3.setText("禁用");
					}
				}
			});
		activityfifthButton4.setOnClickListener(new OnClickListener()
			{
				@Override

				public void onClick(View v)
				{
					if (activityfifthCheckBox4.isEnabled())
					{
						activityfifthCheckBox4.setEnabled(false);
						activityfifthButton4.setText("启用");
					}
					else
					{
						activityfifthCheckBox4.setEnabled(true);
						activityfifthButton4.setText("禁用");
					}
				}
			});
		activityfifthButton5.setOnClickListener(new OnClickListener()
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
	};

	public void switchBackground()
	{
		if (background == true)
		{
			activityfifthLinearLayout.setBackgroundResource(R.drawable.lockscreen_107);
			background = false;
		}
		else
		{
			activityfifthLinearLayout.setBackgroundResource(R.drawable.lockscreen_006);
			background = true;
		}
	}
}
