package com.example.mc_lab10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Spinner spinner;
    ArrayList<Object> list= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.tv_1);
        spinner=findViewById(R.id.spin_1);
        list.add(19);
        list.add(20);
        list.add(21);
        list.add(22);

        ArrayAdapter<int>


    }
}