package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_ask = findViewById(R.id.btn_ask);
        final ImageView img_ball = findViewById(R.id.img_eight_ball);
        final int[] array_ball = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        btn_ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand_no_gen = new Random();
                int rand_no = rand_no_gen.nextInt(5);
                Log.d("Magic Eight Ball", "The number generated is " + rand_no);

                img_ball.setImageResource(array_ball[rand_no]);
            }
        });

    }
}
