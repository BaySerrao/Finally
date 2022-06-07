package com.example.androidlabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<ToDo> toDoArrayList;
    ArrayAdapter<ToDo> arrayAdapter;
    ListAdapter listAdapter;
    ListView lv1;
    EditText et1;
    private Object ToDo;
    ToDo t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.et1);
        toDoArrayList =  new ArrayList<ToDo>();
        listAdapter = new ListAdapter(this,android.R.layout.activity_list_item, toDoArrayList);
        lv1 = (ListView)findViewById(R.id.lv1);
        lv1.setAdapter(listAdapter);
        Switch sw1 = (Switch) findViewById(R.id.sw1);
        Button btn = (Button) findViewById(R.id.b1);
        

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
            EditText et1 = (EditText)findViewById(R.id.et1);
            Switch sw1 = (Switch) findViewById(R.id.sw1);
            ToDo newToDo = new ToDo(et1.getText(),sw1.isChecked());
            listAdapter.add(newToDo);
            listAdapter.notifyDataSetChanged();
            et1.setText("");

        }
        });
        }
    public void addItemToList(View view){
        EditText et1 = (EditText)findViewById(R.id.et1);
        Switch sw1 = (Switch) findViewById(R.id.sw1);
        ToDo newToDo = new ToDo(et1.getText(),sw1.isChecked());
        listAdapter.add(newToDo);
        listAdapter.notifyDataSetChanged();
        et1.setText("");
    }






}