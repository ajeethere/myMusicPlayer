package com.example.ajeet.mymusicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class Player extends AppCompatActivity {
    MediaPlayer myPlayer;
    Button previuos,play,next,stp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        previuos=(Button) findViewById(R.id.pre);
        play=(Button) findViewById(R.id.pl);
        next=(Button) findViewById(R.id.nxt);
        stp=(Button) findViewById(R.id.stp);
        myPlayer=MediaPlayer.create(this,R.raw.song1);
        myPlayer.setLooping(true);

        previuos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myPlayer=MediaPlayer.create(getApplicationContext(),R.raw.song1);
                myPlayer.setLooping(true);
                myPlayer.start();
            }
        });
        stp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myPlayer.stop();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myPlayer.stop();
                myPlayer=MediaPlayer.create(getApplicationContext(),R.raw.song2);
                myPlayer.setLooping(true);
                myPlayer.start();

            }
        });
    }
}
