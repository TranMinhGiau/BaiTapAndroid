package com.example.student.myapplication;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import static android.graphics.Color.RED;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contact> lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = (ListView)findViewById(R.id.lvContact);
        lst = new ArrayList<Contact>();

        lst.add(new Contact("abc","1990", Color.RED,Color.BLUE));
        lst.add(new Contact("aaa","1990", Color.RED,Color.BLUE));
        lst.add(new Contact("bbb","1990", Color.RED,Color.BLUE));
        lst.add(new Contact("ccc","1990", Color.RED,Color.BLUE));
        CustomAdapter customAdaper = new CustomAdapter(this,R.layout.row,lst);
        lvContact.setAdapter(customAdaper);
    }
}
