package sg.edu.rp.c346.id20045524.demotodolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class CustomAdapter extends ArrayAdapter<ToDoItem> {

    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> toDoList;

    public CustomAdapter(Context context, int resource,  ArrayList<ToDoItem> objects){
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        toDoList = objects;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object - Get
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row - Read
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding - Find and Bind
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);

        // Obtain the Android Version information based on the position - Find
        ToDoItem currentToDo = toDoList.get(position);

        // Set values to the TextView to display the corresponding information - Populate
        tvTitle.setText(currentToDo.getTitle());
        Calendar todayDate = Calendar.getInstance();
        todayDate.set(2022,7,21);

        if (currentToDo.getDate().before(todayDate)){
            tvDate.setText(currentToDo.getDateString());
            tvDate.setTextColor(parent_context.getResources().getColor(R.color.red));
        } else {
            tvDate.setText(currentToDo.getDateString());
        }


        return rowView;
    }



}
