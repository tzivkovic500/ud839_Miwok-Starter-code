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

    /** Image resouce ID for the word*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

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

    /**
         * Create a new Word object.
          *
          * @param defaultTranslation is the word in a language that the user is already familiar with
          *                           (such as English)
          * @param miwokTranslation is the word in the Miwok language
          * @param miwokImageResourceId is the drawable resource ID for the image associated with the word
          *
          */

    public Word(String defaultTranslation, String miwokTranslation, int miwokImageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = miwokImageResourceId;

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

    /**
     +     * Returns whether or not there is an image for this word.
     +     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}