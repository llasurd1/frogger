package com.example.frogger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button play, instructions, leader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = findViewById(R.id.button_play);
        instructions = findViewById(R.id.button_instructions);
        leader = findViewById(R.id.button_leaderboards);
    }
    public void switch_activitesPlay(View view) {
        Intent act_action =  new Intent(this, game.class);
        startActivity(act_action);
    }
    public void switch_activitesInst(View view) {
        Intent act_action =  new Intent(this, game.class);
        startActivity(act_action);
    }
    public void switch_activitesLead(View view) {
        Intent act_action =  new Intent(this, leaderboard.class);
        startActivity(act_action);
    }
}