package com.example.android.miwok;

/**
 * Created by Tea on 24.3.2018..
 */


/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** Miwok for get imagees*/
    private int mImageResourceId;

    /**
     * Create a new Word object. Word je Constractor.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }
    /**
     * Get the default translation method of the word.
     */
    public String getDefaultTranslation()
    {return mDefaultTranslation;}
    /**
     * Get the Miwok translation method of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

}