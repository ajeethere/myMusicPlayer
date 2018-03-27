package com.example.ajeet.mymusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class songsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView song1,song2,song3,song4,song5;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs_list);
        song1=(TextView) findViewById(R.id.Song1);
        song2=(TextView) findViewById(R.id.Song2);
        song3=(TextView) findViewById(R.id.Song3);
        song4=(TextView) findViewById(R.id.Song4);
        song5=(TextView) findViewById(R.id.Song5);
        song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"song-1",Toast.LENGTH_LONG).show();
                Intent i=new Intent(songsListActivity.this,Player.class);
                startActivity(i);
            }
        });
        song2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"song-2",Toast.LENGTH_LONG).show();
                Intent i=new Intent(songsListActivity.this,Player.class);
                startActivity(i);
            }
        });
        song3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"song-3",Toast.LENGTH_LONG).show();
                Intent i=new Intent(songsListActivity.this,Player.class);
                startActivity(i);
            }
        });
        song4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"song-4",Toast.LENGTH_LONG).show();
                Intent i=new Intent(songsListActivity.this,Player.class);
                startActivity(i);
            }
        });
        song5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"song-5",Toast.LENGTH_LONG).show();
                Intent i=new Intent(songsListActivity.this,Player.class);
                startActivity(i);
            }
        });
    }
}
