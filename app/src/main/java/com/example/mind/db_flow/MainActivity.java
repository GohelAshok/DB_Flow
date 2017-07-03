package com.example.mind.db_flow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mind.db_flow.dbconfig.DbConfig;
import com.example.mind.db_flow.modelconfig.StudentDetail;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.raizlabs.android.dbflow.structure.ModelAdapter;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText _name,_age;
    Button _insert,_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FlowManager.init(getApplicationContext());
        setContentView(R.layout.activity_main);


        _name=(EditText)findViewById(R.id._name);
        _age=(EditText)findViewById(R.id._age);
        _insert=(Button)findViewById(R.id._insert);
        _show=(Button)findViewById(R.id._show);

        _insert.setOnClickListener(this);
        _show.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
       if (view==_insert)
       {
           if (_name.getText().toString().trim().equals("")||_age.getText().toString().trim().equals(""))
           {
               if (_name.getText().toString().trim().equals(""))
               {
                   _name.setError("Please enter name");
               }
               if (_age.getText().toString().trim().equals(""))
               {
                   _age.setError("Please enter age");
               }
           }
           else {
//            ModelAdapter<StudentDetail> studentDetail=FlowManager.getModelAdapter(StudentDetail.class);
//            studentDetai1

               //studentDetail=new StudentDetail()
               // ;
//            Toast.makeText(this, studentDetail.getTableName(),Toast.LENGTH_SHORT).show();

               StudentDetail studentDetail = new StudentDetail();
               studentDetail.setName(_name.getText().toString());
               studentDetail.setAge(_age.getText().toString());
               studentDetail.insert();
               Toast.makeText(this, "Inserted", Toast.LENGTH_SHORT).show();
               _name.setText("");
               _age.setText("");

           }
       }
       if (view==_show)
       {
           Intent intent=new Intent(MainActivity.this,ShowData.class);
           startActivity(intent);
       }
    }
}
