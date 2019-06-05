package com.example.testtask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button addLine,deleteLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        addLine = findViewById(R.id.addButton);
        deleteLine = findViewById(R.id.deleteButton);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        deleteLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
}
