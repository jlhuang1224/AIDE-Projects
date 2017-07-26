package com.jlhuang.ptuiapi;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class SixthActivity extends Activity
{
	private RadioButton activitysixthRadioButton1;
	private RadioButton activitysixthRadioButton2;
	private RadioButton activitysixthRadioButton3;
	private RadioButton activitysixthRadioButton4;
	private Button ptuiTitleBack;
	private Button activitysixthButton1;
	private Button activitysixthButton2;
	private Button activitysixthButton3;
	private Button activitysixthButton4;
	private Button activitysixthButton5;
	private LinearLayout activitysixthLinearLayout;
	private Boolean background = true;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sixth);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
		{
			getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		}
		initPtuiView();
		ptuiTitleBack.setText("<RadioButton & RadioGroup");
		ptuiTitleBack.setVisibility(View.VISIBLE);
		ptuiTitleBack.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					finish();
				}
			});
		activitysixthRadioButton1 = (RadioButton)findViewById(R.id.activitysixthRadioButton1);
		activitysixthRadioButton2 = (RadioButton)findViewById(R.id.activitysixthRadioButton2);
		activitysixthRadioButton3 = (RadioButton)findViewById(R.id.activitysixthRadioButton3);
		activitysixthRadioButton4 = (RadioButton)findViewById(R.id.activitysixthRadioButton4);
		activitysixthButton1 = (Button)findViewById(R.id.activitysixthButton1);
		activitysixthButton2 = (Button)findViewById(R.id.activitysixthButton2);
		activitysixthButton3 = (Button)findViewById(R.id.activitysixthButton3);
		activitysixthButton4 = (Button)findViewById(R.id.activitysixthButton4);
		activitysixthButton5 = (Button)findViewById(R.id.activitysixthButton5);
		activitysixthLinearLayout = (LinearLayout)findViewById(R.id.activitysixthLinearLayout);
		activitysixthButton1.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					if (activitysixthRadioButton1.isEnabled())
					{
						activitysixthRadioButton1.setEnabled(false);
						activitysixthButton1.setText("启用");
					}
					else
					{
						activitysixthRadioButton1.setEnabled(true);
						activitysixthButton1.setText("禁用");
					}
				}
			});
		activitysixthButton2.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					if (activitysixthRadioButton2.isEnabled())
					{
						activitysixthRadioButton2.setEnabled(false);
						activitysixthButton2.setText("启用");
					}
					else
					{
						activitysixthRadioButton2.setEnabled(true);
						activitysixthButton2.setText("禁用");
					}
				}
			});
		activitysixthButton3.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					if (activitysixthRadioButton3.isEnabled())
					{
						activitysixthRadioButton3.setEnabled(false);
						activitysixthButton3.setText("启用");
					}
					else
					{
						activitysixthRadioButton3.setEnabled(true);
						activitysixthButton3.setText("禁用");
					}
				}
			});
		activitysixthButton4.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					if (activitysixthRadioButton4.isEnabled())
					{
						activitysixthRadioButton4.setEnabled(false);
						activitysixthButton4.setText("启用");
					}
					else
					{
						activitysixthRadioButton4.setEnabled(true);
						activitysixthButton4.setText("禁用");
					}
				}
			});
		activitysixthButton5.setOnClickListener(new OnClickListener()
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
			activitysixthLinearLayout.setBackgroundResource(R.drawable.lockscreen_107);
			background = false;
		}
		else
		{
			activitysixthLinearLayout.setBackgroundResource(R.drawable.lockscreen_006);
			background = true;
		}
	}
}
