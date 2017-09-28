package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by amarpreet911 on 9/26/17.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake>{

    EarthquakeAdapter(Context context, List<Earthquake> earthquakes){
        super (context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.one_row, parent, false);
        }
        Earthquake currentEarthquake = getItem(position);

        TextView magnitude = (TextView)  listItemView.findViewById(R.id.magnitude);
        magnitude.setText(currentEarthquake.getmMagnitude());

        TextView location = (TextView)  listItemView.findViewById(R.id.location);
        location.setText(currentEarthquake.getmLocation());

        TextView date = (TextView)  listItemView.findViewById(R.id.date);
        date.setText(currentEarthquake.getmData());

        return listItemView;
    }
}
