package com.example.musicplayerapp;
import android.os.Bundle;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startMusicButton = findViewById(R.id.startMusicButton);
        Button stopMusicButton = findViewById(R.id.stopMusicButton);
        startMusicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,
                        MusicService2.class);
                startService(intent); // Start the foreground service
            }
        });
        stopMusicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,
                        MusicService2.class);
                stopService(intent); // Stop the foreground service
            }
        });
    }
}