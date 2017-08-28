package com.anhvu.datastructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anhvu.datastructure.datastructure.LinkedList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinkedList linkedList = new LinkedList(1);

        linkedList.insertToStart(3);
        linkedList.insertToStart(2);
        linkedList.print();

        linkedList.insertToEnd(5);
        linkedList.print();


        linkedList.remove(3);
        linkedList.print();
    }
}
