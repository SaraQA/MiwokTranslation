package com.example.android.miwoktranslation;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Sara on 04/04/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> w) {
        super(context,0,w) ;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView ;
        if(listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }
        Word w = getItem(position);

        TextView eng = listView.findViewById(android.R.id.text1)  ;
        eng.setText(w.getDefaultTranslation());

        TextView miwok = listView.findViewById(android.R.id.text2) ;
        miwok.setText(w.getMiwokTranslation());

        ImageView image = listView.findViewById(R.id.image) ;
        image.setImageResource(w.getImageResourceId());

        return listView;
    }
}
