package com.example.trafficlight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout = findViewById(R.id.constraintLayout);
    }

    public void onRedButtonClick(View view) {
        constraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));
    }

    public void onYellowButtonClick(View view) {
        constraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor));
    }

    public void onGreenButtonClick(View view) {
        constraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
    }
}