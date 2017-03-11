package com.jlhuang1224.demo;

import android.content.*;
import android.os.*;
import android.view.*;

public class RemoteControlClientReceiver extends BroadcastReceiver
{
    @SuppressWarnings("unused")
    private static final String TAG = "mythou_ACTION_MEDIA_BUTTON";

    /*
     * It should be safe to use static variables here once registered via the
     * AudioManager
     */
    private static long mHeadsetDownTime = 0;
    private static long mHeadsetUpTime = 0;

    @Override
    public void onReceive(Context context, Intent intent)
    {
		//获取对应Acton，判断是否是需要的ACTION_MEDIA_BUTTON
        String action = intent.getAction();if (action.equalsIgnoreCase(Intent.ACTION_MEDIA_BUTTON))
        {
            KeyEvent event = (KeyEvent) intent
				.getParcelableExtra(Intent.EXTRA_KEY_EVENT);
            if (event == null)
                return;

            if (event.getKeyCode() != KeyEvent.KEYCODE_HEADSETHOOK
				&& event.getKeyCode() != KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE
				&& event.getAction() != KeyEvent.ACTION_DOWN)
                return;

            Intent i = null;
            switch (event.getKeyCode())
            {
					/*
					 * one click => play/pause long click => previous double click =>
					 * next
					 */
					//这里根据按下的时间和操作，分离出具体的控制
				case KeyEvent.KEYCODE_HEADSETHOOK:
				case KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE:
					long time = SystemClock.uptimeMillis();
					switch (event.getAction())
					{
						case KeyEvent.ACTION_DOWN:
							if (event.getRepeatCount() > 0)
								break;
							mHeadsetDownTime = time;
							break;
						case KeyEvent.ACTION_UP:
							// long click
							if (time - mHeadsetDownTime >= 1000)
							{
								i = new Intent(AudioService.ACTION_REMOTE_BACKWARD);
								time = 0;
								// double click
							} else if (time - mHeadsetUpTime <= 500)
							{
								i = new Intent(AudioService.ACTION_REMOTE_FORWARD);
							}
							// one click
							else
							{
								if (mLibVLC.isPlaying())
									i = new Intent(AudioService.ACTION_REMOTE_PAUSE);
								else
									i = new Intent(AudioService.ACTION_REMOTE_PLAY);
							}
							mHeadsetUpTime = time;
							break;
					}
					break;
					//下面是常规的播放、暂停、停止、上下曲　
				case KeyEvent.KEYCODE_MEDIA_PLAY:
					i = new Intent(AudioService.ACTION_REMOTE_PLAY);
					break;
				case KeyEvent.KEYCODE_MEDIA_PAUSE:
					i = new Intent(AudioService.ACTION_REMOTE_PAUSE);
					break;
				case KeyEvent.KEYCODE_MEDIA_STOP:
					i = new Intent(AudioService.ACTION_REMOTE_STOP);
					break;
				case KeyEvent.KEYCODE_MEDIA_NEXT:
					i = new Intent(AudioService.ACTION_REMOTE_FORWARD);
					break;
				case KeyEvent.KEYCODE_MEDIA_PREVIOUS:
					i = new Intent(AudioService.ACTION_REMOTE_BACKWARD);
					break;
            }

            if (isOrderedBroadcast())
                abortBroadcast();
            if (i != null)
                context.sendBroadcast(i);
        }
    }
}
