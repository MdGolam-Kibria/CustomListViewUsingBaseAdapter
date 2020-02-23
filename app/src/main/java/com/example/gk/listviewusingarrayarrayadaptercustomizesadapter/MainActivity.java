package com.example.gk.listviewusingarrayarrayadaptercustomizesadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String itemName[];
    int flags[] = {R.drawable.amazon, R.drawable.android,
            R.drawable.apple, R.drawable.chrome, R.drawable.css, R.drawable.cycle,
            R.drawable.gmail, R.drawable.intel, R.drawable.windows, R.drawable.paypal,
            R.drawable.linux, R.drawable.studenthat};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.list);
        itemName = getResources().getStringArray(R.array.Array_item);
        CustomAdapter custom = new CustomAdapter(this,itemName,flags);//this is an basrAdapter class object
        list.setAdapter(custom);
    }


}
