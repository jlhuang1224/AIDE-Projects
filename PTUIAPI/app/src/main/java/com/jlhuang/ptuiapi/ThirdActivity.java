package com.jlhuang.ptuiapi;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;


public class ThirdActivity extends Activity 
{
	private Button btnL;
	private Button btnC;
	private Button btnR;
	private Button btnL2;
	private Button btnR2;
	private Button btnCO;
	private Button btnO;
	private Button btnOT;
	private Button btnDA;
	private Button btnJP;
	private Button ptuiTitleBack;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
		{
			getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		}
		initPtuiView();
		ptuiTitleBack.setText("<Button");
		ptuiTitleBack.setVisibility(View.VISIBLE);
		ptuiTitleBack.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					finish();
				}
			});
		btnR = (Button)findViewById(R.id.btnR);
		btnR2 = (Button)findViewById(R.id.btnR2);
		btnCO = (Button)findViewById(R.id.btnCO);
		btnL = (Button)findViewById(R.id.btnL);
		btnL2 = (Button)findViewById(R.id.btnL2);
		btnC = (Button)findViewById(R.id.btnC);
		btnO = (Button)findViewById(R.id.btnO);
		btnOT = (Button)findViewById(R.id.btnOT);
		btnDA = (Button)findViewById(R.id.btnDA);
		btnJP = (Button)findViewById(R.id.btnJP);
		btnDA.setText("禁用全部按钮");
		btnDA.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					if (btnL.isEnabled())
					{
						btnL.setEnabled(false);
						btnC.setEnabled(false);
						btnR.setEnabled(false);
						btnL2.setEnabled(false);
						btnR2.setEnabled(false);
						btnCO.setEnabled(false);
						btnO.setEnabled(false);
						btnOT.setEnabled(false);
						btnDA.setText("启用全部按钮");
					}
					else
					{
						btnL.setEnabled(true);
						btnC.setEnabled(true);
						btnR.setEnabled(true);
						btnL2.setEnabled(true);
						btnR2.setEnabled(true);
						btnCO.setEnabled(true);
						btnO.setEnabled(true);
						btnOT.setEnabled(true);
						btnDA.setText("禁用全部按钮");
					}
				}
			});
		btnJP.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					Intent i = new Intent(ThirdActivity.this, Third2Activity.class);
					startActivity(i);
				}
			});
	}
	public void initPtuiView()
	{
		ptuiTitleBack = (Button)findViewById(R.id.ptuiTitleBack);
	}
}
