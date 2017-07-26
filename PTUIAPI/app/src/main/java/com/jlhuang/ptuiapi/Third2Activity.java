package com.jlhuang.ptuiapi;

import android.app.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;



public class Third2Activity extends Activity 
{
	private Button btnLw;
	private Button btnCw;
	private Button btnRw;
	private Button btnL2w;
	private Button btnR2w;
	private Button btnCOw;
	private Button btnOw;
	private Button btnOTw;
	private Button btnDAw;
	private Button ptuiTitleBack;
	private Button btn_set_bg;
	private ScrollView activity_third2_ScrollView;
	private Boolean background = true;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third2);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) 
		{
			getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		}
		initPtuiView();
		ptuiTitleBack.setText("<Button(半透明)");
		ptuiTitleBack.setVisibility(View.VISIBLE);
		ptuiTitleBack.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					finish();
				}
			});
		btnRw = (Button)findViewById(R.id.btnRw);
		btnR2w = (Button)findViewById(R.id.btnR2w);
		btnCOw = (Button)findViewById(R.id.btnCOw);
		btnLw = (Button)findViewById(R.id.btnLw);
		btnL2w = (Button)findViewById(R.id.btnL2w);
		btnCw = (Button)findViewById(R.id.btnCw);
		btnOw = (Button)findViewById(R.id.btnOw);
		btnOTw = (Button)findViewById(R.id.btnOTw);
		btnDAw = (Button)findViewById(R.id.btnDAw);
		btn_set_bg = (Button)findViewById(R.id.btn_set_bg);
		activity_third2_ScrollView = (ScrollView)findViewById(R.id.activity_third2_ScrollView);
		btnDAw.setText("禁用全部按钮");
		btnDAw.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					if (btnLw.isEnabled())
					{
						btnLw.setEnabled(false);
						btnCw.setEnabled(false);
						btnRw.setEnabled(false);
						btnL2w.setEnabled(false);
						btnR2w.setEnabled(false);
						btnCOw.setEnabled(false);
						btnOw.setEnabled(false);
						btnOTw.setEnabled(false);
						btnDAw.setText("启用全部按钮");
					}
					else
					{
						btnLw.setEnabled(true);
						btnCw.setEnabled(true);
						btnRw.setEnabled(true);
						btnL2w.setEnabled(true);
						btnR2w.setEnabled(true);
						btnCOw.setEnabled(true);
						btnOw.setEnabled(true);
						btnOTw.setEnabled(true);
						btnDAw.setText("禁用全部按钮");
					}
				}
			});

		btn_set_bg.setOnClickListener(new OnClickListener()
			{

				@Override
				public void onClick(View v)
				{
					switchBackground();
				}	
			});
	}
	public void switchBackground()
	{
		if (background == true)
		{
			activity_third2_ScrollView.setBackgroundResource(R.drawable.lockscreen_006);
			background = false;
		}
		else
		{
			activity_third2_ScrollView.setBackgroundResource(R.drawable.lockscreen_107);
			background = true;
		}
	}
	public void initPtuiView()
	{
		ptuiTitleBack = (Button)findViewById(R.id.ptuiTitleBack);
	}
}
