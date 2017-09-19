package com.example.mihail.startandroid_training;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView  thisText;

    Button Button;

    String a = "This text";
    String b = "Hello World!";
    String parseText = "..";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button = (Button) findViewById(R.id.Button);

        thisText = (TextView) findViewById(R.id.thisText);

        Button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        parseText = thisText.getText().toString();

        if (parseText == b) {
            thisText.setText(a);
        } else {
            thisText.setText(b);
        }

    }
}
