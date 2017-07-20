package com.jlhuang.ptuiapi;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class PtuiSecondActivity extends Activity
{

	private Button ptuiTitleBack;
	private TextView ptuiTitleTextView;
	private TextView ptuiTitleRightBtnText1;
	private TextView ptuiTitleRightBtnText2;
	private TextView ptuiTitleRightBtnText3;
	private TextView ptuiTitleRightBtnText4;
	private ImageButton ptuiTitleRightBtn1;
	private ImageButton ptuiTitleRightBtn2;
	private ImageButton ptuiTitleRightBtn3;
	private ImageButton ptuiTitleRightBtn4;
	private LinearLayout ptuiTitleRightBtnFrame1;
	private LinearLayout ptuiTitleRightBtnFrame2;
	private LinearLayout ptuiTitleRightBtnFrame3;
	private LinearLayout ptuiTitleRightBtnFrame4;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ptui_second);
		initPtuiView();
		ptuiTitleBack.setText("<详情");
		ptuiTitleBack.setVisibility(View.VISIBLE);
		ptuiTitleBack.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				finish();
			}
		});
//		ptuiTitleTextView.setText("Details");
		ptuiTitleRightBtn1.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					Toast.makeText(PtuiSecondActivity.this, "You clicked appuiTitleRightBtn1", Toast.LENGTH_SHORT).show();
				}
			});
		ptuiTitleRightBtn2.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					Toast.makeText(PtuiSecondActivity.this, "You clicked appuiTitleRightBtn2", Toast.LENGTH_SHORT).show();
				}
			});
		ptuiTitleRightBtn3.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					Toast.makeText(PtuiSecondActivity.this, "You clicked appuiTitleRightBtn3", Toast.LENGTH_SHORT).show();
				}
			});
		ptuiTitleRightBtn4.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					Toast.makeText(PtuiSecondActivity.this, "You clicked appuiTitleRightBtn4", Toast.LENGTH_SHORT).show();
				}
			});
	}
	
	public void initPtuiView()
	{
		ptuiTitleBack = (Button)findViewById(R.id.ptuiTitleBack);
		ptuiTitleTextView = (TextView)findViewById(R.id.ptuiTitleTextView);
		ptuiTitleRightBtnText1 = (TextView)findViewById(R.id.ptuiTitleRightBtnText1);
		ptuiTitleRightBtnText2 = (TextView)findViewById(R.id.ptuiTitleRightBtnText2);
		ptuiTitleRightBtnText3 = (TextView)findViewById(R.id.ptuiTitleRightBtnText3);
		ptuiTitleRightBtnText4 = (TextView)findViewById(R.id.ptuiTitleRightBtnText4);
		ptuiTitleRightBtn1 = (ImageButton)findViewById(R.id.ptuiTitleRightBtn1);
		ptuiTitleRightBtn2 = (ImageButton)findViewById(R.id.ptuiTitleRightBtn2);
		ptuiTitleRightBtn3 = (ImageButton)findViewById(R.id.ptuiTitleRightBtn3);
		ptuiTitleRightBtn4 = (ImageButton)findViewById(R.id.ptuiTitleRightBtn4);
		ptuiTitleRightBtnFrame1 = (LinearLayout)findViewById(R.id.ptuiTitleRightBtnFrame1);
		ptuiTitleRightBtnFrame2 = (LinearLayout)findViewById(R.id.ptuiTitleRightBtnFrame2);
		ptuiTitleRightBtnFrame3 = (LinearLayout)findViewById(R.id.ptuiTitleRightBtnFrame3);
		ptuiTitleRightBtnFrame4 = (LinearLayout)findViewById(R.id.ptuiTitleRightBtnFrame4);
		showPtuiTitleRightBtnFrame();
	}

	public void showPtuiTitleRightBtnFrame()
	{
		ptuiTitleRightBtnFrame1.setVisibility(View.VISIBLE);
		ptuiTitleRightBtnText1.setText("删除");
		ptuiTitleRightBtn1.setImageResource(R.drawable.ic_delete_black_24dp);
		
		ptuiTitleRightBtnFrame2.setVisibility(View.VISIBLE);
		ptuiTitleRightBtnText2.setText("剪切");
		ptuiTitleRightBtn2.setImageResource(R.drawable.ic_content_cut_black_24dp);
		
		ptuiTitleRightBtnFrame3.setVisibility(View.VISIBLE);
		ptuiTitleRightBtnText3.setText("复制");
		ptuiTitleRightBtn3.setImageResource(R.drawable.ic_content_copy_black_24dp);
		
		ptuiTitleRightBtnFrame4.setVisibility(View.VISIBLE);
		ptuiTitleRightBtnText4.setText("全选");
		ptuiTitleRightBtn4.setImageResource(R.drawable.ic_select_all_black_24dp);
	}
}
