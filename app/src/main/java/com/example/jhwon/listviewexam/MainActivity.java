package com.example.jhwon.listviewexam;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.R.drawable;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listview = (ListView) findViewById(R.id.my_listview);
        ListViewAdapter listview_adapter = new ListViewAdapter(this);
        for(int i = 0; i < 150; i++){
            ListViewItem newItem = new ListViewItem();
            newItem.setDrawable_icon(ContextCompat.getDrawable(this,drawable.ic_lock_lock + i));
            newItem.setStr_desc(Integer.toString(i));
            newItem.setDrawable_icon2(ContextCompat.getDrawable(this,drawable.ic_lock_lock + i+150));
            newItem.setStr_desc2(Integer.toString(i+150));
            listview_adapter.addItem(newItem);
        }
        listview.setAdapter(listview_adapter);
        listview.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        ListViewItem item = (ListViewItem) adapterView.getItemAtPosition(i);
                        Toast.makeText(getApplicationContext(),item.getStr_desc(),Toast.LENGTH_SHORT).show();
                    }
                }

        );
    }
}
