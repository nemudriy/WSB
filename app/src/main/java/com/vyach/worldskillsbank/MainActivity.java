package com.vyach.worldskillsbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
TextView currentData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button signin = findViewById(R.id.signInBtn);
        currentData = findViewById(R.id.data_now);
        getCurrentDate();

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SigninDialogFragment dialog = new SigninDialogFragment();
                dialog.show(getSupportFragmentManager(), "custom");

            }
        });
    }
    public void getCurrentDate(){
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();
        currentData.setText(dateFormat.format(date));
    }
}