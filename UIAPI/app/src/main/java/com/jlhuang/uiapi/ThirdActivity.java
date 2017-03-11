package com.jlhuang.uiapi;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;


public class ThirdActivity extends Activity 
{
	private Button btnR;
	private Button btnCO;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
		btnR = (Button)findViewById(R.id.btnR);
		btnCO = (Button)findViewById(R.id.btnCO);
		
		btnCO.setText("Disable Right");
		btnCO.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v){
					if(btnR.isEnabled()){
						btnR.setEnabled(false);
						btnCO.setText("Enable Right");
					}else{
						btnR.setEnabled(true);
						btnCO.setText("Disable Right");
					}
				}
			});
	}
}
