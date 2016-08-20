package com.controller.obd.myobdapp.Adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.controller.obd.myobdapp.Items.GenericItem;
import com.controller.obd.myobdapp.R;

import java.util.List;

/**
 * Created by silve on 19/08/2016.
 */
public class HomeAdapter extends BaseAdapter{

    private Context context;
    private List<GenericItem> items;

    public HomeAdapter(Context context, List<GenericItem> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() { return this.items.size(); }

    @Override
    public Object getItem(int position) { return this.items.get(position); }

    @Override
    public long getItemId(int position) { return position; }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;

        if (convertView == null) {
            // Create a new view into the list.
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.list_generic, parent, false);
        }

        // Set data into the view.
        ImageView home_image = (ImageView)rowView.findViewById(R.id.list_image);
        TextView home_name = (TextView) rowView.findViewById(R.id.list_name);
        TextView home_data = (TextView) rowView.findViewById(R.id.list_data);



        GenericItem item = this.items.get(position);

        //comparar el item.getImage_ID
        /*
        int drawable = 0;
        if (item.getImage_ID() == 0)
            drawable = R.drawable.ic_info_black_24dp;
        else if (item.getImage_ID() == 1)
            drawable = R.drawable.ic_info_black_24dp;
        else if (item.getImage_ID() == 2)
            drawable = R.drawable.ic_info_black_24dp;
        else if (item.getImage_ID() == 4)
            drawable = R.drawable.ic_info_black_24dp;
        */
        home_image.setImageResource(R.drawable.ic_menu_camera);

        home_name.setText(item.getName());
        home_data.setText(item.getInstruction() + ": " + item.getData());

        return rowView;
    }


}
