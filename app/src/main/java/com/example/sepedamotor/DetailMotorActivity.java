package com.example.sepedamotor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailMotorActivity extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_motor);

        ImageView leftIconDetail = findViewById(R.id.left_icon_detail);
        TextView titleDetail = findViewById(R.id.toolbar_tittle_detail);

        leftIconDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(DetailMotorActivity.this, MainActivity.class);
                startActivity(moveIntent);
            }
        });

        ImageView imgMotor = findViewById(R.id.imgMotor);
        TextView tvMotorName = findViewById(R.id.tvmotorName);
        TextView tvMotorHarga = findViewById(R.id.tvMotorHarga);
        TextView tvMotorDetail = findViewById(R.id.tvMotorDetail);

        Motor motor = getIntent().getParcelableExtra(ITEM_EXTRA);
        if (motor != null){
            Glide.with(this)
                    .load(motor.getPhoto())
                    .into(imgMotor);
            tvMotorName.setText(motor.getName());
            tvMotorHarga.setText(motor.getHarga());
            tvMotorDetail.setText(motor.getDetail());
        }
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Motor");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}