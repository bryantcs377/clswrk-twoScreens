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

        //change

        //difference

    }

    protected void btnClicked(View view) {

        Intent intent = new Intent(this,ShowMessage.class);

        EditText txt = (EditText) findViewById(R.id.editText);
        String msg = txt.getText().toString();
        intent.putExtra("message",msg);
        startActivity(intent);

    }
}
