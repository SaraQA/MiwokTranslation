package com.example.android.miwoktranslation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        // Create an array of words
        ArrayList<Word> words = new ArrayList<Word>() ;
        Word w = new Word("one","lutti",R.drawable.number_one) ;
        words.add(w) ;

        words.add(new Word("two", "otiiko", R.drawable.number_two)) ;
        words.add(new Word("three", "tolookosu", R.drawable.number_three)) ;
        words.add(new Word("four", "whatever", R.drawable.number_four)) ;


        //LinearLayout rootView  = findViewById(R.id.rootView) ;
       /* for(int i=0; i< words.size() ; i++) {
            TextView wordView = new TextView(this) ;
            wordView.setText(words.get(i));
            rootView.addView(wordView);
        }*/

        WordAdapter itemsAdapter = new WordAdapter(this,words) ;
        ListView listview = findViewById(R.id.list) ;
        listview.setAdapter(itemsAdapter);


    }
}
