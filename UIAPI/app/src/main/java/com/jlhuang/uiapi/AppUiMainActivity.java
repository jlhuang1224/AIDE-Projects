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
	private ImageButton appuiTitleRightBtn1;

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
					Toast.makeText(AppUiMainActivity.this, "You clicked the right button", Toast.LENGTH_SHORT).show();
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
					Toast.makeText(AppUiMainActivity.this, "You clicked " + AppUiData[arg2], Toast.LENGTH_SHORT).show();
					Intent i = new Intent (AppUiMainActivity.this,AppUiSecondActivity.class);
					startActivity(i);
					
				}
			});
	}
	public void initAppuiView()
	{
//		appuiTitleBack = (Button)findViewById(R.id.appuiTitleBack);
		appuiTitleTextView = (TextView)findViewById(R.id.appuiTitleTextView);
		appuiTitleRightBtn1 = (ImageButton)findViewById(R.id.appuiTitleRightBtn1);
	}
}
//appuidemoListView1
