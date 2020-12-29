package com.hfad.gameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {

    private Button playAgainButton, visitHomeScreentButton, exitGameButton;
    private TextView score_TV;
    private String Score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        playAgainButton = (Button) findViewById(R.id.play_again_button);
        visitHomeScreentButton = (Button) findViewById(R.id.home);
        exitGameButton = (Button) findViewById(R.id.game_over_exit);
        score_TV = (TextView) findViewById(R.id.game_score_tv);

        Score = getIntent().getExtras().get("Score").toString();

        playAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent playAgainIntent = new Intent(GameOverActivity.this, MainActivity.class);
                startActivity(playAgainIntent);
            }
        });

        score_TV.setText(Score);

        visitHomeScreentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent visitHomeScreentIntent = new Intent(GameOverActivity.this, GameStartActivity.class);
                startActivity(visitHomeScreentIntent);
            }
        });

        exitGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
    }
}
