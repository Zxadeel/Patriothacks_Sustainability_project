package com.example.patriothackssus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ANIMATION_TEST extends AppCompatActivity {
    ImageView ani_tst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_test);

        ani_tst = (ImageView) findViewById(R.id.animation_test);

    }
}