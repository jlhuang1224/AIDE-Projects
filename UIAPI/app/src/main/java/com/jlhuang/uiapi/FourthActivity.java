package com.jlhuang.uiapi;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class FourthActivity extends Activity 
{
	private EditText et1;
	private EditText et2;
	private EditText et1w;
	private EditText et2w;
	private Button btn1;
	private Button btn2;
	private Button btn1w;
	private Button btn2w;
	private Button btn_set_bg2;
	private Button title_bar_btn_left;
	private TextView title_bar_title;
	private TextView activityfourthTextView1;
	private LinearLayout activityfourthLinearLayout2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
		SetAppTitle();
		et1 = (EditText)findViewById(R.id.et1);
		et2 = (EditText)findViewById(R.id.et2);
		et1w = (EditText)findViewById(R.id.et1w);
		et2w = (EditText)findViewById(R.id.et2w);
		btn1 = (Button)findViewById(R.id.btn1);
		btn2 =(Button)findViewById(R.id.btn2);
		btn1w = (Button)findViewById(R.id.btn1w);
		btn2w =(Button)findViewById(R.id.btn2w);
		btn_set_bg2 =(Button)findViewById(R.id.btn_set_bg2);
		activityfourthTextView1 = (TextView) findViewById(R.id.activityfourthTextView1);
		activityfourthLinearLayout2 = (LinearLayout) findViewById(R.id.activityfourthLinearLayout2);
		btn_set_bg2.setText("点击切换背景");
		btn1.setText("禁用EditText1");
		btn2.setText("禁用EditText2");
		btn1w.setText("禁用EditText1");
		btn2w.setText("禁用EditText2");
		activityfourthTextView1.setVisibility(View.GONE);
		title_bar_btn_left.setOnClickListener(new OnClickListener ()
			{
				@Override
				public void onClick(View v){
					finish();
				}
			});
		btn1.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v){
				if(et1.isEnabled()){
					btn1.setText("启用EditText1");
					et1.setEnabled(false);
				} else {
					btn1.setText("禁用EditText1");
					et1.setEnabled(true);
				}
			/*	Intent i = null;
				i = new Intent(AudioService.ACTION_REMOTE_PLAY);
*/
			}
		});
		btn1w.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v){
					if(et1w.isEnabled()){
						btn1w.setText("启用EditText1");
						et1w.setEnabled(false);
					} else {
						btn1w.setText("禁用EditText1");
						et1w.setEnabled(true);
					}
					/*	Intent i = null;
					 i = new Intent(AudioService.ACTION_REMOTE_PLAY);
					 */
				}
			});
		btn2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				if(et2.isEnabled()){
					et2.setEnabled(false);
					btn2.setText("启用EditText2");
				} else {
					et2.setEnabled(true);
					btn2.setText("禁用EditText2");
				}
				
			}
		});
		btn2w.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View v){
					if(et2w.isEnabled()){
						et2w.setEnabled(false);
						btn2w.setText("启用EditText2");
					} else {
						et2w.setEnabled(true);
						btn2w.setText("禁用EditText2");
					}

				}
			});
		btn_set_bg2.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v){
					
					if(activityfourthTextView1.getVisibility() == View.GONE){
						activityfourthLinearLayout2.setBackgroundResource(R.drawable.lockscreen_107);
						activityfourthTextView1.setVisibility(View.VISIBLE);
					}else{
						activityfourthLinearLayout2.setBackgroundResource(R.drawable.lockscreen_006);
						activityfourthTextView1.setVisibility(View.GONE);

					}
				}	
			});
	}
	
	private void SetAppTitle()
	{
		// TODO: Implement this method
		title_bar_btn_left = (Button)findViewById(R.id.title_bar_btn_left);
		title_bar_title = (TextView) findViewById(R.id.title_bar_title);
		title_bar_btn_left.setText("↩返回");
		title_bar_title.setText("EditText文本框");
		title_bar_btn_left.setOnClickListener(new OnClickListener ()
			{
				@Override
				public void onClick(View v){
					finish();
				}
			});
    }
}
