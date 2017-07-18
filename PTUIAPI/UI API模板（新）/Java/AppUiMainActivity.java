package com.jlhuang.uiapi;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.widget.AdapterView.*;
import com.jlhuang.uiapi.*;

public class AppUiMainActivity extends Activity
{
	private String[] AppUiData = { "Apple", "Banana", "Chocolate", "Pancake",
		"Hambuger", "Dumplings", "Tomato", "Noodles", "Sandwich", "Bread", 
		"Potato", "Pear", "Icecream", "Lollipop", "Egg", "Milk", "Beef", "Coffee", 
		"Watermelon", "Orange", "Tea", "Juice", "Cake", "Salad" ,"Marshmallow", 
		"Grape", "Rice", "Fish"};
//	private Button appuiTitleBack;
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
		setContentView(R.layout.appui_main);
		initAppuiView();
		/*		appuiTitleBack.setOnClickListener(new OnClickListener()
		 {
		 @Override
		 public void onClick(View v)
		 {
		 finish();
		 }
		 });*/
		appuiTitleTextView.setText("Fruits");
		appuiTitleRightBtn1.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					Toast.makeText(AppUiMainActivity.this, "You clicked appuiTitleRightBtn1", Toast.LENGTH_SHORT).show();
				}
			});
		appuiTitleRightBtn2.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					Toast.makeText(AppUiMainActivity.this, "You clicked appuiTitleRightBtn2", Toast.LENGTH_SHORT).show();
				}
			});
		appuiTitleRightBtn3.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					Toast.makeText(AppUiMainActivity.this, "You clicked appuiTitleRightBtn3", Toast.LENGTH_SHORT).show();
				}
			});
		appuiTitleRightBtn4.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					Toast.makeText(AppUiMainActivity.this, "You clicked appuiTitleRightBtn4", Toast.LENGTH_SHORT).show();
				}
			});
		ArrayAdapter<String> AppUiAdapter = new ArrayAdapter<String>(
			AppUiMainActivity.this, android.R.layout.simple_list_item_1, AppUiData);
		ListView AppUiListview = (ListView) findViewById(R.id.appuidemoListView1);
		AppUiListview.setAdapter(AppUiAdapter);
		AppUiListview.setOnItemClickListener(new OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
										long arg3)
				{
					Toast.makeText(AppUiMainActivity.this, "You clicked " + AppUiData[arg2] + "，不过，还没做好呢。。。敬请期待！谢谢！", Toast.LENGTH_SHORT).show();
//					Intent i = new Intent(AppUiMainActivity.this, AppUiSecondActivity.class);
//					startActivity(i);
				}
			});
	}
	public void initAppuiView()
	{
//		appuiTitleBack = (Button)findViewById(R.id.appuiTitleBack);
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
		appuiTitleRightBtnText1.setText("Button1");
		appuiTitleRightBtn1.setImageResource(R.drawable.ic_round_btn);
		appuiTitleRightBtnFrame2.setVisibility(View.VISIBLE);
		appuiTitleRightBtnText2.setText("Button2");
	}
}
//appuidemoListView1
