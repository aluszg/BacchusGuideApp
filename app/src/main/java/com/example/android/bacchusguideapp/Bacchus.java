package com.example.android.bacchusguideapp;

public class Bacchus {
    /**
     * Name of the Bacchus
     */
    private String mName;

    /**
     * Image of the Bacchus
     */
    private int mImageResourceId;

    /**
     * Description of the Bacchus
     */
    private String mDescription;

    /**
     * Author of the Bacchus
     */
    private String mAuthor;

    /**
     * Founder of the Bacchus
     */
    private String mFounder;

    /**
     * Constructs a new {@link Bacchus} object.
     *
     * @param name            is the name of the Bacchus
     * @param imageResourceId is the image of the Bacchus
     * @param description     is the description of the Bacchus
     * @param author          is the Author of the Bacchus
     * @param founder         is the Founder of the Bacchus
     */

    public Bacchus(String name, int imageResourceId, String description, String author, String founder) {
        mName = name;
        mImageResourceId = imageResourceId;
        mDescription = description;
        mAuthor = author;
        mFounder = founder;
    }

    /**
     * Returns the name of the Bacchus
     */
    public String getName() {
        return mName;
    }


    /**
     * Get the image of the Bacchus
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


    /**
     * Returns the description of the Bacchus
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Returns the Author of the Bacchus
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Returns the Founder of the Bacchus
     */
    public String getFounder() {
        return mFounder;
    }
}

