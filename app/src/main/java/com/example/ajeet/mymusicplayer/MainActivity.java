package com.example.ajeet.mymusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button musicP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        musicP=(Button) findViewById(R.id.toMusicPlayer);
        musicP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,songsListActivity.class);
                Toast.makeText(getApplicationContext(),"songs list",Toast.LENGTH_LONG).show();
                startActivity(i);
            }
        });
    }
}
