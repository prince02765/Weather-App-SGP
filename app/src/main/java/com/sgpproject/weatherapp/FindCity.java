package com.sgpproject.weatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FindCity extends AppCompatActivity {

    ImageButton backButton;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_city);
        final EditText editText = findViewById(R.id.searchCity);

        backButton = findViewById(R.id.btn_back);
        relativeLayout = findViewById(R.id.Find_layout);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().toString().equals("")){
                    Toast.makeText(FindCity.this, "Enter City Name", Toast.LENGTH_SHORT).show();
                }
                else{
                    String newCity = editText.getText().toString();
                    Intent intent = new Intent(FindCity.this, MainActivity.class);
                    intent.putExtra("City", newCity);
                    startActivity(intent);
                }
            }
        });
    }
}