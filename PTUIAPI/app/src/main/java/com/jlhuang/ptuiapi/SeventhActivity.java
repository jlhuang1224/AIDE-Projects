package com.jlhuang.ptuiapi;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class SeventhActivity extends Activity
{
	private Button ptuiTitleBack;
	private Button activityseventhButton1;
	private Button activityseventhButton2;
	private ProgressBar activityseventhProgressBar1;
	private ProgressBar activityseventhProgressBar2;
	private Button activityseventhButton3;
	private Button activityseventhButton4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seventh);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
		{
			getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		}
		initPtuiView();
		ptuiTitleBack.setText("<ProgressBar");
		ptuiTitleBack.setVisibility(View.VISIBLE);
		ptuiTitleBack.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					finish();
				}
			});
		activityseventhButton1 = (Button)findViewById(R.id.activityseventhButton1);
		activityseventhButton2 = (Button)findViewById(R.id.activityseventhButton2);
		activityseventhButton3 = (Button)findViewById(R.id.activityseventhButton3);
		activityseventhButton4 = (Button)findViewById(R.id.activityseventhButton4);
		activityseventhProgressBar1 = (ProgressBar)findViewById(R.id.activityseventhProgressBar1);
		activityseventhProgressBar2 = (ProgressBar)findViewById(R.id.activityseventhProgressBar2);
		activityseventhButton1.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				int progress = activityseventhProgressBar2.getProgress();
				activityseventhProgressBar2.setProgress(progress - 10);
			}
		});
		activityseventhButton2.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					int progress = activityseventhProgressBar2.getProgress();
					activityseventhProgressBar2.setProgress(progress + 10);
				}
			});
		activityseventhButton3.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					int progress2 = activityseventhProgressBar2.getSecondaryProgress();
					activityseventhProgressBar2.setSecondaryProgress(progress2 - 10);
				}
			});
		activityseventhButton4.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					int progress2 = activityseventhProgressBar2.getSecondaryProgress();
					activityseventhProgressBar2.setSecondaryProgress(progress2 + 10);
				}
			});
	}
	public void initPtuiView()
	{
		ptuiTitleBack = (Button)findViewById(R.id.ptuiTitleBack);
	}
	
}
