package com.example.listviewcustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] countryNames;

    int[] flags = {R.drawable.america, R.drawable.austria, R.drawable.azerbaijan,
            R.drawable.canada, R.drawable.georgia, R.drawable.nepal, R.drawable.netherlands,
            R.drawable.red_crse, R.drawable.suriname, R.drawable.turkey,

            R.drawable.america, R.drawable.austria, R.drawable.azerbaijan,
            R.drawable.canada, R.drawable.georgia, R.drawable.nepal, R.drawable.netherlands,
            R.drawable.red_crse, R.drawable.suriname, R.drawable.turkey};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryNames = getResources().getStringArray(R.array.countryName);

        listView = findViewById(R.id.listViewId);

        CustomAdapter adapter = new CustomAdapter(this, countryNames, flags);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = countryNames[i];
                Toast.makeText(MainActivity.this, i, Toast.LENGTH_SHORT).show();
            }
        });
    }
}