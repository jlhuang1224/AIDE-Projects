package com.jlhuang.uiapi;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.widget.AdapterView.*;
import com.jlhuang.uiapi.*;

public class AppUiDemoActivity extends Activity
{
	private String[] AppUiData = { "Apple", "Banana", "Chocolate", "Pancake",
		"Hambuger", "Dumplings", "Tomato", "Noodles", "Sandwich", "Bread", 
		"Potato", "Pear", "Icecream", "Lollipop", "Egg", "Milk", "Beef", "Coffee", 
		"Watermelon", "Orange", "Tea", "Juice", "Cake", "Salad" ,"Marshmallow", 
		"Grape", "Rice", "Fish"};

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.appui_demo);
		ArrayAdapter<String> AppUiAdapter = new ArrayAdapter<String>(
			AppUiDemoActivity.this, android.R.layout.simple_list_item_1, AppUiData);
		ListView AppUiListview = (ListView) findViewById(R.id.appuidemoListView1);
		AppUiListview.setAdapter(AppUiAdapter);
		AppUiListview.setOnItemClickListener(new OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
										long arg3)
				{
					if (arg2 == 0)
					{
					}
					else
					{
						if (arg2 == 1)
						{
						}
						else
						{
							if (arg2 == 2)
							{
							}
							else
							{
								if (arg2 == 3)
								{
								}
							}
						}
					}
				}
			});
	}
}
//appuidemoListView1
