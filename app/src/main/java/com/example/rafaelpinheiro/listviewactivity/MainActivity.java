package com.example.rafaelpinheiro.listviewactivity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView listViewMyList;
    private String[] myList = {"The Offspring", "Evanescence", "Daughtry", "Red Hot Chili Peppers", "System of a Down", "Nickelback", "Paramore", "Foo Fighters", "Fall Out Boy", "Scorpions", "All That Remains"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewMyList = (ListView) findViewById(R.id.listViewMyListId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, myList);

        listViewMyList.setAdapter(adapter);

        listViewMyList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int clickedPositionIndex = position;
                String textClickedPositionIndex = (String) listViewMyList.getItemAtPosition(clickedPositionIndex);


                Toast.makeText(MainActivity.this, textClickedPositionIndex, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
