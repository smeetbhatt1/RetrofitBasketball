package com.example.smeetbhatt.retrofitbasketball;

import com.google.gson.annotations.SerializedName;

/**
 * Created by smeetbhatt on 12/09/17.
 */

public class Basketball {
    @SerializedName("name")
    private String Name;

    @SerializedName("image_path")
    private String Image_path;

    @SerializedName("rank")
    private int Rank;

    public String getName() {
        return Name;
    }

    public String getImage_path() {
        return Image_path;
    }

    public int getRank() {
        return Rank;
    }
}
