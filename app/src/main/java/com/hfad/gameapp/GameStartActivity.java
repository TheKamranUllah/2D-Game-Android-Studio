package com.hfad.gameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GameStartActivity extends AppCompatActivity {

    private Button gameStartButton, gameSettingButton, gameExitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start);

        gameStartButton = (Button) findViewById(R.id.start_button);
        gameSettingButton = (Button) findViewById(R.id.setting_button);
        gameExitButton = (Button) findViewById(R.id.exit_button);

        gameStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gameStartIntent = new Intent(GameStartActivity.this, MainActivity.class);
                startActivity(gameStartIntent);
            }
        });

        gameSettingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(GameStartActivity.this, "Setting is not available now", Toast.LENGTH_SHORT).show();
            }
        });

        gameExitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
    }
}
