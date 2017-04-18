package com.example.pablo.giftbook;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<Object> {

    private final Activity context;
    private final ArrayList<Object> objeto;
    private final Integer[]imgid;

    public CustomListAdapter(Activity context, ArrayList<Object> objeto, Integer[] imgid) {
        super(context, R.layout.list, objeto);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.objeto= objeto;
        this.imgid=imgid;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);

        //String nombreObjeto = objeto.toString();

        txtTitle.setText("holaa");
        imageView.setImageResource(imgid[0]);
        extratxt.setText("chao");
        return rowView;

    };
}