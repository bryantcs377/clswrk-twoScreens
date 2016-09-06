package com.example.chrisbennett.twoscreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class ShowMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);

        Intent intent = getIntent();
        String msg = intent.getStringExtra("message");
        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setText(msg);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_show_message);
        layout.addView(textView);

    }
}
