package com.example.android.miwoktranslation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> color_words = new ArrayList<Word>() ;
        color_words.add(new Word("Black","Perfect", R.drawable.color_black)) ;
        color_words.add(new Word("Maroon","my love", R.drawable.color_red)) ;
        color_words.add(new Word("Pink","Love",R.drawable.color_gray)) ;

        WordAdapter colorAdapter = new WordAdapter(this,color_words) ;

        ListView colorView = findViewById(R.id.colorList) ;

        colorView.setAdapter(colorAdapter);
    }
}
