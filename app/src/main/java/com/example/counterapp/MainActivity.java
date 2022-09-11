package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int counter=0;
     //   Button count=(Button) findViewById(R.id.btn_count);
       text= findViewById(R.id.textView);
       text.setText("0");
    }

    Integer counter=0;
    public void Count(View view) {
     counter+=1;
     String str= counter.toString();
     text.setText(str);

    }
    public void Toast(View view) {
        String message="Welcome to my first app";
        Toast toast=Toast.makeText(this,message,Toast.LENGTH_LONG);
        toast.show();
    }
    public void Reset(View view) {
        text.setText("0");
    }
}