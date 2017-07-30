package com.jlhuang.ptuiapi;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class DemoActivity extends Activity
{
	private Button ptuiTitleBack;
	private Boolean background = true;

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
