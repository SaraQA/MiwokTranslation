package com.example.android.miwoktranslation;

/**
 * Created by Sara on 04/04/2018.
 */

public class Word {
    private String mDefaultTranslation ;
    private String mMiwokTranslation ;
    private int mImageResourceId ;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation= defaultTranslation ;
        mMiwokTranslation = miwokTranslation ;

    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation= defaultTranslation ;
        mMiwokTranslation = miwokTranslation ;
        mImageResourceId = imageResourceId ;

    }




    public String getDefaultTranslation() {
        return mDefaultTranslation ;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation ;
    }

    public int getImageResourceId() {
        return mImageResourceId ;
    }
}
