package com.astzz.uberdriver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ProfileActivity extends AppCompatActivity {

    LinearLayout savesettig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        savesettig = findViewById(R.id.save_setting);

    }
}