package com.example.sepedamotor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMotor;
    private ArrayList<Motor> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMotor = findViewById(R.id.rv_Motor);
        rvMotor.setHasFixedSize(true);

        list.addAll(MotorDetail.getListData());
        showRecyclerList();

        ImageView rightIcon = findViewById(R.id.Right_icon);
        TextView title = findViewById(R.id.toolbar_tittle);

        rightIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(moveIntent);
            }
        });
        title.setText("List Sepeda Motor");
    }

    private void showRecyclerList(){
        rvMotor.setLayoutManager(new LinearLayoutManager(this));
        ListMotorAdaptor listmotoradaptor = new ListMotorAdaptor(list);
        rvMotor.setAdapter(listmotoradaptor);

        listmotoradaptor.setOnItemClickCallback(new ListMotorAdaptor.OnItemClickCallback() {
            @Override
            public void onItemClicked(Motor motor) {
                Intent moveIntent = new Intent(MainActivity.this,DetailMotorActivity.class);
                moveIntent.putExtra(DetailMotorActivity.ITEM_EXTRA, motor);
                startActivity(moveIntent);
            }
        });
    }


}