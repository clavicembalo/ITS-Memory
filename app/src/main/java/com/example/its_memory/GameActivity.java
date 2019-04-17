package com.example.its_memory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    int[] cards = new int[16];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        // init Cards

        for (int i=0; i<8; i++){
            cards[i] = i;
            cards[i+8] = i;
        }

        // Shuffle Cards

        Random rnd = new Random();
        for (int i=0; i<16; i++){
            //random
            int r = rnd.nextInt(16);

            //swap
            int tmp = cards[i];
            cards[i] = cards[r];
            cards[r] = tmp;
        }
    }
}
