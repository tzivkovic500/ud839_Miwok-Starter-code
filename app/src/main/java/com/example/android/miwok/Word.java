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

    /** Audio resource ID for the word */
    private int mAudioResourceId;


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
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;

    }

    /**
         * Create a new Word object.
          *
          * @param defaultTranslation is the word in a language that the user is already familiar with
          *                           (such as English)
          * @param miwokTranslation is the word in the Miwok language
          * @param miwokImageResourceId is the drawable resource ID for the image associated with the word
          * @param audioResourceId is the resource ID for the audio file associated with this word
          *
          */

    public Word(String defaultTranslation, String miwokTranslation, int miwokImageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = miwokImageResourceId;
        mAudioResourceId = audioResourceId;


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
    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

}