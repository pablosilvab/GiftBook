package com.example.pablo.giftbook.Actividades;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.pablo.giftbook.R;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Pablo on 20/06/2016.
 */
public class MoviesAdapter extends BaseExpandableListAdapter {

    private Context ctx;
    private HashMap <String, List<String>> Movies_Category;
    private List<String> Movies_List;

    public MoviesAdapter(Context ctx, HashMap<String, List<String>> movies_Category, List<String> movies_List) {
        this.ctx = ctx;
        Movies_Category = movies_Category;
        Movies_List = movies_List;
    }

    @Override
    public int getGroupCount() {
        return Movies_List.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return Movies_Category.get(Movies_List.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return Movies_List.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {

        return Movies_Category.get(Movies_List.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {

        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String group_tittle = (String) getGroup(groupPosition);
        if (convertView == null){
            LayoutInflater inflator = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflator.inflate(R.layout.parent_layout, parent, false);
        }
        TextView parent_textView = (TextView) convertView.findViewById(R.id.TEXTVIEW_PARENT);
        parent_textView.setTypeface(null, Typeface.BOLD);
        parent_textView.setText(group_tittle);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String child_tittle = (String) getChild(groupPosition, childPosition);
        if (convertView == null){
            LayoutInflater inflator = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflator.inflate(R.layout.child_layout, parent,false);
        }
        TextView child_textView = (TextView) convertView.findViewById(R.id.TEXTVIEW_CHILD);
        child_textView.setText(child_tittle);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
