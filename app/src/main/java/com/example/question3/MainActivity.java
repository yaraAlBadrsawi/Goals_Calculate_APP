package com.example.question3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button add,sub;
    int count=0;
    private TextView counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.add=findViewById(R.id.add);
        this.sub=findViewById(R.id.sub);
        this.counter=findViewById(R.id.counter);
        this.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setText(count++ +"" );
            }
        });

        this.sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.setText(count-- +"");
            }
        });
    }


}
