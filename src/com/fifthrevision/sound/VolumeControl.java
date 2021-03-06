package com.fifthrevision.sound;

import android.util.Log;

public class VolumeControl extends Unit {

	public static int MAX = 100;
	public static int MIN = 0;
	
	public float multiplier;
	
	public Unit setVolume(int volume) {
		if(volume < MIN) {
			volume = MIN;
		} else if (volume > MAX) {
			volume = MAX;
		}
		multiplier = ((float) volume) / MAX;
	// 	Log.d("TEST", "test " + multiplier);
		return this;
	}

	@Override
	public Unit render(float[] buffer) {
		for(int i = 0; i < buffer.length; i++) {
			buffer[i] *= multiplier;
		}
//		Log.d("TEST", "" + buffer[0]);

		return this;
	}

}
