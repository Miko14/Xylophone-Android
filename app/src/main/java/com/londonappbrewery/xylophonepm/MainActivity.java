package com.londonappbrewery.xylophonepm;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSoundPool;
    private SoundPool mSoundPoolNEW;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        //Newer version of SoundPool, requires API 21!
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes aa = new AudioAttributes.Builder()
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .setUsage(AudioAttributes.USAGE_GAME)
                    .build();
            mSoundPoolNEW = new SoundPool.Builder()
                    .setMaxStreams(7)
                    .setAudioAttributes(aa)
                    .build();
        } else {
            mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);
        }

        // TODO: Load and get the IDs to identify the sounds
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            //Newer version of soundPool, but load process is the same
            mCSoundId = mSoundPoolNEW.load(getApplicationContext(), R.raw.note1_c,1);
            mDSoundId = mSoundPoolNEW.load(getApplicationContext(), R.raw.note2_d, 1);
            mESoundId = mSoundPoolNEW.load(getApplicationContext(), R.raw.note3_e, 1);
            mFSoundId = mSoundPoolNEW.load(getApplicationContext(), R.raw.note4_f, 1);
            mGSoundId = mSoundPoolNEW.load(getApplicationContext(), R.raw.note5_g, 1);
            mASoundId = mSoundPoolNEW.load(getApplicationContext(), R.raw.note6_a, 1);
            mBSoundId = mSoundPoolNEW.load(getApplicationContext(), R.raw.note7_b, 1);
        } else {
            mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note1_c, 1);
            mDSoundId = mSoundPool.load(getApplicationContext(), R.raw.note2_d, 1);
            mESoundId = mSoundPool.load(getApplicationContext(), R.raw.note3_e, 1);
            mFSoundId = mSoundPool.load(getApplicationContext(), R.raw.note4_f, 1);
            mGSoundId = mSoundPool.load(getApplicationContext(), R.raw.note5_g, 1);
            mASoundId = mSoundPool.load(getApplicationContext(), R.raw.note6_a, 1);
            mBSoundId = mSoundPool.load(getApplicationContext(), R.raw.note7_b, 1);
        }
    }

    // TODO: Add the play methods triggered by the buttons
    public void playC(View v) {
        Log.d("Xylophone", "Red Button Clicked!");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mSoundPoolNEW.play(mCSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
        } else {
            mSoundPool.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
        }
    }

    public void playD(View v) {
        Log.d("Xylophone", "Orange Button Clicked!");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mSoundPoolNEW.play(mDSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
        } else {
            mSoundPool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
        }
    }

    public void playE(View v) {
        Log.d("Xylophone", "Yellow Button Clicked!");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mSoundPoolNEW.play(mESoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
        } else {
            mSoundPool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
        }
    }

    public void playF(View v) {
        Log.d("Xylophone", "Green Button Clicked!");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mSoundPoolNEW.play(mFSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
        } else {
            mSoundPool.play(mFSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
        }
    }

    public void playG(View v) {
        Log.d("Xylophone", "Turquoise Button Clicked!");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mSoundPoolNEW.play(mGSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
        } else {
            mSoundPool.play(mGSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
        }
    }

    public void playA(View v) {
        Log.d("Xylophone", "Blue Button Clicked!");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mSoundPoolNEW.play(mASoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
        } else {
            mSoundPool.play(mASoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
        }
    }

    public void playB(View v) {
        Log.d("Xylophone", "Purple Button Clicked!");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mSoundPoolNEW.play(mBSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
        } else {
            mSoundPool.play(mBSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
        }
    }
}
