package com.example.android.miwoktranslation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumbersClickListener nCL = new NumbersClickListener() ;

        TextView numbers = findViewById(R.id.numbers) ;
        TextView colors = findViewById(R.id.colors) ;

        numbers.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Opening Numbers List" , Toast.LENGTH_SHORT).show() ;
                Intent i = new Intent(MainActivity.this , NumbersActivity.class) ;
                startActivity(i);
            }
        });

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                Toast.makeText(v.getContext(),"Opening Colors list",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, ColorsActivity.class) ;
                startActivity(i);
            }
        });
    }


}
