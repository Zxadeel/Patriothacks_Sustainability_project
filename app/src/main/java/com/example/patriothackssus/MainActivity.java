package com.example.patriothackssus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int bottlecount = 0;
    int cancount = 0;
    int papercount =0;
    TextView helloTextView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewActivity();
            }
        });
         helloTextView = (TextView) findViewById(R.id.textView10);
    }

    public void increasebottlecount(View view) {
        bottlecount++;
        helloTextView.setText(Integer.toString(bottlecount));

    }

    public void increaespapercount(View view) {
        papercount++;
        helloTextView.setText("" + papercount );
    }

    public void openNewActivity(){
        Intent intent = new Intent(this, SUCC.class);
        startActivity(intent);
    }

    public void increasecancount(View view) {
        cancount++;
        helloTextView.setText("" + cancount);
    }
}