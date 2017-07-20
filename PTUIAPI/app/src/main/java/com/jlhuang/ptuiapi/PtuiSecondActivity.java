package com.jlhuang.ptuiapi;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class PtuiSecondActivity extends Activity
{

	private Button appuiTitleBack;
	private TextView appuiTitleTextView;
	private TextView appuiTitleRightBtnText1;
	private TextView appuiTitleRightBtnText2;
	private TextView appuiTitleRightBtnText3;
	private TextView appuiTitleRightBtnText4;
	private ImageButton appuiTitleRightBtn1;
	private ImageButton appuiTitleRightBtn2;
	private ImageButton appuiTitleRightBtn3;
	private ImageButton appuiTitleRightBtn4;
	private LinearLayout appuiTitleRightBtnFrame1;
	private LinearLayout appuiTitleRightBtnFrame2;
	private LinearLayout appuiTitleRightBtnFrame3;
	private LinearLayout appuiTitleRightBtnFrame4;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ptui_second);
		initAppuiView();
		appuiTitleBack.setText("<详情");
		appuiTitleBack.setVisibility(View.VISIBLE);
		appuiTitleBack.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				finish();
			}
		});
//		appuiTitleTextView.setText("Details");
		appuiTitleRightBtn1.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					Toast.makeText(PtuiSecondActivity.this, "You clicked appuiTitleRightBtn1", Toast.LENGTH_SHORT).show();
				}
			});
		appuiTitleRightBtn2.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					Toast.makeText(PtuiSecondActivity.this, "You clicked appuiTitleRightBtn2", Toast.LENGTH_SHORT).show();
				}
			});
		appuiTitleRightBtn3.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					Toast.makeText(PtuiSecondActivity.this, "You clicked appuiTitleRightBtn3", Toast.LENGTH_SHORT).show();
				}
			});
		appuiTitleRightBtn4.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					Toast.makeText(PtuiSecondActivity.this, "You clicked appuiTitleRightBtn4", Toast.LENGTH_SHORT).show();
				}
			});
	}
	
	public void initAppuiView()
	{
		appuiTitleBack = (Button)findViewById(R.id.ptuiTitleBack);
		appuiTitleTextView = (TextView)findViewById(R.id.appuiTitleTextView);
		appuiTitleRightBtnText1 = (TextView)findViewById(R.id.appuiTitleRightBtnText1);
		appuiTitleRightBtnText2 = (TextView)findViewById(R.id.appuiTitleRightBtnText2);
		appuiTitleRightBtnText3 = (TextView)findViewById(R.id.appuiTitleRightBtnText3);
		appuiTitleRightBtnText4 = (TextView)findViewById(R.id.appuiTitleRightBtnText4);
		appuiTitleRightBtn1 = (ImageButton)findViewById(R.id.appuiTitleRightBtn1);
		appuiTitleRightBtn2 = (ImageButton)findViewById(R.id.appuiTitleRightBtn2);
		appuiTitleRightBtn3 = (ImageButton)findViewById(R.id.appuiTitleRightBtn3);
		appuiTitleRightBtn4 = (ImageButton)findViewById(R.id.appuiTitleRightBtn4);
		appuiTitleRightBtnFrame1 = (LinearLayout)findViewById(R.id.appuiTitleRightBtnFrame1);
		appuiTitleRightBtnFrame2 = (LinearLayout)findViewById(R.id.appuiTitleRightBtnFrame2);
		appuiTitleRightBtnFrame3 = (LinearLayout)findViewById(R.id.appuiTitleRightBtnFrame3);
		appuiTitleRightBtnFrame4 = (LinearLayout)findViewById(R.id.appuiTitleRightBtnFrame4);
		showAppUiTitleRightBtnFrame();
	}

	public void showAppUiTitleRightBtnFrame()
	{
		appuiTitleRightBtnFrame1.setVisibility(View.VISIBLE);
		appuiTitleRightBtnText1.setText("删除");
		appuiTitleRightBtn1.setImageResource(R.drawable.ic_delete_black_24dp);
		
		appuiTitleRightBtnFrame2.setVisibility(View.VISIBLE);
		appuiTitleRightBtnText2.setText("剪切");
		appuiTitleRightBtn2.setImageResource(R.drawable.ic_content_cut_black_24dp);
		
		appuiTitleRightBtnFrame3.setVisibility(View.VISIBLE);
		appuiTitleRightBtnText3.setText("复制");
		appuiTitleRightBtn3.setImageResource(R.drawable.ic_content_copy_black_24dp);
		
		appuiTitleRightBtnFrame4.setVisibility(View.VISIBLE);
		appuiTitleRightBtnText4.setText("全选");
		appuiTitleRightBtn4.setImageResource(R.drawable.ic_select_all_black_24dp);
	}
}
