package com.example.frogger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class leaderboard extends AppCompatActivity {

    ListView lead;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leaderboard);
        back = findViewById(R.id.button_leaderboards_back);
    }
    public void switch_activites(View view) {
        Intent act_action =  new Intent(this, MainActivity.class);
        startActivity(act_action);
    }
}