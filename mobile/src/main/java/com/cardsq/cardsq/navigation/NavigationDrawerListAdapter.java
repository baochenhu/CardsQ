package com.cardsq.cardsq.navigation;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cardsq.cardsq.R;

import java.util.ArrayList;

/**
 * Created by lzhu on 1/10/15.
 */
public class NavigationDrawerListAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<NavigationDrawerListItem> navigationDrawerListItems;

    public NavigationDrawerListAdapter(Context context, ArrayList<NavigationDrawerListItem> navigationDrawerListItems){
        this.context = context;
        this.navigationDrawerListItems = navigationDrawerListItems;
    }

    @Override
    public int getCount() {
        return navigationDrawerListItems.size();
    }

    @Override
    public Object getItem(int position) {
        return navigationDrawerListItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater)
                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.navigation_drawer_list_item, null);
        }

        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.icon);
        TextView txtTitle = (TextView) convertView.findViewById(R.id.title);
       // TextView txtCount = (TextView) convertView.findViewById(R.id.counter);

        imgIcon.setImageResource(navigationDrawerListItems.get(position).getIcon());
        txtTitle.setText(navigationDrawerListItems.get(position).getTitle());

//        // displaying count
//        // check whether it set visible or not
//        if(navigationDrawerListItems.get(position).getCounterVisibility()){
//            txtCount.setText(navigationDrawerListItems.get(position).getCount());
//        }else{
//            // hide the counter view
//            txtCount.setVisibility(View.GONE);
//        }

        return convertView;
    }
}

