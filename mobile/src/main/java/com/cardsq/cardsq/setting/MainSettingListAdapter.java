package com.cardsq.cardsq.setting;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cardsq.cardsq.R;

import java.util.ArrayList;

/**
 * Created by lzhu on 1/10/15.
 */
public class MainSettingListAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<MainSettingListItem> mainSettingListItems;

    public MainSettingListAdapter(Context context, ArrayList<MainSettingListItem> mainSettingListItems){
        this.context = context;
        this.mainSettingListItems = mainSettingListItems;
    }

    @Override
    public int getCount() {
        return mainSettingListItems.size();
    }

    @Override
    public Object getItem(int position) {
        return mainSettingListItems.get(position);
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
            convertView = mInflater.inflate(R.layout.main_setting_list_item, null);
        }

        TextView txtTitle = (TextView) convertView.findViewById(R.id.setting_title);

        txtTitle.setText(mainSettingListItems.get(position).getTitle());

        return convertView;
    }
}