package com.javatar.uitestingexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle(R.string.toolbar_title);

        final Button helloButton = (Button) findViewById(R.id.helloButton);
        helloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helloButton.setEnabled(false);
            }
        });
    }
}
