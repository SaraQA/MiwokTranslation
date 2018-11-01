package com.example.android.miwoktranslation;

import android.view.View;
import android.widget.Toast;

/**
 * Created by Sara on 26/03/2018.
 */

public class NumbersClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(),"Opening Numbers List" , Toast.LENGTH_SHORT).show();
    }
}
