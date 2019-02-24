package com.example.myhouse.GridView;

import android.graphics.drawable.Drawable;
import android.media.Image;

public class GridCellModel {
    private String name;
    private Drawable image;

    public GridCellModel(String name, Drawable image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public Drawable getImage() {
        return image;
    }
}
