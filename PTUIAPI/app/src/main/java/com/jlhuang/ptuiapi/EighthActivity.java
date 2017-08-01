package com.jlhuang.ptuiapi;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class EighthActivity extends Activity
{
	private SeekBar activityeighthSeekBar1;
	private SeekBar activityeighthSeekBar2;
	private Button activityeighthButton1;
	private Button activityeighthButton2;
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
		activityeighthSeekBar1 = (SeekBar)findViewById(R.id.activityeighthSeekBar1);
		activityeighthSeekBar2 = (SeekBar)findViewById(R.id.activityeighthSeekBar2);
		activityeighthButton1 = (Button)findViewById(R.id.activityeighthButton1);
		activityeighthButton2 = (Button)findViewById(R.id.activityeighthButton2);
		activityeighthButton1.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				if(activityeighthSeekBar1.isEnabled())
				{
					activityeighthSeekBar1.setEnabled(false);
					activityeighthButton1.setText("启用");
				}else{
					activityeighthSeekBar1.setEnabled(true);
					activityeighthButton1.setText("禁用");
				}
				
			}
		});
		activityeighthButton2.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					if(activityeighthSeekBar2.isEnabled())
					{
						activityeighthSeekBar2.setEnabled(false);
						activityeighthButton2.setText("启用");
					}else{
						activityeighthSeekBar2.setEnabled(true);
						activityeighthButton2.setText("禁用");
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
