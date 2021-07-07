package com.example.sepedamotor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView leftIconDetail = findViewById(R.id.left_icon_profile);
        TextView titleDetail = findViewById(R.id.toolbar_tittle_profile);

        leftIconDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(moveIntent);
            }
        });
    }
}