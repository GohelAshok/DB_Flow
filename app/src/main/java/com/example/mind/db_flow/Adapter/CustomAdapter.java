package com.example.mind.db_flow.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mind.db_flow.R;
import com.example.mind.db_flow.modelconfig.StudentDetail;

import java.util.ArrayList;

/**
 * Created by mind on 3/7/17.
 */

public class CustomAdapter extends BaseAdapter {

    Context context;
    ArrayList<StudentDetail>  arrayList;

    public CustomAdapter(Context context, ArrayList<StudentDetail> arrayList) {
        this.context=context;
        this.arrayList=arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(R.layout.layout,null);
        TextView textView=(TextView)view.findViewById(R.id.textView);
        textView.setText(arrayList.get(i).getName());


        TextView textView1=(TextView)view.findViewById(R.id.textView2);
        textView1.setText(arrayList.get(i).getAge());


        return view;
    }
}
