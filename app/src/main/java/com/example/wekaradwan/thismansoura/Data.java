package com.example.wekaradwan.thismansoura;

/**
 * Created by weka radwan on 2/15/2018.
 */

/**
 * this Data class contiant the text and data image
 */
public class Data {

    /**
     * String resource ID for the title TextView @bigText
     */
    private int bigText;
    /**
     * String resource ID for the content TextView @smallText
     */
    private int smallText;
    /**
     * int resource ID for the image
     */
    private int image;

    /**
     * create data object*
     *
     * @param firstText  that's will have the title text
     * @param secondText that's will have the content text
     * @param i          that's will have the image
     */
    public Data(int firstText, int secondText, int i) {
        bigText = firstText;
        smallText = secondText;
        image = i;
    }

    /**
     * get the text for Title textView
     */
    public int getBigText() {
        return bigText;
    }

    /**
     * get the text for the content textView
     */
    public int getSmallText() {
        return smallText;
    }

    /**
     * get the image
     */
    public int getImage() {
        return image;
    }
}
