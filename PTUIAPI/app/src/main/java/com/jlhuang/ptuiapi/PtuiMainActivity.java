package com.jlhuang.ptuiapi;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.widget.AdapterView.*;
import com.jlhuang.uiapi.*;

public class PtuiMainActivity extends Activity
{
	private String[] PtuiMainActivityData = { "Apple", "Banana", "Chocolate", "Pancake",
		"Hambuger", "Dumplings", "Tomato", "Noodles", "Sandwich", "Bread", 
		"Potato", "Pear", "Icecream", "Lollipop", "Egg", "Milk", "Beef", "Coffee", 
		"Watermelon", "Orange", "Tea", "Juice", "Cake", "Salad" ,"Marshmallow", 
		"Grape", "Rice", "Fish"};
//	private Button ptuiTitleBack;
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
		setContentView(R.layout.ptui_main);
		initPtuiView();
		ptuiTitleTextView.setText("Fruits");
		ptuiTitleRightBtn1.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					Toast.makeText(PtuiMainActivity.this, "You clicked appuiTitleRightBtn1", Toast.LENGTH_SHORT).show();
				}
			});
		ptuiTitleRightBtn2.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					Toast.makeText(PtuiMainActivity.this, "You clicked appuiTitleRightBtn2", Toast.LENGTH_SHORT).show();
				}
			});
		ptuiTitleRightBtn3.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					Toast.makeText(PtuiMainActivity.this, "You clicked appuiTitleRightBtn3", Toast.LENGTH_SHORT).show();
				}
			});
		ptuiTitleRightBtn4.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					Toast.makeText(PtuiMainActivity.this, "You clicked appuiTitleRightBtn4", Toast.LENGTH_SHORT).show();
				}
			});
		ArrayAdapter<String> PtuiAdapter = new ArrayAdapter<String>(
			PtuiMainActivity.this, android.R.layout.simple_list_item_1, PtuiMainActivityData);
		ListView PtuiListview = (ListView) findViewById(R.id.ptui_main_ListView);
		PtuiListview.setAdapter(PtuiAdapter);
		PtuiListview.setOnItemClickListener(new OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
										long arg3)
				{
					Toast.makeText(PtuiMainActivity.this, "You clicked " + PtuiMainActivityData[arg2], Toast.LENGTH_SHORT).show();
					Intent i = new Intent(PtuiMainActivity.this, PtuiSecondActivity.class);
					startActivity(i);
				}
			});
	}
	public void initPtuiView()
	{
//		ptuiTitleBack = (Button)findViewById(R.id.ptuiTitleBack);
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
		ptuiTitleRightBtnText1.setText("Button1");
		ptuiTitleRightBtn1.setImageResource(R.drawable.ic_search_black_24dp);
		ptuiTitleRightBtnFrame2.setVisibility(View.VISIBLE);
		ptuiTitleRightBtnText2.setText("Button2");
	}
}
