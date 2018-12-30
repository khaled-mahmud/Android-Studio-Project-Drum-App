package com.sdmgap07.khaled.playdrum;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    MediaPlayer hat1, rim, hat2, sdstl1, sdstl2, sdstl3, crash1, snare, crash2, tom1, kick, tom2;
    Button hat1Button, rimButton, hat2Button, sdstl1Button, sdstl2Button, sdstl3Button,
            crash1Button, snareButton, crash2Button, tom1Button, kickButton, tom2Button;

    //SoundPool mySoundpool;
    //int hat1Sound, rimSound, hat2Sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hat1Button = findViewById(R.id.hat1_button);
        rimButton = findViewById(R.id.rim_button);
        hat2Button = findViewById(R.id.hat2_button);
        sdstl1Button = findViewById(R.id.sdstl1_button);
        sdstl2Button = findViewById(R.id.sdstl2_button);
        sdstl3Button = findViewById(R.id.sdstl3_button);
        crash1Button = findViewById(R.id.crash1_button);
        snareButton = findViewById(R.id.snare_button);
        crash2Button = findViewById(R.id.crash2_button);
        tom1Button = findViewById(R.id.tom1_button);
        kickButton = findViewById(R.id.kick_button);
        tom2Button = findViewById(R.id.tom2_button);

        hat1Button.setOnClickListener(this);
        rimButton.setOnClickListener(this);
        hat2Button.setOnClickListener(this);
        sdstl3Button.setOnClickListener(this);
        sdstl2Button.setOnClickListener(this);
        sdstl3Button.setOnClickListener(this);
        crash1Button.setOnClickListener(this);
        snareButton.setOnClickListener(this);
        crash2Button.setOnClickListener(this);
        tom1Button.setOnClickListener(this);
        kickButton.setOnClickListener(this);
        tom2Button.setOnClickListener(this);

        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            AudioAttributes audioAttributes = new AudioAttributes.Builder().setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION).build();
            mySoundpool = new SoundPool.Builder()
                    .setMaxStreams(12)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            mySoundpool = new SoundPool(12, AudioManager.STREAM_MUSIC, 1);
        }


        hat1Sound = mySoundpool.load(getApplicationContext(), R.raw.hat1, 1);
        rimSound = mySoundpool.load(getApplicationContext(), R.raw.rim, 1);
        hat2Sound = mySoundpool.load(getApplicationContext(), R.raw.hat2, 1);*/


        hat1 = MediaPlayer.create(MainActivity.this, R.raw.hat1);
        rim = MediaPlayer.create(MainActivity.this, R.raw.rim);
        hat2 = MediaPlayer.create(MainActivity.this, R.raw.hat2);
        sdstl1 = MediaPlayer.create(MainActivity.this, R.raw.sdstd1);
        sdstl2 = MediaPlayer.create(MainActivity.this, R.raw.sdstd2);
        sdstl3 = MediaPlayer.create(MainActivity.this, R.raw.sdstd3);
        crash1 = MediaPlayer.create(MainActivity.this, R.raw.crash1);
        snare = MediaPlayer.create(MainActivity.this, R.raw.snare);
        crash2 = MediaPlayer.create(MainActivity.this, R.raw.crash2);
        tom1 = MediaPlayer.create(MainActivity.this, R.raw.tom1);
        kick = MediaPlayer.create(MainActivity.this, R.raw.kick);
        tom2 = MediaPlayer.create(MainActivity.this, R.raw.tom2);
    }


    @Override
    public void onClick(View view) {

        if(view.equals(hat1Button)){
            //mySoundpool.play(hat1Sound, 1.0f, 1.0f, 0, 0, 2f);
            hat1.start();
        }

        else if(view.equals(rimButton)){
            //mySoundpool.play(rimSound, 1.0f, 1.0f, 0, 0, 2f);
            rim.start();
        }

        else if(view.equals(hat2Button)){
            //mySoundpool.play(hat2Sound, 1.0f, 1.0f, 0, 0, 1.0f);
            hat2.start();
        }
        else if(view.equals(sdstl1Button)){
            sdstl1.start();
        }

        else if(view.equals(sdstl2Button)){
            sdstl2.start();
        }

        else if(view.equals(sdstl3Button)){
            sdstl3.start();
        }

        else if(view.equals(crash1Button)){
            crash1.start();
        }

        else if(view.equals(snareButton)){
            snare.start();
        }

        else if(view.equals(crash2Button)){
            crash2.start();
        }

        else if(view.equals(tom1Button)){
            tom1.start();
        }

        else if(view.equals(kickButton)){
            kick.start();
        }

        else if(view.equals(tom2Button)){
            tom2.start();
        }

    }
}
