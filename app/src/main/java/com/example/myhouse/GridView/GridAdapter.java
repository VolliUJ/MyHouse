package com.example.myhouse.GridView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myhouse.R;

public class GridAdapter extends BaseAdapter {

    private Context context;
    private GridDataProvider gridDataProvider;

    public GridAdapter(Context context, GridDataProvider gridDataProvider) {
        this.context = context;
        this.gridDataProvider = gridDataProvider;
    }

    @Override
    public int getCount() {
        return gridDataProvider.getNumberOfItems();
    }

    @Override
    public Object getItem(int position) {
        return gridDataProvider.getDataForCellAtIndex(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 1
        final GridCellModel model = gridDataProvider.getDataForCellAtIndex(position);

        // 2
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.grid_single_item, null);
        }

        // 3

        final ImageView imageView = convertView.findViewById(R.id.button_image);
        final TextView nameTextView = convertView.findViewById(R.id.button_name);

        // 4
        imageView.setImageDrawable(model.getImage());
        nameTextView.setText(model.getName());

        return convertView;
    }
}