package com.jlhuang.ptuiapi;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class EighthActivity extends Activity
{
	private SeekBar activityeighthSeekBar;
	private Button activityeighthButton;
	private Button ptuiTitleBack;
	private Boolean background = true;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_eighth);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
		{
			getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		}
		initPtuiView();
		ptuiTitleBack.setText("<SeekBar");
		ptuiTitleBack.setVisibility(View.VISIBLE);
		ptuiTitleBack.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					finish();
				}
			});
		activityeighthSeekBar = (SeekBar)findViewById(R.id.activityeighthSeekBar);
		activityeighthButton = (Button)findViewById(R.id.activityeighthButton);
		activityeighthButton.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				if(activityeighthSeekBar.isEnabled())
				{
					activityeighthSeekBar.setEnabled(false);
					activityeighthButton.setText("启用");
				}else{
					activityeighthSeekBar.setEnabled(true);
					activityeighthButton.setText("禁用");
				}
				
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
//			activitysixthLinearLayout.setBackgroundResource(R.drawable.lockscreen_107);
			background = false;
		}
		else
		{
//			activitysixthLinearLayout.setBackgroundResource(R.drawable.lockscreen_006);
			background = true;
		}
	}
}
