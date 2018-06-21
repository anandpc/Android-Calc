package com.techieandy.anand.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView input = findViewById(R.id.input),result = findViewById(R.id.ans);
    Button AC,C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void all_clear(View view) {
            input.setText("0");
            result.setText("0");
    }

    public void clear(View view) {
            input.setText("0");
    }
}

