package com.example.a126308.demodatabase;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 126308 on 12/5/2017.
 */

public class TaskArrayAdapter extends ArrayAdapter<Task> {

    private ArrayList<Task> taskResult;
    private TextView tvID;
    private TextView tvDesc;
    private TextView tvDate;
    private Context context;

    public TaskArrayAdapter(Context context, int resource, ArrayList<Task> objects) {
        super(context, resource, objects);

        taskResult = objects;

        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvID = (TextView) rowView.findViewById(R.id.textViewID);
        tvDesc = (TextView) rowView.findViewById(R.id.textViewDesc);
        tvDate = (TextView) rowView.findViewById(R.id.textViewDate);

        Task currentTask = taskResult.get(position);

        tvID.setText(currentTask.getId() + "");
        tvDesc.setText(currentTask.getDescription());
        tvDate.setText(currentTask.getDate());



        return rowView;
    }
}
