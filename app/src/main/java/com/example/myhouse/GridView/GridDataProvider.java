package com.example.myhouse.GridView;

import android.content.Context;
import android.graphics.drawable.Drawable;

import com.example.myhouse.R;

import java.util.ArrayList;
import java.util.List;

public class GridDataProvider {

    private List<GridCellModel> cells;

    public GridDataProvider(Context context) {
        cells = new ArrayList<>();

        addNewModel(context, "Łazienka", R.drawable.bath);
        addNewModel(context, "Sypialnia", R.drawable.bed);
        addNewModel(context, "Kuchnia", R.drawable.fridge);
    }


    private void addNewModel(Context context, String name, int imageID) {
        Drawable image = context.getDrawable(imageID);
        GridCellModel model = new GridCellModel(name, image);
        cells.add(model);
    }

    public GridCellModel getDataForCellAtIndex(int index) {
        return cells.get(index);
    }

    public int getNumberOfItems() {
        return cells.size();
    }
}
