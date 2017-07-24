package sg.edu.rp.c346.colorlist;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15045617 on 24/7/2017.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Colour> boxList;
    public CustomAdapter(Context context, int resource, ArrayList<Colour> objects){
        super(context, resource, objects);

        parent_context=context;
        layout_id=resource;
        boxList=objects; //change this
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInfalter object
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);

        // Step 2 Obtain the UI Elements and assign to variables
        TextView tvColour = (TextView) rowView.findViewById(R.id.textViewColour);
        ImageView ivBox1=(ImageView) rowView.findViewById(R.id.imageViewBox);



        // Obtain the to-do item based on the 'position'.
        Colour currentItem = boxList.get(position);

        tvColour.setText(currentItem.getColour());
        if(currentItem.getColour().equals("blue")){
           ivBox1.setImageResource(R.drawable.blue_box);
       }
       else if(currentItem.getColour().equals("orange")){
            ivBox1.setImageResource(R.drawable.orange_box);
        }
        else{
           ivBox1.setImageResource(R.drawable.brown_box);
       }
       return rowView;
    }












}

