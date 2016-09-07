package com.example.chrisbennett.twoscreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    protected void btnClicked(View view) {

        Intent intent = new Intent(this,ShowMessage.class);
// this references public class MainActivity
        EditText txt = (EditText) findViewById(R.id.editText);
        String msg = txt.getText().toString();
        intent.putExtra("message",msg);
        startActivity(intent);

    }
}
