package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.listView);

        final String[] myFamily= {"Harry","Ben","Dodie","Allen"};
        // ArrayAdapter(Context context, int resource --> this is how things will be displayed, T[] objects --> this can be an array or a list
        ArrayAdapter<String> familyAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, myFamily);
        //link the listView to the Adapter
        myListView.setAdapter(familyAdapter);
        //interaction with list
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //adapterView is the entire list view, view the individual view clicked, int the position in the array
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("The name Clicked was",myFamily[i]);
            }
        });
    }
}