package com.example.felixidan.sessionone;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by idan on 08/11/15.
 */
public class ColorEntriesAdapter extends ArrayAdapter<ColorEntry> {


    public ColorEntriesAdapter(Context context, ColorEntry[] colors) {
        super(context, 0, colors);
    }

//    VERSION WITHOUT VIEWHOLDERS
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        // Get the data item for this position
//        ColorEntry color = getItem(position);
//        // Check if an existing view is being reused, otherwise inflate the view
//        if (convertView == null) {
//            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_color, parent, false);
//        }
//        // Lookup view for data population
//        TextView name = (TextView) convertView.findViewById(R.id.coloritem_name);
//        TextView detail = (TextView) convertView.findViewById(R.id.coloritem_detail);
//        FrameLayout swatch = (FrameLayout) convertView.findViewById(R.id.coloritem_swatch);
//
//        // Populate the data into the template view using the data object
//        name.setText(color.getName());
//        detail.setText(color.getColor());
//        swatch.setBackgroundColor(Color.parseColor(color.getColor()));
//
//        // Return the completed view to render on screen
//        return convertView;
//    }

    //    VERSION WITH VIEWHOLDERS
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        ColorEntry color = getItem(position);
        ViewHolder holder;
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_color, parent, false);
            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.coloritem_name);
            holder.detail = (TextView) convertView.findViewById(R.id.coloritem_detail);
            holder.swatch = (FrameLayout) convertView.findViewById(R.id.coloritem_swatch);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        // Populate the data into the template view using the data object
        holder.name.setText(color.getName());
        holder.detail.setText(color.getColor());
        holder.swatch.setBackgroundColor(Color.parseColor(color.getColor()));

        // Return the completed view to render on screen
        return convertView;
    }

    private static class ViewHolder{
        TextView name;
        TextView detail;
        FrameLayout swatch;
    }
}
