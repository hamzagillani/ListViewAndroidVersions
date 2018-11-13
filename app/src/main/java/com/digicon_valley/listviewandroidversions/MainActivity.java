package com.digicon_valley.listviewandroidversions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> adapter;

    String[] android_versions={"Cupcake","Donut","Eclair"
            ,"Froyo","Gingerbread","Honeycomb",
            "Ice Cream Sandwich","Jelly Bean","KitKat"
            ,"Lollipop","Marshmallow","Oreo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        adapter=new ArrayAdapter<String>(this,R.layout.list_view_couston_view,R.id.list_item,android_versions);
        //adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android_versions);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getBaseContext(),"You Click On "+(parent.getItemIdAtPosition(position)+1),Toast.LENGTH_SHORT).show();
            view.setSelected(true);
            }
        });


    }
}
