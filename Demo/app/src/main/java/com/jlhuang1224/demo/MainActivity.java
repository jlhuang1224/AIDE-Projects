package com.jlhuang1224.demo;

import android.app.*;
import android.content.*;
import android.media.*;
import android.os.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		AudioManager audioManager = (AudioManager) this.getSystemService(AUDIO_SERVICE);
		i = new Intent(AudioService.ACTION_REMOTE_PAUSE);
    }
}
