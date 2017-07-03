package com.example.mind.db_flow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.mind.db_flow.Adapter.CustomAdapter;
import com.example.mind.db_flow.modelconfig.StudentDetail;
import com.raizlabs.android.dbflow.sql.language.SQLite;

import java.util.ArrayList;
import java.util.List;

public class ShowData extends AppCompatActivity {

    ListView _data;
    ArrayList<StudentDetail> arrayList;
    List<StudentDetail> list;
    StudentDetail studentDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);
        _data=(ListView)findViewById(R.id._data);
        ShowSubject();
    }

    public void ShowSubject()
    {

        arrayList=new ArrayList<>();

        list = SQLite.select()
                .from(StudentDetail.class)
                .queryList();

        for (int i=0;i<list.size();i++)
        {
            studentDetail=list.get(i);
            arrayList.add(studentDetail);
        }

        CustomAdapter customAdapter=new CustomAdapter(ShowData.this,arrayList);
        _data.setAdapter(customAdapter);
    }
}
